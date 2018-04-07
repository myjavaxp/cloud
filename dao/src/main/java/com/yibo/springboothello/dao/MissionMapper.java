package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.Mission;

public interface MissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mission record);

    int insertSelective(Mission record);

    Mission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mission record);

    int updateByPrimaryKey(Mission record);
}