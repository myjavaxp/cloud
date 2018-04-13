package com.yibo.ribbonconsumer.feign;

import com.yibo.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("hello-service")
public interface RefactorHelloService extends HelloService {
}