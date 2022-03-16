package com.wei.example.service.intf;

public interface DateTimeService {
    String getDate();
    String getTime();
    String getDateTime();
    String getDateTimeByFormat(String format);
}
