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

package org.jahia.services.transform;

import java.io.File;

import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeConnectionProtocol;
import org.artofsolving.jodconverter.office.OfficeManager;
import org.artofsolving.jodconverter.process.ProcessManager;
import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * Factory bean for instantiating and configuring instance of the
 * {@link OfficeManager} that uses local installation of the OpenOffice.
 * 
 * @author Sergiy Shyrkov
 */
public class LocalOfficeManagerFactory extends AbstractFactoryBean<OfficeManager> {

    private DefaultOfficeManagerConfiguration cfg;

    /**
     * Initializes an instance of this class.
     */
    public LocalOfficeManagerFactory() {
        super();
        cfg = new DefaultOfficeManagerConfiguration();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.beans.factory.config.AbstractFactoryBean#createInstance
     * ()
     */
    @Override
    protected OfficeManager createInstance() throws Exception {
        return cfg.buildOfficeManager();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.beans.factory.config.AbstractFactoryBean#getObjectType
     * ()
     */
    @Override
    public Class<? extends OfficeManager> getObjectType() {
        return OfficeManager.class;
    }

    public void setConnectionProtocol(OfficeConnectionProtocol connectionProtocol) throws NullPointerException {
        cfg.setConnectionProtocol(connectionProtocol);
    }

    public void setMaxTasksPerProcess(int maxTasksPerProcess) {
        cfg.setMaxTasksPerProcess(maxTasksPerProcess);
    }

    public void setOfficeHome(File officeHome) throws NullPointerException, IllegalArgumentException {
        cfg.setOfficeHome(officeHome);
    }

    public void setOfficeHome(String officeHome) throws NullPointerException, IllegalArgumentException {
        cfg.setOfficeHome(officeHome);
    }

    public void setPipeName(String pipeName) throws NullPointerException {
        cfg.setPipeName(pipeName);
    }

    public void setPipeNames(String... pipeNames) throws NullPointerException, IllegalArgumentException {
        cfg.setPipeNames(pipeNames);
    }

    public void setPortNumber(int portNumber) {
        cfg.setPortNumber(portNumber);
    }

    public void setPortNumbers(int... portNumbers) throws NullPointerException, IllegalArgumentException {
        cfg.setPortNumbers(portNumbers);
    }

    public void setProcessManager(ProcessManager processManager) throws NullPointerException {
        cfg.setProcessManager(processManager);
    }

    public void setTaskExecutionTimeout(long taskExecutionTimeout) {
        cfg.setTaskExecutionTimeout(taskExecutionTimeout);
    }

    public void setTaskQueueTimeout(long taskQueueTimeout) {
        cfg.setTaskQueueTimeout(taskQueueTimeout);
    }

    public void setTemplateProfileDir(File templateProfileDir) throws IllegalArgumentException {
        cfg.setTemplateProfileDir(templateProfileDir);
    }
}
