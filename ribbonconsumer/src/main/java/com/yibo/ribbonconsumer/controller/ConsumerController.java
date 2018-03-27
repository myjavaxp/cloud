package com.yibo.ribbonconsumer.controller;

import com.yibo.ribbonconsumer.service.HelloService;
import com.yibo.springboothello.entity.Mission;
import com.yibo.springboothello.entity.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;

@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HelloService helloService;
    @Resource
    private LoadBalancerClient loadBalancerClient;
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerController.class);

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.helloService();
    }

    @RequestMapping(value = "/addMission", method = RequestMethod.POST)
    public String addMission(@RequestBody Mission mission) {
        return restTemplate.postForEntity("http://HELLO-SERVICE/mission", mission, String.class).getBody();
    }

    @RequestMapping(value = "/getMission", method = RequestMethod.GET)
    public String getMission(@RequestParam("id") Long id) {
        return restTemplate.getForEntity("http://HELLO-SERVICE/mission/{1}", String.class, id).getBody();
    }

    @RequestMapping(value = "/getMyMission", method = RequestMethod.GET)
    public String getMyMission(@RequestParam("id") Long id) {
        UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://HELLO-SERVICE/mission/{id}")
                .build()
                .expand(id)
                .encode();
        URI uri = uriComponents.toUri();
        return restTemplate.getForEntity(uri, String.class).getBody();
    }

    @GetMapping("/log-instance")
    public String logUserInstance() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("HELLO-SERVICE");
        LOGGER.info("{},{},{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
        return serviceInstance.getServiceId() + serviceInstance.getHost() + serviceInstance.getPort();
    }

    @GetMapping("/users/{id}")
    public SysUser sysUser(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://HELLO-SERVICE/users/{1}", SysUser.class, id);
    }

    @GetMapping("/trace-1")
    public String trace() {
        LOGGER.info("===<call trace-1>==");
        return restTemplate.getForEntity("http://HELLO-SERVICE/trace-2", String.class).getBody();
    }
}