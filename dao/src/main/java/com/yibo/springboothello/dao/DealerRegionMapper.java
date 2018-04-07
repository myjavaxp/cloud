package com.yibo.springboothello.dao;

import com.yibo.springboothello.entity.DealerRegion;

public interface DealerRegionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DealerRegion record);

    int insertSelective(DealerRegion record);

    DealerRegion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DealerRegion record);

    int updateByPrimaryKey(DealerRegion record);
}