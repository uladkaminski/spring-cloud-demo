package com.uladkaminski.lotteryrandomproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LotteryRandomProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryRandomProducerApplication.class, args);
    }

}
