package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.SysSeq;

public interface SysSeqMapper {
    int deleteByPrimaryKey(String seqName);

    int insert(SysSeq record);

    int insertSelective(SysSeq record);

    SysSeq selectByPrimaryKey(String seqName);

    int updateByPrimaryKeySelective(SysSeq record);

    int updateByPrimaryKey(SysSeq record);
}