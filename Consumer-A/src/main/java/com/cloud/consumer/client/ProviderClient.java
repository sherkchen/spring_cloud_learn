package com.cloud.consumer.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "FIRST-PROVIDER")  // url = "http://localhost:7100"   指定了就走指定的的url 默认： http://FIRST-PROVIDER
public interface ProviderClient {

    @GetMapping(value = "/firstProvider/firstProviderA_one")
    String providerOne();

    @GetMapping(value = "/firstProvider/firstProviderA_two")
    String provideTwo();



}