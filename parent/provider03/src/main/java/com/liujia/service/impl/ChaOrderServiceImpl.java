package com.liujia.service.impl;

import com.liujia.entity.ChaOrder;
import com.liujia.mapper.ChaOrderMapper;
import com.liujia.service.ChaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-8-27 15:05
 */
@Service
public class ChaOrderServiceImpl implements ChaOrderService {

    @Autowired
    private ChaOrderMapper chaOrderMapper;

    @Override
    public ChaOrder getChaOrder(String id) {
        ChaOrder chaOrder = chaOrderMapper.getChaOrder(id);
        return chaOrder;
    }

    @Override
    public List<ChaOrder> getChaOrders() {
        List<ChaOrder> chaOrders = chaOrderMapper.getChaOrders();
        return chaOrders;
    }
}
