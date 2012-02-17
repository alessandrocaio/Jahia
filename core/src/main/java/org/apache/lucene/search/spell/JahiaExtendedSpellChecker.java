package org.apache.lucene.search.spell;

import java.io.IOException;
import java.util.Iterator;

import org.apache.lucene.analysis.WhitespaceAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Hits;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.spell.SpellChecker;
import org.apache.lucene.search.spell.StringDistance;
import org.apache.lucene.search.spell.SuggestWord;
import org.apache.lucene.search.spell.SuggestWordQueue;
import org.apache.lucene.store.Directory;

public class JahiaExtendedSpellChecker extends SpellChecker {

    public static final String F_LANGUAGE = "language";

    public static final String F_SITE = "site";

    // minimum score for hits generated by the spell checker query
    private float minScore = 0.5f;

    /**
     * Boost value for start and end grams
     */
    private float bStart = 2.0f;

    private float bEnd = 1.0f;

    private IndexSearcher searcher;

    /**
     * Use the given directory as a spell checker index. The directory is
     * created if it doesn't exist yet.
     * 
     * @param spellIndex
     * @throws IOException
     */
    public JahiaExtendedSpellChecker(Directory spellIndex, StringDistance sd) throws IOException {
        super(spellIndex, sd);
    }

    public JahiaExtendedSpellChecker(Directory spellIndex) throws IOException {
        super(spellIndex);
    }

    /**
     * Suggest similar words (optionally restricted to a field of an index).
     * 
     * <p>
     * As the Lucene similarity that is used to fetch the most relevant
     * n-grammed terms is not the same as the edit distance strategy used to
     * calculate the best matching spell-checked word from the hits that Lucene
     * found, one usually has to retrieve a couple of numSug's in order to get
     * the true best match.
     * 
     * <p>
     * I.e. if numSug == 1, don't count on that suggestion being the best one.
     * Thus, you should set this value to <b>at least</b> 5 for a good
     * suggestion.
     * 
     * @param word
     *            the word you want a spell check done on
     * @param numSug
     *            the number of suggested words
     * @param ir
     *            the indexReader of the user index (can be null see field
     *            param)
     * @param field
     *            the field of the user index: if field is not null, the
     *            suggested words are restricted to the words present in this
     *            field.
     * @param morePopular
     *            return only the suggest words that are as frequent or more
     *            frequent than the searched word (only if restricted mode =
     *            (indexReader!=null and field!=null)
     * @throws IOException
     * @return String[] the sorted list of the suggest words with these 2
     *         criteria: first criteria: the edit distance, second criteria
     *         (only if restricted mode): the popularity of the suggest words in
     *         the field of the user index
     */
    public String[] suggestSimilar(String word, int numSug, IndexReader ir, String field, boolean morePopular,
            String site, String language) throws IOException {

        float min = this.minScore;
        final int lengthWord = word.length();

        final int freq = (ir != null && field != null) ? ir.docFreq(new Term(field, word)) : 0;
        final int goalFreq = (morePopular && ir != null && field != null) ? freq : 0;
        // if the word exists in the real index and we don't care for word
        // frequency, return the word itself
        if (!morePopular && freq > 0) {
            return new String[] { word };
        }

        BooleanQuery query = new BooleanQuery();
        String[] grams;
        String key;

        // ensure language
        if (language != null) {
            add(query, F_LANGUAGE, language, BooleanClause.Occur.MUST);
        }

        // ensure site
        if (site != null) {
            add(query, F_SITE, site, BooleanClause.Occur.MUST);
        }

        for (int ng = getMin(lengthWord); ng <= getMax(lengthWord); ng++) {

            key = "gram" + ng; // form key

            grams = formGrams(word, ng); // form word into ngrams (allow dups
            // too)

            if (grams.length == 0) {
                continue; // hmm
            }

            if (bStart > 0) { // should we boost prefixes?
                add(query, "start" + ng, grams[0], bStart); // matches start of
                // word

            }
            if (bEnd > 0) { // should we boost suffixes
                add(query, "end" + ng, grams[grams.length - 1], bEnd); // matches
                // end of
                // word

            }
            for (int i = 0; i < grams.length; i++) {
                add(query, key, grams[i]);
            }
        }

        // System.out.println("Q: " + query);
        IndexSearcher usedSearcher = searcher;
        Hits hits = null;
        boolean retry = true;
        while (retry) {
            try {
                hits = usedSearcher.search(query);
            } catch (IOException e) {
                if (retry && usedSearcher != searcher) {
                    usedSearcher = searcher;
                } else {
                    throw e;
                }
            } finally {
                retry = false;
            }
        }
        // System.out.println("HITS: " + hits.length());
        SuggestWordQueue sugQueue = new SuggestWordQueue(numSug);

        // go thru more than 'maxr' matches in case the distance filter triggers
        int stop = Math.min(hits.length(), 10 * numSug);
        SuggestWord sugWord = new SuggestWord();
        for (int i = 0; i < stop; i++) {

            sugWord.string = hits.doc(i).get(F_WORD + (language != null ? "-" + language : "")); // get
            // orig
            // word

            // don't suggest a word for itself, that would be silly
            if (sugWord.string == null || word.equals(sugWord.string)) {
                continue;
            }

            // edit distance
            sugWord.score = getStringDistance().getDistance(word, sugWord.string);
            if (sugWord.score < min) {
                continue;
            }

            if (ir != null && field != null) { // use the user index
                sugWord.freq = ir.docFreq(new Term(field, sugWord.string)); // freq
                // in
                // the
                // index
                // don't suggest a word that is not present in the field
                if ((morePopular && goalFreq > sugWord.freq) || sugWord.freq < 1) {
                    continue;
                }
            }
            sugQueue.insert(sugWord);
            if (sugQueue.size() == numSug) {
                // if queue full, maintain the minScore score
                min = ((SuggestWord) sugQueue.top()).score;
            }
            sugWord = new SuggestWord();
        }

        // convert to array string
        String[] list = new String[sugQueue.size()];
        for (int i = sugQueue.size() - 1; i >= 0; i--) {
            list[i] = ((SuggestWord) sugQueue.pop()).string;
        }

        return list;
    }

    private int getMin(int l) {
        if (l > 5) {
            return 3;
        }
        if (l == 5) {
            return 2;
        }
        return 1;
    }

    private int getMax(int l) {
        if (l > 5) {
            return 4;
        }
        if (l == 5) {
            return 3;
        }
        return 2;
    }

    /**
     * Sets the accuracy 0 &lt; minScore &lt; 1; default 0.5
     */
    public void setAccuracy(float minScore) {
        this.minScore = minScore;
        super.setAccuracy(minScore);
    }

    /**
     * Form all ngrams for a given word.
     * 
     * @param text
     *            the word to parse
     * @param ng
     *            the ngram length e.g. 3
     * @return an array of all ngrams in the word and note that duplicates are
     *         not removed
     */
    private static String[] formGrams(String text, int ng) {
        int len = text.length();
        String[] res = new String[len - ng + 1];
        for (int i = 0; i < len - ng + 1; i++) {
            res[i] = text.substring(i, i + ng);
        }
        return res;
    }

    /**
     * Add a clause to a boolean query.
     */
    private static void add(BooleanQuery q, String name, String value, float boost) {
        Query tq = new TermQuery(new Term(name, value));
        tq.setBoost(boost);
        q.add(new BooleanClause(tq, BooleanClause.Occur.SHOULD));
    }

    private static void add(BooleanQuery q, String name, String value, Occur occur) {
        q.add(new BooleanClause(new TermQuery(new Term(name, value)), occur));
    }

    /**
     * Add a clause to a boolean query.
     */
    private static void add(BooleanQuery q, String name, String value) {
        q.add(new BooleanClause(new TermQuery(new Term(name, value)), BooleanClause.Occur.SHOULD));
    }

    /**
     * Use a different index as the spell checker index or re-open the existing
     * index if <code>spellIndex</code> is the same value as given in the
     * constructor.
     * 
     * @param spellIndex
     * @throws IOException
     */
    public void setSpellIndex(Directory spellIndex) throws IOException {
        this.spellIndex = spellIndex;
        if (!IndexReader.indexExists(spellIndex)) {
            IndexWriter writer = new IndexWriter(spellIndex, null, true);
            writer.close();
        }
        // close the old searcher, if there was one
        reopenSearcher();
    }
    
    private void reopenSearcher() throws IOException {
        // create a new and close the old searcher
        IndexSearcher oldSearcher = searcher; 
        IndexSearcher newSearcher = new IndexSearcher(this.spellIndex);
        searcher = newSearcher;
        if (oldSearcher != null) {
            oldSearcher.close();      
        }
    }

    /**
     * Removes all terms from the spell check index.
     * 
     * @throws IOException
     */
    public void clearIndex() throws IOException {
        IndexWriter writer = new IndexWriter(spellIndex, null, true);
        writer.close();

        reopenSearcher();
    }

    /**
     * Check whether the word exists in the index.
     * 
     * @param word
     * @throws IOException
     * @return true iff the word exists in the index
     */
    public boolean exist(String word, String langCode, String site) throws IOException {
        BooleanQuery query = new BooleanQuery();
        add(query, F_WORD + (langCode != null ? "-" + langCode : ""), word, BooleanClause.Occur.MUST);
        add(query, F_SITE, site, BooleanClause.Occur.MUST);
        return searcher.search(query).length() > 0;
    }

    /**
     * Indexes the data from the given {@link Dictionary}.
     * 
     * @param dict
     *            Dictionary to index
     * @param mergeFactor
     *            mergeFactor to use when indexing
     * @param ramMB
     *            the max amount or memory in MB to use
     * @throws IOException
     */
    public void indexDictionary(Dictionary dict, int mergeFactor, int ramMB, String site, String langCode)
            throws IOException {
        IndexWriter writer = new IndexWriter(spellIndex, true, new WhitespaceAnalyzer());
        writer.setMergeFactor(mergeFactor);
        writer.setRAMBufferSizeMB(ramMB);

        Iterator<?> iter = dict.getWordsIterator();
        while (iter.hasNext()) {
            String word = (String) iter.next();

            int len = word.length();
            if (len < 3) {
                continue; // too short we bail but "too long" is fine...
            }

            if (this.exist(word, langCode, site)) { // if the word already exist in
                // the gramindex
                continue;
            }

            // ok index the word
            Document doc = createDocument(word, getMin(len), getMax(len), site, langCode);
            writer.addDocument(doc);
        }
        // close writer
        writer.optimize();
        writer.close();
        // also re-open the spell index to see our own changes when the next
        // suggestion is fetched:
        // create a new and close the old searcher
        IndexSearcher oldSearcher = searcher; 
        IndexSearcher newSearcher = new IndexSearcher(this.spellIndex);
        searcher = newSearcher;
        oldSearcher.close();
    }

    private static Document createDocument(String text, int ng1, int ng2, String site, String langCode) {
        Document doc = new Document();
        doc.add(new Field(F_WORD + (langCode != null ? "-" + langCode : ""), text, Field.Store.YES,
                Field.Index.NOT_ANALYZED)); // orig term
        doc.add(new Field(F_LANGUAGE, langCode, Field.Store.YES, Field.Index.NOT_ANALYZED)); // language        
        doc.add(new Field(F_SITE, site, Field.Store.YES, Field.Index.NOT_ANALYZED)); // site        
        addGram(text, doc, ng1, ng2);
        return doc;
    }

    private static void addGram(String text, Document doc, int ng1, int ng2) {
        int len = text.length();
        for (int ng = ng1; ng <= ng2; ng++) {
            String key = "gram" + ng;
            String end = null;
            for (int i = 0; i < len - ng + 1; i++) {
                String gram = text.substring(i, i + ng);
                doc.add(new Field(key, gram, Field.Store.NO, Field.Index.NOT_ANALYZED));
                if (i == 0) {
                    doc.add(new Field("start" + ng, gram, Field.Store.NO, Field.Index.NOT_ANALYZED));
                }
                end = gram;
            }
            if (end != null) { // may not be present if len==ng1
                doc.add(new Field("end" + ng, end, Field.Store.NO, Field.Index.NOT_ANALYZED));
            }
        }
    }
    
    public void close() throws IOException {
        if (searcher != null) {
            searcher.close();
        }
    }
}
