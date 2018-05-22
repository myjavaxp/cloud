package com.yibo.serviceprovider.dao;

import com.yibo.serviceprovider.entity.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreEntityDao extends JpaRepository<ScoreEntity,String> {
    List<ScoreEntity> getScoreDetail(Long scheduleId,Long templateId);
}
