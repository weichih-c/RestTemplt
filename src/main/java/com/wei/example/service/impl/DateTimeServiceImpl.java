package com.wei.example.service.impl;

import com.wei.example.common.constants.SpringBootConstants;
import com.wei.example.service.intf.AbstractService;
import com.wei.example.service.intf.DateTimeService;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

@Repository(value = SpringBootConstants.DATETIME_SERVICE)
public class DateTimeServiceImpl extends AbstractService implements DateTimeService {

    @Override
    public String getDate()
    {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(now);
    }

    @Override
    public String getTime()
    {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(now);
    }

    @Override
    public String getDateTime()
    {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(now);
    }

    @Override
    public String getDateTimeByFormat(String format)
    {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(now);
    }
}
