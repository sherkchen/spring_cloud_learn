package com.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  使用 Feign 消费 Provide-A 提供的 服务
 */
@SpringBootApplication
@EnableFeignClients  // 声明 Feign 客户端的接口
public class FirstConsumer {

    public static void main(String[] args) {
        SpringApplication.run(FirstConsumer.class,args);
    }
}
