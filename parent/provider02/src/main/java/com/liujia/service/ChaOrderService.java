package com.liujia.service;

import com.liujia.entity.ChaOrder;

import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-8-27 15:05
 */
public interface ChaOrderService {

    ChaOrder getChaOrder(String id);

    List<ChaOrder> getChaOrders();
}
