package com.yibo.springboothello.service;

import com.yibo.springboothello.entity.Mission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class MissionServiceTest {
    @Resource
    private MissionService missionService;

    @Test
    public void addMission() {
        Mission mission = new Mission();
        mission.setMissionName("测试事务回滚");
        mission.setTemplateId(1L);
        mission.setBrandId(2L);
        missionService.addMission(mission);
    }
}