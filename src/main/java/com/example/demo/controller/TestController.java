package com.example.demo.controller;

import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private DemoService demoService;

    //http://localhost:8887/test/queryOne
    @GetMapping("/queryOne")
    public String queryOne() {
        Demo demo = demoService.queryOne(1);
        return demo.toString();
    }


    @PostMapping(value = "insert")
    public String insert(@RequestBody Demo demo) {
        //String s = JSONObject.toJSONString(stu);
        int i = demoService.insert(demo);
        //colo branch
        return "测试成功!:结果:" + i;
    }

}
