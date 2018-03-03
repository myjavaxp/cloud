package com.yibo.springboothello.service;

import com.yibo.springboothello.entity.Mission;

public interface MissionService {
    Mission getMission(Long id);

    void addMission(Mission mission);

    void updateMission(Mission mission,Long id);

    void deleteMission(Long id);
}
