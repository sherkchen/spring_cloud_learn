package com.eureka.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//为SpringBoot核心注解，目的是开启自动配置
@SpringBootApplication
//引入下方注解可以将项目作为SpringCloud中的注册中心
@EnableEurekaServer
public class EurekaServiceStart {
    public static void main(String[] args) {
        //创建SpringApplication对象，在初始化对象是保存事件监听器
        //容器在初始化判断是否为web应用，并保存main方法的主配置类
        //调用run方法，准备spring上下文，完成初始化，创建，加载。会在不同时机触发监听器不同事件
        SpringApplication.run(EurekaServiceStart.class,args);
    }
}
