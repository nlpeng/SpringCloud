package com.nlpeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class SpringcloudConfigDeptClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigDeptClient8001Application.class, args);
    }

}
