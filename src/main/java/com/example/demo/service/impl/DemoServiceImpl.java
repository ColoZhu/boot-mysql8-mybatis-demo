package com.example.demo.service.impl;

import com.example.demo.entity.Demo;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoMapper demoMapper;

    @Override
    public Demo queryOne(Integer id) {
        return demoMapper.selectByPrimaryKey(id);
    }
    @Override
    public int insert(Demo demo) {
        return demoMapper.insert(demo);
    }
}
