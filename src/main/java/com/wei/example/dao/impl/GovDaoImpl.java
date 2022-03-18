package com.wei.example.dao.impl;

import com.google.gson.reflect.TypeToken;
import com.wei.example.common.constants.SpringBootConstants;
import com.wei.example.common.to.ApiRespTO;
import com.wei.example.common.to.GovHolidayTO;
import com.wei.example.common.util.PropertiesUtil;
import com.wei.example.common.util.RestUtil;
import com.wei.example.dao.intf.AbstractDao;
import com.wei.example.dao.intf.GovDao;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Repository(value = SpringBootConstants.GOV_DAO)
public class GovDaoImpl extends AbstractDao implements GovDao {
    private PropertiesUtil propertiesUtil = new PropertiesUtil("one.properties");

    @Override
    public List<GovHolidayTO> GetAllGovHolidays() throws IOException, URISyntaxException
    {
        String methodName = "GetAllGovHolidays()";
        logger.info("{} {} start.", LOG_CLASS_PREFIX, methodName);

        String urlGetHoliday = propertiesUtil.getProperty("gov.api.url.getholiday");

        int pageNum = 0;
        List<GovHolidayTO> result = new ArrayList<>();
        while ( true ) {
            StringBuilder url = new StringBuilder(urlGetHoliday);
            url.append("?page=").append(pageNum);
            url.append("&size=").append(3000);
            ApiRespTO respTO = RestUtil.executeGet(url.toString());
            if ( respTO.getStatusCode() < 300 ) {
                List<GovHolidayTO> holidays = gson.fromJson(respTO.getResponseContent(),
                        new TypeToken<List<GovHolidayTO>>() {
                        }.getType());

                if ( holidays.size() == 0 ){
                    break;
                }else {
                    result.addAll(holidays);
                    pageNum++;
                }

            } else {
                logger.error("{} {} API Unavailable.", LOG_CLASS_PREFIX, methodName);
                break;
            }
        }
        logger.info("{} {} end. Find result size: {}", LOG_CLASS_PREFIX, methodName, result.size());
        return result;
    }
}
