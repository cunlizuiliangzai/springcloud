package com.liujia.feignservice.fallback;

import com.liujia.entity.ChaOrder;
import com.liujia.feignservice.ProviderService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-8-28 11:22
 */
@Component
public class ConsumerServiceFallbackFactory implements FallbackFactory<ProviderService> {
    @Override
    public ProviderService create(Throwable throwable) {
        return new ProviderService() {
            @Override
            public ChaOrder getChaOrder(String uuid) {
                ChaOrder chaOrder = new ChaOrder(uuid, "该用户不存在", "");
                return chaOrder;
            }

            @Override
            public List<ChaOrder> getChaOrders() {
                return null;
            }
        };
    }
}
