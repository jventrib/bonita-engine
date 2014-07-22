/*******************************************************************************
 * Copyright (C) 2009, 2013 BonitaSoft S.A.
 * BonitaSoft is a trademark of BonitaSoft SA.
 * This software file is BONITASOFT CONFIDENTIAL. Not For Distribution.
 * For commercial licensing information, contact:
 * BonitaSoft, 32 rue Gustave Eiffel – 38000 Grenoble
 * or BonitaSoft US, 51 Federal Street, Suite 305, San Francisco, CA 94107
 *******************************************************************************/
package com.bonitasoft.engine.log;

import org.bonitasoft.engine.exception.BonitaException;

/**
 * @author Bole Zhang
 * @author Matthieu Chaffotte
 */
public class LogNotFoundException extends BonitaException {

    private static final long serialVersionUID = 1901535152006080386L;

    public LogNotFoundException(final Throwable cause) {
        super(cause);
    }

}