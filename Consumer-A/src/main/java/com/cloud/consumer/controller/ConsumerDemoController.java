package com.cloud.consumer.controller;


import com.cloud.consumer.client.ProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//@ResponseBogy和@Controller的组合注解
@RestController
//↓本人通过在类上配置每个类的独立的url映射
@RequestMapping("/firstConsumer")
public class ConsumerDemoController {

    @Resource
    private ProviderClient providerClient;

    //方式一
    @RequestMapping(value = "/consumer_one",method = RequestMethod.GET)
    public String consumerOne(){
        String res = providerClient.providerOne();
        return "consumerOne:  " +  res;
    }
    //方式二
    @GetMapping("/consumer_two")
    public String consumerTwo(){

        String res = providerClient.provideTwo();
        return "consumerTwo:  " +  res;
    }



}
