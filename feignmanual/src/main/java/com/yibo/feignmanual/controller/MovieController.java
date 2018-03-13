package com.yibo.feignmanual.controller;

import com.yibo.feignmanual.feign.UserFeignClient;
import com.yibo.springboothello.entity.SysUser;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Import(FeignClientsConfiguration.class)
@RestController
public class MovieController {
    private UserFeignClient userUserFeignClient;
    private UserFeignClient adminUserFeignClient;

    @Autowired
    public MovieController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.userUserFeignClient = Feign.builder()
                .client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(UserFeignClient.class, "http://hello-service");
        this.adminUserFeignClient = Feign.builder()
                .client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(UserFeignClient.class, "http://hello-service");
    }

    @GetMapping("/user-user/{id}")
    public SysUser findByIdUser(@PathVariable("id") Long id) {
        return userUserFeignClient.findById(id);
    }

    @GetMapping("/user-admin/{id}")
    public SysUser findByIdAdmin(@PathVariable("id") Long id) {
        return adminUserFeignClient.findById(id);
    }
}