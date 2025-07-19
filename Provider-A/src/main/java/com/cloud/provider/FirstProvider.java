package com.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//SpringBoot核心注解，开启自动配置
@SpringBootApplication
public class FirstProvider {
    public static void main(String[] args) {
        SpringApplication.run(FirstProvider.class,args);
    }
}