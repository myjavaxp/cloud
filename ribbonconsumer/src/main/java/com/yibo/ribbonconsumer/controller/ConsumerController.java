package com.yibo.ribbonconsumer.controller;

import com.yibo.ribbonconsumer.entity.Mission;
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

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

    @RequestMapping(value = "/addMission", method = RequestMethod.POST)
    public String addMission(@RequestBody Mission mission) {
        return restTemplate.postForEntity("http://HELLO-SERVICE/mission/post", mission, String.class).getBody();
    }

    @RequestMapping(value = "/getMission", method = RequestMethod.GET)
    public String getMission(@RequestParam("id") Long id) {
        return restTemplate.getForEntity("http://HELLO-SERVICE/mission/get?id={1}", String.class, id).getBody();
    }

    @RequestMapping(value = "/getMyMission", method = RequestMethod.GET)
    public String getMyMission(@RequestParam("id") Long id) {
        UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://HELLO-SERVICE/mission/get?id={id}")
                .build()
                .expand(id)
                .encode();
        URI uri = uriComponents.toUri();
        return restTemplate.getForEntity(uri, String.class).getBody();
    }
}