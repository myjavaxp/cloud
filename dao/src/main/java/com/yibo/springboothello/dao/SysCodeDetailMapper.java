package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.SysCodeDetail;

public interface SysCodeDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysCodeDetail record);

    int insertSelective(SysCodeDetail record);

    SysCodeDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCodeDetail record);

    int updateByPrimaryKey(SysCodeDetail record);
}