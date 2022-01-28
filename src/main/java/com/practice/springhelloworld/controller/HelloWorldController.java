package com.practice.springhelloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class HelloWorldController {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/hello")
    public String helloWorld() throws InterruptedException {
        try {
            for (int i = 1; i < 10; i++) {
                TimeUnit.SECONDS.sleep(1);
                log.info(String.valueOf(i));
            }

            log.info("complete");
            return "Hello world";
        } catch (Exception e) {
            log.error(e.getMessage());
            return "Something went wrong";
        }
    }
}
