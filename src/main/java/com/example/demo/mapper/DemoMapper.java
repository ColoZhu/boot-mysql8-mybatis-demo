package com.example.demo.mapper;

import com.example.demo.entity.Demo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}