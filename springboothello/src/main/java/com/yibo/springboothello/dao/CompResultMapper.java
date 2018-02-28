package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.CompResult;

public interface CompResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CompResult record);

    int insertSelective(CompResult record);

    CompResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CompResult record);

    int updateByPrimaryKey(CompResult record);
}