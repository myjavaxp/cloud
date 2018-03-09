package com.yibo.ribbonconsumer.component;

import com.yibo.ribbonconsumer.feign.UserFeignClient;
import com.yibo.springboothello.entity.Mission;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
    private static final Logger LOGGER= LoggerFactory.getLogger(FeignClientFallbackFactory.class);
    @Override
    public UserFeignClient create(Throwable cause) {
        return id -> {
            FeignClientFallbackFactory.LOGGER.info("fallback; reason was: ",cause);
            Mission mission=new Mission();
            mission.setId(-1L);
            mission.setMissionName("默认任务");
            return mission;
        };
    }
}