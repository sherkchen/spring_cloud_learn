package com.cloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBogy和@Controller的组合注解
@RestController
//↓本人通过在类上配置每个类的独立的url映射
@RequestMapping("/firstProvider")
public class ProviderController {
    //方式一
    @RequestMapping(value = "/firstProviderA_one",method = RequestMethod.GET)
    public String providerOne(){
        return "this is first providerB one !";
    }
    //方式二
    @GetMapping("/firstProviderA_two")
    public String providerTwo(){
        return "this is first providerB  two!";
    }
}