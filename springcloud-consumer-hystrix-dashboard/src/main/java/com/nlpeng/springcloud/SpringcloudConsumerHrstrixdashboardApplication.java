package com.nlpeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringcloudConsumerHrstrixdashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerHrstrixdashboardApplication.class, args);
    }

}
