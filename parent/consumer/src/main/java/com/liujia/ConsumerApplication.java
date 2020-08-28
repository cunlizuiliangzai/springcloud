package com.liujia;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author ex_111806190
 * @since 2020-8-27 15:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.liujia.feignservice")
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
    @Bean
    public IRule myRule() {
        return new RoundRobinRule();    //轮询策略
    }
}
