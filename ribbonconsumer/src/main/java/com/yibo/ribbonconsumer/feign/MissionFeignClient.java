package com.yibo.ribbonconsumer.feign;

import com.yibo.ribbonconsumer.config.FeignConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "hello-service", configuration = FeignConfiguration.class)
public interface MissionFeignClient {
    @RequestLine("GET /{id}")
    Object findById(@Param("id") Long id);
}