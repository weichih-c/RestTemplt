/*
 * Copyright (c) 2022. Weichih-C.
 * All rights reserved.
 */

package com.wei.example.dao.intf;

import com.wei.example.common.to.StockAddHistTO;

import java.util.List;

public interface StockAddHistDao {
    List<StockAddHistTO> findStockAddHistByProductId(long productId);

    void insertStockAddHist(StockAddHistTO stockAddHist);

    int deleteStockAddHistByProductId(long productId);
}
