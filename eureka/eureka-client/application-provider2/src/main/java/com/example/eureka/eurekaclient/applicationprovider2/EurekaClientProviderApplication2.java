package com.example.eureka.eurekaclient.applicationprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientProviderApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProviderApplication2.class, args);
    }
}
