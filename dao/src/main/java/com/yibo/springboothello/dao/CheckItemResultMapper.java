package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.CheckItemResult;

public interface CheckItemResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CheckItemResult record);

    int insertSelective(CheckItemResult record);

    CheckItemResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckItemResult record);

    int updateByPrimaryKey(CheckItemResult record);
}