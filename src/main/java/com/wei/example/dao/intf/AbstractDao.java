/*
 * Copyright (c) 2022. Weichih-C.
 * All rights reserved.
 */

package com.wei.example.dao.intf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public abstract class AbstractDao {

    protected Logger logger = getLogger();
    protected Gson gson = getGson();
    protected String LOG_CLASS_PREFIX = " [" + getClass().getSimpleName() + "] ";

//
//    @PersistenceContext(name = SpringBootConstants.pu_datalanding)
//    protected EntityManager entityManager;

    private Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }
    private Gson getGson()
    {
        return new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    }

}
