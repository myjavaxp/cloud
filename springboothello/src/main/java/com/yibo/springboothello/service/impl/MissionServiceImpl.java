package com.yibo.springboothello.service.impl;

import com.yibo.springboothello.dao.MissionMapper;
import com.yibo.springboothello.entity.Mission;
import com.yibo.springboothello.service.MissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@Service("missionService")
@Transactional
public class MissionServiceImpl implements MissionService {
    @Resource
    private MissionMapper missionMapper;
    @Override
    @Transactional(readOnly = true)
    public Mission getMission(Long id) {
        Mission mission=missionMapper.selectByPrimaryKey(id);
        Assert.notNull(mission,"没有ID为:"+id+" 的任务");
        return mission;
    }
    @Override
    public void addMission(Mission mission){
        missionMapper.insertSelective(mission);
    }

    @Override
    public void updateMission(Mission mission,Long id){
        Assert.notNull(mission.getId(),"任务ID不能为空！");
        Assert.isTrue(mission.getId().equals(id),"任务ID不匹配！");
        missionMapper.updateByPrimaryKeySelective(mission);
    }
    @Override
    public void deleteMission(Long id){
        missionMapper.deleteByPrimaryKey(id);
    }
}