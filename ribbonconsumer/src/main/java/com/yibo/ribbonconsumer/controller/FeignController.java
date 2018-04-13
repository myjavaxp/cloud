package com.yibo.ribbonconsumer.controller;

import com.yibo.ribbonconsumer.feign.HelloFeign;
import com.yibo.ribbonconsumer.feign.MissionFeignClient;
import com.yibo.ribbonconsumer.feign.RefactorHelloService;
import com.yibo.ribbonconsumer.feign.UserFeignClient;
import com.yibo.springboothello.entity.Mission;
import com.yibo.springboothello.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {
    @Resource
    private MissionFeignClient missionFeignClient;
    @Resource
    private UserFeignClient userFeignClient;
    @Resource
    private HelloFeign helloFeign;
    @Resource
    private RefactorHelloService refactorHelloService;

    @GetMapping("/mission/{id}")
    public Mission findById(@PathVariable("id") Long id) {
        return missionFeignClient.findById(id);
    }

    @GetMapping("/user/{id}")
    public Mission findUserById(@PathVariable("id") Long id) {
        return userFeignClient.findById(id);
    }

    @GetMapping("/consumer")
    public String hello() {
        return helloFeign.hello("Yibo") + "\n" +
                helloFeign.hello("Yibo", 29) + "\n" +
                helloFeign.hello(new User("Yibo", 20)) + "\n";
    }
    @GetMapping("/consume")
    public String refactorHello() {
        return refactorHelloService.hello("Mimi") + "\n" +
                refactorHelloService.hello("Yibo", 29) + "\n" +
                refactorHelloService.hello(new User("Yibo", 20)) + "\n";
    }
}