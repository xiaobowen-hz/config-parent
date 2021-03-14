package com.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("native")  // http://localhost:9030/native/index
public class NativeController {

    @Value("${server.port}")    // 从配置文件获取数据
    private String port;

    @GetMapping("/index")
    public String index(){
        return this.port;
    }
}
