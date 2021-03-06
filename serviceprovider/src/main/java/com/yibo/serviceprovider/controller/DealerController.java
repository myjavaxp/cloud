package com.yibo.serviceprovider.controller;

import com.yibo.serviceprovider.dao.DealerDao;
import com.yibo.serviceprovider.dao.ScoreEntityDao;
import com.yibo.serviceprovider.entity.Dealer;
import com.yibo.serviceprovider.entity.ScoreEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dealers")
public class DealerController {
    @Resource
    private DealerDao dealerDao;
    @Resource
    private ScoreEntityDao scoreEntityDao;

    @GetMapping
    public List<Dealer> getDealers() {
        return dealerDao.findAll();
    }

    @GetMapping("/{page}/{size}")
    public Page<Dealer> getDealersInPage(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        return dealerDao.findAll(new PageRequest(page, size));
    }

    @PostMapping("/query")
    public List<Dealer> getDealer(@RequestBody Map<String, String> map) {
        return dealerDao.findByProvinceContainingAndCityContaining(map.get("province"), map.get("city"));
    }

    @GetMapping("/score/{scheduleId}/{templateId}")
    public List<ScoreEntity> getScore(@PathVariable Long scheduleId, @PathVariable Long templateId) {
        return scoreEntityDao.getScoreDetail(scheduleId, templateId);
    }
}