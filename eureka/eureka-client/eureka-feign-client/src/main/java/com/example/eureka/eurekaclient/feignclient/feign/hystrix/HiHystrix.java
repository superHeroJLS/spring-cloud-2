package com.example.eureka.eurekaclient.feignclient.feign.hystrix;

import com.example.eureka.eurekaclient.feignclient.feign.EurekaFeignClient;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaFeignClient {

    @Override
    public String sayHiFromEurekaClientProvider(String name) {
        return "hi, " + name + ", error!";
    }
}
