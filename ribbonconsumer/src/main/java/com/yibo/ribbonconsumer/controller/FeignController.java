package com.yibo.ribbonconsumer.controller;

import com.yibo.ribbonconsumer.feign.MissionFeignClient;
import com.yibo.ribbonconsumer.feign.UserFeignClient;
import com.yibo.springboothello.entity.Mission;
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
    @GetMapping("/mission/{id}")
    public Mission findById(@PathVariable("id") Long id) {
        return missionFeignClient.findById(id);
    }
    @GetMapping("/user/{id}")
    public Mission findUserById(@PathVariable("id") Long id) {
        return userFeignClient.findById(id);
    }

}
