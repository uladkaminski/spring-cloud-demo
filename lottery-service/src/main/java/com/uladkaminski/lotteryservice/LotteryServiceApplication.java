package com.uladkaminski.lotteryservice;

import com.uladkaminski.lotteryservice.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.event.EventListener;

import java.util.stream.IntStream;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class LotteryServiceApplication {

    @Autowired
    private TestClient client;

    public static void main(String[] args) {
        SpringApplication.run(LotteryServiceApplication.class, args);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        IntStream.range(1, 1000).forEach(i -> {
            System.out.print(i + " ");
            System.out.println(client.hello());

        });

    }
}
