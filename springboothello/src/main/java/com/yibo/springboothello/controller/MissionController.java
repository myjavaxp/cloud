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

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object get(@RequestParam("id") Long id) {
        try {
            return missionService.getMission(id);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public Object post(@RequestBody Mission mission){
        try {
            missionService.addMission(mission);
            return "新增任务成功";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}