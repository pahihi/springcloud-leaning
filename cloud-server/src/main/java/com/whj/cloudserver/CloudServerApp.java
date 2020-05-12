package com.whj.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer// 声明这个应用是一个EurekaServer
public class CloudServerApp {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerApp.class,args);
    }
}
