package com.eureka.start;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//如果不配置则所有服务无法访问Eureka的服务
//允许路径中包含eureka及eureka/**的请求去访问Eureka服务
@EnableWebSecurity
public class WebSec extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(httpSecurity);
    }
}