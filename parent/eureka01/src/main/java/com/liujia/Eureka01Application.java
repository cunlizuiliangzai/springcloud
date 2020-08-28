package com.liujia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ex_111806190
 * @since 2020-8-27 16:31
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka01Application.class,args);
    }
}
