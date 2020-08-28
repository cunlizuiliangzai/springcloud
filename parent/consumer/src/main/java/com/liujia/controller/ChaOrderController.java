package com.liujia.controller;

import com.liujia.entity.ChaOrder;
import com.liujia.feignservice.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-8-27 16:00
 */
@RestController
public class ChaOrderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping(value="/consumer/get/{uuid}")
    public ChaOrder get(@PathVariable("uuid") String uuid){
        ChaOrder order = providerService.getChaOrder(uuid);
        return order;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @GetMapping(value="/consumer/list")
    public List<ChaOrder> getList(){
        List<ChaOrder> list = providerService.getChaOrders();
        return list;
    }
}
