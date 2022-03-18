/*
 * Copyright (c) 2022. Weichih-C.
 * All rights reserved.
 */

package com.wei.example.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractRest {

    protected Logger logger = getLogger();
    protected Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    protected String LOG_CLASS_PREFIX = " [" + getClass().getSimpleName() + "] ";


    private Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }
}
