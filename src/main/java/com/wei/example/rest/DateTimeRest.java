package com.wei.example.rest;

import com.wei.example.service.intf.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DateTimeRest {

    @Autowired
    private DateTimeService dateTimeService;

    @GetMapping("/getDate")
    public String getDate() {
        return dateTimeService.getDate();
    }

}