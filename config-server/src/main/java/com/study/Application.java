package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/* 注册中心
 * =================================
 * =================================
 * 访问地址：http://localhost:9000
 *
 * 【特有】添加注册中心核心依赖
 * 【特有】声明@EnableEurekaServer
 * */

@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
