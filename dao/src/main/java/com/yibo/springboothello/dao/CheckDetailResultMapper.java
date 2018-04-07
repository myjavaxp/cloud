package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.CheckDetailResult;

public interface CheckDetailResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckDetailResult record);

    int insertSelective(CheckDetailResult record);

    CheckDetailResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckDetailResult record);

    int updateByPrimaryKey(CheckDetailResult record);
}