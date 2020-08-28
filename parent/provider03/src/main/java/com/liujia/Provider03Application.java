package com.liujia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ex_111806190
 * @since 2020-8-27 15:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider03Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider03Application.class,args);
    }
}

