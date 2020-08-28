package com.liujia;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ex_111806190
 * @since 2020-8-27 17:21
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKa03Application {
    public static void main(String[] args) {
        SpringApplication.run(EureKa03Application.class, args);
    }
}
