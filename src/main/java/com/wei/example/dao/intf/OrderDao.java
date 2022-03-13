/*
 * Copyright (c) 2022. Weichih-C.
 * All rights reserved.
 */

package com.wei.example.dao.intf;

import com.wei.example.common.to.OrderPK;
import com.wei.example.common.to.OrderTO;

import java.util.List;

public interface OrderDao {
    List<OrderTO> findByOrderId(String orderId);

    OrderTO findByPK(OrderPK pk);

    void insertOrder(OrderTO order);

    void updateOrder(OrderTO order);

    int deleteByOrderId(String orderId);
}
