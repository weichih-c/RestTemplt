package com.wei.example.service.impl;

import com.wei.example.common.constants.SpringBootConstants;
import com.wei.example.common.to.GovHolidayTO;
import com.wei.example.dao.intf.GovDao;
import com.wei.example.service.intf.AbstractService;
import com.wei.example.service.intf.GovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service(value = SpringBootConstants.GOV_SERVICE)
public class GovServiceImpl extends AbstractService implements GovService {

    @Autowired
    private GovDao govDao;

    @Override
    public List<GovHolidayTO> getHolidayByYear(String year)
    {
        String methodName = "getHolidayByYear()";
        logger.info("{} {} start. year: {}", LOG_CLASS_PREFIX, methodName, year);

        List<GovHolidayTO> result = new ArrayList<>();
        try {
            List<GovHolidayTO> queryList = govDao.GetAllGovHolidays();
            result = queryList.stream()
                    .filter(day->day.getDate().startsWith(year))
                    .collect(Collectors.toList());
        } catch ( IOException | URISyntaxException e ) {
            logger.error(e.getMessage(), e);
        }
        logger.info("{} {} end. result size: {}", LOG_CLASS_PREFIX, methodName, result.size());
        return result;
    }
}
