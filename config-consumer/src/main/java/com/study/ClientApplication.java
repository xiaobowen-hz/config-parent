package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 配置中心的客户端
 * ===================================================
 * 从配置中心获取本服务的配置信息
 * ===================================================
 * 访问地址：http://localhost:9020/native/index
 * 说明：引入配置中心客户端的核心依赖，并通过配置文件从配置中心拉
 *      取本服务的配置信息；
 * ---------------------------------------------------
 * 重点声明：配置文件使用bootstrap命名，不再使用application
 *
 * 步骤：-1-【特有】引入配置中心客户端的核心依赖
 *      -2-【特有】通过配置到配置中中心拉取本服务的配置信息
 *      -3-测试，启动注册中心
 *      -4-     启动配置中心
 *      -5-     启动本服务，输入访问地址后显示本服务端口即可
 * 版本：0.0.1*/

@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }
}
