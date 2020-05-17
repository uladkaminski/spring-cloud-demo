package com.uladkaminski.lotteryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class LotteryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryServiceApplication.class, args);
    }

}
