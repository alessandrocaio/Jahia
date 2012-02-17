/**
 * This file is part of Jahia, next-generation open source CMS:
 * Jahia's next-generation, open source CMS stems from a widely acknowledged vision
 * of enterprise application convergence - web, search, document, social and portal -
 * unified by the simplicity of web content management.
 *
 * For more information, please visit http://www.jahia.com.
 *
 * Copyright (C) 2002-2012 Jahia Solutions Group SA. All rights reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * As a special exception to the terms and conditions of version 2.0 of
 * the GPL (or any later version), you may redistribute this Program in connection
 * with Free/Libre and Open Source Software ("FLOSS") applications as described
 * in Jahia's FLOSS exception. You should have received a copy of the text
 * describing the FLOSS exception, and it is also available here:
 * http://www.jahia.com/license
 *
 * Commercial and Supported Versions of the program (dual licensing):
 * alternatively, commercial and supported versions of the program may be used
 * in accordance with the terms and conditions contained in a separate
 * written agreement between you and Jahia Solutions Group SA.
 *
 * If you are unsure which license is appropriate for your use,
 * please contact the sales department at sales@jahia.com.
 */

package org.jahia.services.uicomponents.bean.toolbar;

import org.jahia.services.content.decorator.JCRSiteNode;
import org.jahia.services.usermanager.JahiaUser;
import org.jahia.utils.i18n.JahiaResourceBundle;

import java.util.Locale;

/**
 * User: jahia
 * Date: 11 juil. 2008
 * Time: 10:04:15
 */
public class ResourceBundleProperty extends Property {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ResourceBundleProperty.class);

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRealValue(JCRSiteNode site, JahiaUser user, Locale locale) {
        return getResources(key, locale);
    }

    /**
     * Get resources
     *
     * @param key
     * @param locale
     * @return
     */
    private String getResources(String key, Locale locale) {
        logger.debug("Resources key: " + key);
        String value = JahiaResourceBundle.getJahiaInternalResource(key, locale);
        if (value == null || value.equalsIgnoreCase("")) {
            value = JahiaResourceBundle.getJahiaInternalResource(key, locale);
        }
        if (value == null || value.equalsIgnoreCase("")) {
            // value = JahiaResourceBundle.getMessageResource(key, processingContext.getLocale(), null);
        }
        logger.debug("Resources value: " + value);
        return JahiaResourceBundle.getJahiaInternalResource(key, locale);
    }
}