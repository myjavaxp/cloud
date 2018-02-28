package com.yibo.springboothello.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());
    @Resource
    private CounterService counterService;
    @Resource
    private EurekaRegistration eurekaRegistration;

    @RequestMapping("/hello")
    public String index() {
        logger.info("/hello,host:" + eurekaRegistration.getHost() + ",service_id:" + eurekaRegistration.getServiceId() + ",uri:" + eurekaRegistration.getUri());
        counterService.increment("hello.count");
        return "Hello World";
    }
}