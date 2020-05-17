package com.uladkaminski.lotteryrandomproducer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@Slf4j
public class HelloController {
    AtomicInteger counter = new AtomicInteger();


    @GetMapping("/hello")
    public String hello() {
        int value = counter.incrementAndGet();
        log.info("Request for {} value", value);
        return String.valueOf(value);
    }
}
