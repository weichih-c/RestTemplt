package com.wei.example.service;

import com.wei.example.service.impl.DateTimeServiceImpl;
import com.wei.example.service.intf.DateTimeService;
import org.junit.Assert;
import org.junit.Test;

public class DateTimeServiceTest extends AbstractServiceTest{

    private DateTimeService service = new DateTimeServiceImpl();


    @Test
    public void testGetDate() throws Exception
    {
        String dateStr = service.getDate();
        logger.debug("result:{}", dateStr);
        Assert.assertTrue(dateStr.length() > 0);

    }

    @Test
    public void testGetTime()
    {
        String timeStr = service.getTime();
        logger.debug("result:{}", timeStr);
        Assert.assertTrue(timeStr.length() > 0);
    }

    @Test
    public void testGetDateTime()
    {
        String timeStr = service.getDateTime();
        logger.debug("result:{}", timeStr);
        Assert.assertTrue(timeStr.length() > 0);
    }

    @Test
    public void testGetDateTimeByFormat()
    {
        String myFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        String timeStr = service.getDateTimeByFormat(myFormat);
        logger.debug("result:{}", timeStr);
        Assert.assertTrue(timeStr.length() > 0);
    }

}