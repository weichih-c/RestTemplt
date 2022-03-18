package com.wei.example.service.intf;

import com.wei.example.common.to.GovHolidayTO;

import java.util.List;

public interface GovService {
    List<GovHolidayTO> getHolidayByYear(String year);
}
