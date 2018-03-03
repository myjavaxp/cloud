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
    public Object findById(@PathVariable Long id){
        try {
            return missionService.getMission(id);
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    @PostMapping
    public Object addMission(@RequestBody Mission mission){
        try {
            missionService.addMission(mission);
            return "任务新增成功";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    @PutMapping("/{id}")
    public Object updateMission(@RequestBody Mission mission,@PathVariable Long id){
        try {
            missionService.updateMission(mission,id);
            return "任务修改成功";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
    @DeleteMapping("/{id}")
    public Object deleteMission(@PathVariable Long id){
        try {
            missionService.deleteMission(id);
            return "任务删除成功";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}