package com.wei.example.dao;

import com.wei.example.common.to.GovHolidayTO;
import com.wei.example.dao.impl.GovDaoImpl;
import com.wei.example.dao.intf.GovDao;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GovDaoTest extends AbstractDaoTest{

    GovDao dao = new GovDaoImpl();

    @Test
    public void testGetAllGovHolidays() throws Exception
    {
        List<GovHolidayTO> result = dao.GetAllGovHolidays();
        logger.debug("result size: {}", result.size());
        Assert.assertTrue(result.size() > 0);

    }
}