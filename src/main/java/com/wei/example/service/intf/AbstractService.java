/*
 * Copyright (c) 2022. Weichih-C.
 * All rights reserved.
 */

package com.wei.example.service.intf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractService {

    protected Logger logger = getLogger();
    protected String LOG_CLASS_PREFIX = " [" + getClass().getSimpleName() + "] ";


    private Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }
}
