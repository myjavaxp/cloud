package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.MissionSchedual;

public interface MissionSchedualMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MissionSchedual record);

    int insertSelective(MissionSchedual record);

    MissionSchedual selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MissionSchedual record);

    int updateByPrimaryKey(MissionSchedual record);
}