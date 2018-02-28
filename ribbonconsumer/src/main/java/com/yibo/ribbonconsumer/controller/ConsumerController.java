package com.yibo.ribbonconsumer.controller;

import com.yibo.ribbonconsumer.entity.Mission;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

    @RequestMapping(value = "/addMission", method = RequestMethod.POST)
    public String addMission(@RequestBody Mission mission) {
        return restTemplate.postForEntity("http://HELLO-SERVICE/mission/post", mission, String.class).getBody();
    }
    @RequestMapping(value = "/getMission",method = RequestMethod.GET)
    public String getMission(@RequestParam("id") Long id){
        return restTemplate.getForEntity("http://HELLO-SERVICE/mission/get?id={1}",String.class,id).getBody();
    }
}