package com.yibo.gatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableHystrix
public class GatewayZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulApplication.class,args);
    }
}