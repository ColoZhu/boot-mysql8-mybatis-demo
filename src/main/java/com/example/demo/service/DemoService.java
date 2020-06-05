package com.example.demo.service;

import com.example.demo.entity.Demo;

/**
 * Created by MySelf on 2019/4/9.
 */
public interface DemoService {


    Demo queryOne(Integer id);

    int insert(Demo demo);
}
