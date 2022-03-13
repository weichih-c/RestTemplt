package com.wei.example.rest;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class HelloRestTest extends AbstractRestTest {

    @Override
    protected void setBeforeMethod()
    {
    }

    @Override
    protected void setAfterMethod()
    {
    }

    @Test
    @Ignore
    public void getHello() throws Exception
    {
        MvcResult mvcResult = mockMvc.perform(get("/posUi/hello")).andReturn();
        logger.info("HTTP Status: " + mvcResult.getResponse().getStatus());
        logger.info("" + mvcResult.getResponse().getCharacterEncoding());
        logger.info(mvcResult.getResponse().getContentAsString());
    }
}