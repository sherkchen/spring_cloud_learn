package com.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  使用 Feign 消费 Provide-A 提供的 服务
 */
@SpringBootApplication
@EnableFeignClients  // 声明 Feign 客户端的接口 注解用于启用 Feign 客户端功能，使得 Spring Cloud 应用可以自动扫描并注册标记了 @FeignClient 的接口，从而实现服务间的 HTTP 调用。
public class FirstConsumer {

    public static void main(String[] args) {
        SpringApplication.run(FirstConsumer.class,args);
    }
}
