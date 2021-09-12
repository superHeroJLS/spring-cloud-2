package com.example.eureka.eurekaclient.feignclient.controller;

import com.example.eureka.eurekaclient.feignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fc")
public class HiController {
    @Autowired
    private HiService hiService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "name", required = false, defaultValue = "jls")String name) {
        return hiService.sayHi(name);
    }

    @GetMapping("/test")
    public String hi() {
        return "i am from port: " + port + " on feign client";
    }
}
