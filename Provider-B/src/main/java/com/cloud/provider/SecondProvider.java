package com.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot核心注解，开启自动配置
@SpringBootApplication
public class SecondProvider {
    public static void main(String[] args) {
        SpringApplication.run(SecondProvider.class,args);
    }
}