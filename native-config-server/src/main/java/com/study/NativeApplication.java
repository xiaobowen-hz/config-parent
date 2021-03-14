package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/* 配置中心 - 本地创库版
 * ===================================================
 * 搭建配置中心服务，对每个微服务的配置文件做统一的管理
 * ===================================================
 * 服务地址：http://localhost:9010
 * 说明：引入配置中心的核心依赖，并在配置文件中做相应的配置；根据
 *      本地仓库的地址创建其他服务的配置文件，最后在启动类添加注
 *      解@EnableConfigServer将服务声明为配置中心
 *
 * 步骤：-1-【特有】引入配置中心的核心依赖
 *      -2-【特有】添加配置信息，详见application.yml文件
 *      -3-【特有】根据配置的本地仓库的地址创建其他服务的配置文
 *      件
 *      -4-【特有】在启动类声明@EnableConfigServer
 * 版本：0.0.1*/

@SpringBootApplication
@EnableConfigServer     // 声明配置中心
public class NativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeApplication.class,args);
    }
}
