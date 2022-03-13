/*
 * Copyright (c) 2022. Weichih-C.
 * All rights reserved.
 */

package com.wei.example.dao.intf;

import com.wei.example.common.to.OrderChangeHistTO;

public interface OrderChangeHistDao {
    void insertOrderChangeHist(OrderChangeHistTO orderChangeTO);

    int delOrderChangeHistByOrderId(String orderId);
}
