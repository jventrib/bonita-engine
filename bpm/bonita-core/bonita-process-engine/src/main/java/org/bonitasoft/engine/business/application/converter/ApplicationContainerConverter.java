/**
 * Copyright (C) 2015 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation
 * version 2.1 of the License.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth
 * Floor, Boston, MA 02110-1301, USA.
 **/
package org.bonitasoft.engine.business.application.converter;

import java.util.List;

import org.bonitasoft.engine.business.application.model.SApplication;
import org.bonitasoft.engine.business.application.xml.ApplicationNodeContainer;
import org.bonitasoft.engine.exception.ExportException;

/**
 * @author Elias Ricken de Medeiros
 */
public class ApplicationContainerConverter {

    private final ApplicationNodeConverter applicationNodeConverter;

    public ApplicationContainerConverter(final ApplicationNodeConverter applicationNodeConverter) {
        this.applicationNodeConverter = applicationNodeConverter;
    }

    public ApplicationNodeContainer toNode(final List<SApplication> applications) throws ExportException {
        final ApplicationNodeContainer container = new ApplicationNodeContainer();
        for (final SApplication application : applications) {
            container.addApplication(applicationNodeConverter.toNode(application));
        }
        return container;
    }

}
