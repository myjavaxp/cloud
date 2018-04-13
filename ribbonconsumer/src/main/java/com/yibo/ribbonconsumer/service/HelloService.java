package com.yibo.ribbonconsumer.service;

import com.yibo.springboothello.entity.Mission;

public interface HelloService {
    String helloService();

    String helloFallback();

    String updateMission(Mission mission, Long id);

    String missionFallBack(Mission mission, Long id);
}