package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.SysCode;

public interface SysCodeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    SysCode selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
}