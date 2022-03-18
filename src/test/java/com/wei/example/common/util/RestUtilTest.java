package com.wei.example.common.util;

import com.wei.example.common.to.ApiRespTO;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestUtilTest {
    private Logger logger = LoggerFactory.getLogger(getClass().getSimpleName());

    @Test
    public void testExecuteGet() throws Exception
    {
        String url = "https://data.ntpc.gov.tw/api/datasets/308DCD75-6434-45BC-A95F-584DA4FED251/json?page=0&size=1";
        ApiRespTO result = RestUtil.executeGet(url);
        Assert.assertNotNull(result);
        logger.debug("Status: {}", result.getStatusCode());
        logger.debug("info: {}", result.getResponseContent());
    }

}
