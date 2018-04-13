package com.yibo.springboothello.controller;

import com.yibo.springboothello.entity.Mission;
import com.yibo.springboothello.service.MissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mission")
public class MissionController {
    @Resource
    private MissionService missionService;

    @GetMapping("/{id}")
    public Mission findById(@PathVariable Long id) {
        return missionService.getMission(id);
    }

    @PostMapping
    public String addMission(@RequestBody Mission mission) {
        missionService.addMission(mission);
        return "任务新增成功";
    }

    @PostMapping("/{id}")
    public String updateMission(@RequestBody Mission mission, @PathVariable Long id) throws InterruptedException {
        Thread.sleep(10000L);
        missionService.updateMission(mission, id);
        return "任务修改成功";
    }

    @DeleteMapping("/{id}")
    public String deleteMission(@PathVariable Long id) {
        missionService.deleteMission(id);
        return "任务删除成功";
    }
}