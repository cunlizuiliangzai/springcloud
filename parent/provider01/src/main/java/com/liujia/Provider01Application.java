package com.liujia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ex_111806190
 * @since 2020-8-27 15:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class Provider01Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider01Application.class,args);
    }
}

