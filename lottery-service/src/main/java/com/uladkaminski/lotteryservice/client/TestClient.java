package com.uladkaminski.lotteryservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("random-producer")
public interface TestClient {

    @GetMapping(value = "/hello")
    String hello();
}
