package com.example.hikari_lazy_initialize.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.hikari_lazy_initialize.Entities.Children;

@Service
public class ChildrenService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Children getChildById(int cid) {
        String sql = "SELECT c.cid, c.name FROM children c WHERE c.cid = ?";
        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql, cid);
        
        if (result.isEmpty()) {
            return null;
        }

        Map<String, Object> row = result.get(0);
        Children child = new Children();
        child.setCid((Integer) row.get("cid"));
        child.setName((String) row.get("name"));
        
        return child;
    }
}
