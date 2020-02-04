package com.nlpeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.*;

@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class SpringcloudEureka7001Application {

    public static void main(String[] args) {
    
    
        List a = new ArrayList();
        ArrayList b = new ArrayList();
        a.toArray();
        b.trimToSize();
        HashMap hashMap = new HashMap();
        Set set = hashMap.entrySet();
        List list = new ArrayList(set);
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    
        SpringApplication.run(SpringcloudEureka7001Application.class, args);
    }

}
