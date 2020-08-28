package com.liujia.controller;

import com.liujia.entity.ChaOrder;
import com.liujia.service.ChaOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-8-27 15:08
 */
@RestController
public class ChaOrderController {

    @Autowired
    private ChaOrderService serviceImpl;


    @GetMapping("/get/{uuid}")
    @HystrixCommand(fallbackMethod="hystrixGetChaOrder") //一旦服务调用失败，就调用hystrixGetChaOrder方法
    public ChaOrder getChaOrder(@PathVariable("uuid") String uuid) {
        ChaOrder order = serviceImpl.getChaOrder(uuid);
        if(order == null){
            throw new RuntimeException("不存在=" + uuid + "对应的订单信息");
        }
        order.setStartChargeSeq("provider02");
        return order;
    }

    @RequestMapping(value = "/getChaOrders/list", method = RequestMethod.GET)
    public List<ChaOrder> getChaOrders() {
        List<ChaOrder> orders = serviceImpl.getChaOrders();
        return orders;
    }

    public ChaOrder hystrixGetChaOrder(@PathVariable("uuid") String uuid){
        ChaOrder user = new ChaOrder(uuid, "不存在该用户", "");
        return user;
    }
}
