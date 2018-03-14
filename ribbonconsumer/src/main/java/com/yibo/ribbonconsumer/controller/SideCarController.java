package com.yibo.ribbonconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class SideCarController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/sidecar")
    public String find() {
        return restTemplate.getForObject("http://gateway-zuul/", String.class);
    }
}