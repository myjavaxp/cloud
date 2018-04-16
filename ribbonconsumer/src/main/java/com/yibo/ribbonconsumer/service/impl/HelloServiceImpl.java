package com.yibo.ribbonconsumer.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yibo.ribbonconsumer.service.HelloService;
import com.yibo.springboothello.entity.Mission;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    @Override
    public String helloService() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

    @Override
    public String helloFallback() {
        return "error";
    }

    @Override
    @HystrixCommand(fallbackMethod = "missionFallBack")
    public String updateMission(Mission mission, Long id) {
        return restTemplate.postForObject("http://HELLO-SERVICE/mission/" + id, mission, String.class);
    }
    @Override
    public String missionFallBack(Mission mission, Long id){
        return "任务修改失败"+mission.getMissionName()+mission.getId();
    }
}