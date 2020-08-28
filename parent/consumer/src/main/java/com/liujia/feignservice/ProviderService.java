package com.liujia.feignservice;

import com.liujia.entity.ChaOrder;
import com.liujia.feignservice.fallback.ConsumerServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-8-28 9:34
 */
@FeignClient(value = "PROVIDER",fallbackFactory = ConsumerServiceFallbackFactory.class)
public interface ProviderService {

    @GetMapping("/get/{uuid}")
    public ChaOrder getChaOrder(@PathVariable("uuid") String uuid);

    @RequestMapping(value = "/getChaOrders/list", method = RequestMethod.GET)
    public List<ChaOrder> getChaOrders();
}
