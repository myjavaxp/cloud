package com.yibo.springboothello.controller;

import com.yibo.springboothello.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @Resource
    private CounterService counterService;
    @Resource
    private EurekaRegistration eurekaRegistration;

    @GetMapping("/hello")
    public String index() throws InterruptedException {
        int sleepTime = new Random().nextInt(4000);
        LOGGER.info("sleepTime:" + sleepTime);
        Thread.sleep(sleepTime);
        LOGGER.info("/hello,host:" + eurekaRegistration.getHost() + ",service_id:" + eurekaRegistration.getServiceId() + ",uri:" + eurekaRegistration.getUri());
        counterService.increment("hello.count");
        return "Hello World";
    }

    @GetMapping("/trace-2")
    public String trace(HttpServletRequest request) {
        LOGGER.info("===<call trace-2, TraceId={},SpanId={}>===",
                request.getHeader("X-B3-TraceId"),
                request.getHeader("X-B3-SpanId"));
        return "Trace";
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}