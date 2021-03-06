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

package org.jahia.ajax.gwt.client.data;

import com.extjs.gxt.ui.client.data.BaseModelData;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * User: loom
 * Date: Oct 5, 2010
 * Time: 3:29:38 PM
 * 
 */
public class GWTJahiaContentHistoryEntry extends BaseModelData implements Serializable, Comparable {

    public GWTJahiaContentHistoryEntry() {
        super();
    }

    public GWTJahiaContentHistoryEntry(Date date, String action, String propertyName, String userKey, String path, String message, String languageCode) {
        super();
        setDate(date);
        setAction(action);
        setPropertyName(propertyName);
        setUserKey(userKey);
        setPath(path);
        setMessage(message);
        setLanguageCode(languageCode);
    }

    public Date getDate() {
        return get("date");
    }

    public void setDate(Date date) {
        set("date", date);
    }

    public String getAction() {
        return get("action");
    }

    public void setAction(String action) {
        set("action", action);
    }

    public String getPropertyName() {
        return get("propertyName");
    }

    public void setPropertyName(String propertyName) {
        set("propertyName", propertyName);
    }

    public String getUserKey() {
        return get("userKey");
    }

    public void setUserKey(String userKey) {
        set("userKey", userKey);
    }

    public String getPath() {
        return get("path");
    }

    public void setPath(String path) {
        set("path", path);
    }

    public String getMessage() {
        return get("message");
    }

    public void setMessage(String message) {
        set("message", message);
    }

    public String getLanguageCode() {
        return get("languageCode");
    }

    public void setLanguageCode(String languageCode) {
        set("languageCode", languageCode);
    }

    public int compareTo(Object o) {
        return getDate().compareTo(((GWTJahiaContentHistoryEntry) o).getDate());
    }
}
