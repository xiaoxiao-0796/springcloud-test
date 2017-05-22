package com.xiaofei.spring.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 开启Config Server
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/5/21 0021 ProjectName: spring-cloud-tets
 */
@SpringBootApplication
@EnableConfigServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
