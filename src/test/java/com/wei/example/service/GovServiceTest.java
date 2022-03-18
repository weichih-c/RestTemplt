package com.wei.example.service;

import com.wei.example.common.to.GovHolidayTO;
import com.wei.example.service.impl.GovServiceImpl;
import com.wei.example.service.intf.GovService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

@Ignore
public class GovServiceTest extends AbstractServiceTest{

    private GovService service = new GovServiceImpl();


    @Test
    public void testGetHolidayByYear() throws Exception
    {
        String year = "2022";
        List<GovHolidayTO> result = service.getHolidayByYear(year);
        logger.debug("result size of {}: {}", year, result.size());
        Assert.assertTrue(result.size()>0);
    }
}