package com.yibo.ribbonconsumer.component;

import com.yibo.ribbonconsumer.feign.MissionFeignClient;
import com.yibo.springboothello.entity.Mission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignClientFallBack implements MissionFeignClient{
    private static final Logger LOGGER= LoggerFactory.getLogger(FeignClientFallBack.class);
    @Override
    public Mission findById(Long id) {
        LOGGER.info("回退成功");
        Mission mission=new Mission();
        mission.setMissionName("默认任务");
        mission.setCreateUser("system");
        mission.setId(-1L);
        return mission;
    }
}