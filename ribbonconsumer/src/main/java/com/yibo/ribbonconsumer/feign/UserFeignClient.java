package com.yibo.ribbonconsumer.feign;

import com.yibo.ribbonconsumer.component.FeignClientFallbackFactory;
import com.yibo.springboothello.entity.Mission;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hello-service", fallbackFactory = FeignClientFallbackFactory.class)
public interface UserFeignClient {
    @GetMapping("/mission/{id}")
    Mission findById(@PathVariable("id") Long id);
}