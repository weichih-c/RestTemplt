package com.wei.example.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//@RunWith(SpringRunner.class)
public abstract class AbstractDaoTest {
    protected Logger logger = getLogger();

    protected Gson gson = getGson();

    private Logger getLogger()
    {
        return LoggerFactory.getLogger(getClass().getSimpleName());
    }

    private Gson getGson()
    {
        return new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    }
}
