package com.yibo.ribbonconsumer.feign;

import com.yibo.ribbonconsumer.component.FeignClientFallbackFactory;
import com.yibo.springboothello.entity.Mission;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "hello-service", fallbackFactory = FeignClientFallbackFactory.class)
public interface UserFeignClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Mission findById(@PathVariable("id") Long id);
}
