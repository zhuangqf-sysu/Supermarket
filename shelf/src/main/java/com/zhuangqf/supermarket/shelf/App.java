package com.zhuangqf.supermarket.shelf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Supermarket
 * Created by zhuangqf(zhuangqf@asiainfo.com) on 2017/11/7.
 */
@SpringBootApplication
@EnableEurekaServer
public class App {

    public static void main(String[] arg){
        SpringApplication.run(App.class,arg);
    }

}
