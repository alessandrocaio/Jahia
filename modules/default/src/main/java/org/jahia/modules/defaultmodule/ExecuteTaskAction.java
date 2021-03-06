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

package org.jahia.modules.defaultmodule;

import org.apache.commons.lang.StringUtils;
import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;
import org.jahia.services.workflow.WorkflowService;
import org.jahia.services.workflow.WorkflowVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author toto
 * Date: Mar 18, 2010
 * Time: 12:16:22 PM
 */
public class ExecuteTaskAction extends Action {
    private WorkflowService workflowService;

    public void setWorkflowService(WorkflowService workflowService) {
        this.workflowService = workflowService;
    }

    public ActionResult doExecute(HttpServletRequest req, RenderContext renderContext, Resource resource,
                                  JCRSessionWrapper session, Map<String, List<String>> parameters, URLResolver urlResolver) throws Exception {
        String action = parameters.get("action").get(0);
        String actionId = StringUtils.substringAfter(action, ":");
        String providerKey = StringUtils.substringBefore(action, ":");
        String outcome = parameters.get("outcome").get(0);

        workflowService.assignAndCompleteTask(actionId, providerKey, outcome, getVariablesMap(parameters),
                                     renderContext.getUser());

        return ActionResult.OK_JSON;
    }

    private HashMap<String, Object> getVariablesMap(Map<String, List<String>> properties) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        for (Map.Entry<String, List<String>> property : properties.entrySet()) {
            if (!"action".equals(property.getKey()) && !"outcome".equals(property.getKey())) {
                List<String> propertyValues = property.getValue();
                List<WorkflowVariable> values = new ArrayList<WorkflowVariable>(propertyValues.size());
                boolean toBeAdded = false;
                for (String value : propertyValues) {
                    if (!"".equals(value.trim())) {
                        values.add(new WorkflowVariable(value, 1));
                        toBeAdded = true;
                    }
                }
                if (toBeAdded) {
                    map.put(property.getKey(), values);
                } else {
                    map.put(property.getKey(), new ArrayList<WorkflowVariable>());
                }
            }
        }
        return map;
    }
}
