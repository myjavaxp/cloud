package com.yibo.ribbonconsumer.feign;

import com.yibo.springboothello.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("hello-service")
public interface HelloFeign {
    @GetMapping("/hello1")
    String hello(@RequestParam("name")String name);
    @GetMapping("/hello2")
    User hello(@RequestHeader("name")String name, @RequestHeader("age")Integer age);
    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}