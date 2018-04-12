package com.yibo.serviceprovider.dao;

import com.yibo.springboothello.entity.Mission;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class MissionDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<Mission> selectMissions() {
        String sql = "select * from mission";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Mission mission = new Mission();
            mission.setBrandId(rs.getLong("brand_id"));
            mission.setBrandTemplateId(rs.getLong("brand_template_id"));
            return null;
        });
    }
}