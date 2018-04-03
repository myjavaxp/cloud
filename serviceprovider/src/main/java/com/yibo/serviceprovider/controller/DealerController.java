package com.yibo.serviceprovider.controller;

import com.yibo.serviceprovider.dao.DealerRepository;
import com.yibo.serviceprovider.entity.Dealer;
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
    private DealerRepository dealerRepository;

    @GetMapping
    public List<Dealer> getDealers() {
        return dealerRepository.findAll();
    }

    @GetMapping("/{page}/{size}")
    public Page<Dealer> getDealersInPage(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        return dealerRepository.findAll(new PageRequest(page, size));
    }

    @PostMapping("/query")
    public List<Dealer> getDealer(@RequestBody Map<String, String> map) {
        return dealerRepository.findByProvinceContainingAndCityContaining(map.get("province"), map.get("city"));
    }
}