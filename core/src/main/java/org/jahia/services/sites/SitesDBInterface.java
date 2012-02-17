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

package org.jahia.services.sites;


/**
 * This interface holds constants defining the site database table name, and
 * all the column names.
 *
 * @author Fulco Houkes
 * @version 1.0
 */
public interface SitesDBInterface {

    /** <code>jahia_sites_users</code> database table name */
    public static final String JAHIA_SITES_USERS = "jahia_sites_users";

    /** account ID column name */
    public static final String FIELD_ACCOUNT_ID_SITES_USERS = "id_jahia_accounts";

    /** user key column name */
    public static final String FIELD_USER_KEY_SITES_USERS = "key_jahia_users";

    /** site key column name */
    public static final String FIELD_SITE_KEY_SITES_USERS = "key_jahia_sites";


    /** <code>jahia_sites</code> database table name */
    public static final String JAHIA_SITES = "jahia_sites";

    /**  */
    public static final String FIELD_TITLE_SITES = "title_jahia_sites";

    /**  */
    public static final String FIELD_SERVERNAME_SITES = "servername_jahia_sites";

    /**  */
    public static final String FIELD_KEY_SITES = "key_jahia_sites";

    /**  */
    public static final String FIELD_ACTIVE_SITES = "active_jahia_sites";

    /**  */
    public static final String FIELD_DEFAULTPAGE_ID_SITES =
            "defaultpageid_jahia_sites";

    /**  */
    public static final String FIELD_DEFAULT_TEMPLATE_ID_SITES =
            "defaulttemplateid_jahia_sites";

    /**  */
    public static final String FIELD_TPL_DEPLOY_MODE_SITES =
            "tpl_deploymode_jahia_sites";

    /**  */
    public static final String FIELD_WEBAPPS_DEPLOY_MODE_SITES =
            "webapps_deploymode_jahia_sites";

    /**  */
    public static final String FIELD_ACL_ID_SITES = "rights_jahia_sites";

    /**  */
    public static final String FIELD_SITE_DESCRIPTION_SITES = "descr_jahia_sites";

}
