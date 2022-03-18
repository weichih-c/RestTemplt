/*
 * Copyright (c) 2022. Weichih-C.
 * All rights reserved.
 */

package com.wei.example.dao.intf;

import com.wei.example.common.to.GovHolidayTO;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface GovDao {
    List<GovHolidayTO> GetAllGovHolidays() throws IOException, URISyntaxException;
}
