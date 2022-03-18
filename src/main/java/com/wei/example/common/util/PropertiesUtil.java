package com.wei.example.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    private Logger logger = LoggerFactory.getLogger(getClass().getSimpleName());
    private Properties appProps;

    public PropertiesUtil(String propertiesFileName){
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesFileName);
//        String appConfigPath = rootPath + propertiesFileName;
        this.appProps = new Properties();
        try {
            appProps.load(inputStream);
        } catch ( IOException e ) {
            logger.error(e.getMessage(), e);
        }
    }
    public String getProperty(String propertyName){
        return appProps.getProperty(propertyName);
    }
}
