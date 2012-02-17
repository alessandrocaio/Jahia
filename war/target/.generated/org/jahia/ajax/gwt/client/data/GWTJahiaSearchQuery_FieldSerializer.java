package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaSearchQuery_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getBasePath(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::basePath;
  }-*/;
  
  private static native void  setBasePath(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::basePath = value;
  }-*/;
  
  private static native java.util.Date getEndCreationDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::endCreationDate;
  }-*/;
  
  private static native void  setEndCreationDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.Date value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::endCreationDate = value;
  }-*/;
  
  private static native java.util.Date getEndEditionDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::endEditionDate;
  }-*/;
  
  private static native void  setEndEditionDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.Date value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::endEditionDate = value;
  }-*/;
  
  private static native java.util.Date getEndPublicationDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::endPublicationDate;
  }-*/;
  
  private static native void  setEndPublicationDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.Date value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::endPublicationDate = value;
  }-*/;
  
  private static native java.util.List getFilters(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::filters;
  }-*/;
  
  private static native void  setFilters(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::filters = value;
  }-*/;
  
  private static native java.util.List getFolderTypes(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::folderTypes;
  }-*/;
  
  private static native void  setFolderTypes(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::folderTypes = value;
  }-*/;
  
  private static native boolean getInContents(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inContents;
  }-*/;
  
  private static native void  setInContents(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inContents = value;
  }-*/;
  
  private static native boolean getInFiles(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inFiles;
  }-*/;
  
  private static native void  setInFiles(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inFiles = value;
  }-*/;
  
  private static native boolean getInMetadatas(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inMetadatas;
  }-*/;
  
  private static native void  setInMetadatas(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inMetadatas = value;
  }-*/;
  
  private static native boolean getInName(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inName;
  }-*/;
  
  private static native void  setInName(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inName = value;
  }-*/;
  
  private static native boolean getInTags(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inTags;
  }-*/;
  
  private static native void  setInTags(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::inTags = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.GWTJahiaLanguage getLanguage(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::language;
  }-*/;
  
  private static native void  setLanguage(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, org.jahia.ajax.gwt.client.data.GWTJahiaLanguage value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::language = value;
  }-*/;
  
  private static native java.util.List getMimeTypes(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::mimeTypes;
  }-*/;
  
  private static native void  setMimeTypes(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::mimeTypes = value;
  }-*/;
  
  private static native java.util.List getNodeTypes(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::nodeTypes;
  }-*/;
  
  private static native void  setNodeTypes(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::nodeTypes = value;
  }-*/;
  
  private static native java.lang.String getOriginSiteUuid(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::originSiteUuid;
  }-*/;
  
  private static native void  setOriginSiteUuid(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::originSiteUuid = value;
  }-*/;
  
  private static native java.util.List getPages(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::pages;
  }-*/;
  
  private static native void  setPages(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::pages = value;
  }-*/;
  
  private static native java.lang.String getQuery(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::query;
  }-*/;
  
  private static native void  setQuery(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::query = value;
  }-*/;
  
  private static native java.util.List getSites(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::sites;
  }-*/;
  
  private static native void  setSites(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::sites = value;
  }-*/;
  
  private static native java.util.Date getStartCreationDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::startCreationDate;
  }-*/;
  
  private static native void  setStartCreationDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.Date value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::startCreationDate = value;
  }-*/;
  
  private static native java.util.Date getStartEditionDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::startEditionDate;
  }-*/;
  
  private static native void  setStartEditionDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.Date value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::startEditionDate = value;
  }-*/;
  
  private static native java.util.Date getStartPublicationDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::startPublicationDate;
  }-*/;
  
  private static native void  setStartPublicationDate(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.util.Date value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::startPublicationDate = value;
  }-*/;
  
  private static native java.lang.String getTimeInDays(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::timeInDays;
  }-*/;
  
  private static native void  setTimeInDays(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::timeInDays = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) throws SerializationException {
    setBasePath(instance, streamReader.readString());
    setEndCreationDate(instance, (java.util.Date) streamReader.readObject());
    setEndEditionDate(instance, (java.util.Date) streamReader.readObject());
    setEndPublicationDate(instance, (java.util.Date) streamReader.readObject());
    setFilters(instance, (java.util.List) streamReader.readObject());
    setFolderTypes(instance, (java.util.List) streamReader.readObject());
    setInContents(instance, streamReader.readBoolean());
    setInFiles(instance, streamReader.readBoolean());
    setInMetadatas(instance, streamReader.readBoolean());
    setInName(instance, streamReader.readBoolean());
    setInTags(instance, streamReader.readBoolean());
    setLanguage(instance, (org.jahia.ajax.gwt.client.data.GWTJahiaLanguage) streamReader.readObject());
    setMimeTypes(instance, (java.util.List) streamReader.readObject());
    setNodeTypes(instance, (java.util.List) streamReader.readObject());
    setOriginSiteUuid(instance, streamReader.readString());
    setPages(instance, (java.util.List) streamReader.readObject());
    setQuery(instance, streamReader.readString());
    setSites(instance, (java.util.List) streamReader.readObject());
    setStartCreationDate(instance, (java.util.Date) streamReader.readObject());
    setStartEditionDate(instance, (java.util.Date) streamReader.readObject());
    setStartPublicationDate(instance, (java.util.Date) streamReader.readObject());
    setTimeInDays(instance, streamReader.readString());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery instance) throws SerializationException {
    streamWriter.writeString(getBasePath(instance));
    streamWriter.writeObject(getEndCreationDate(instance));
    streamWriter.writeObject(getEndEditionDate(instance));
    streamWriter.writeObject(getEndPublicationDate(instance));
    streamWriter.writeObject(getFilters(instance));
    streamWriter.writeObject(getFolderTypes(instance));
    streamWriter.writeBoolean(getInContents(instance));
    streamWriter.writeBoolean(getInFiles(instance));
    streamWriter.writeBoolean(getInMetadatas(instance));
    streamWriter.writeBoolean(getInName(instance));
    streamWriter.writeBoolean(getInTags(instance));
    streamWriter.writeObject(getLanguage(instance));
    streamWriter.writeObject(getMimeTypes(instance));
    streamWriter.writeObject(getNodeTypes(instance));
    streamWriter.writeString(getOriginSiteUuid(instance));
    streamWriter.writeObject(getPages(instance));
    streamWriter.writeString(getQuery(instance));
    streamWriter.writeObject(getSites(instance));
    streamWriter.writeObject(getStartCreationDate(instance));
    streamWriter.writeObject(getStartEditionDate(instance));
    streamWriter.writeObject(getStartPublicationDate(instance));
    streamWriter.writeString(getTimeInDays(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery)object);
  }
  
}
