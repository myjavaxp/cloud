package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.Dealer;

public interface DealerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dealer record);

    int insertSelective(Dealer record);

    Dealer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dealer record);

    int updateByPrimaryKey(Dealer record);
}