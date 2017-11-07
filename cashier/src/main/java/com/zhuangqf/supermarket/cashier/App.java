package com.zhuangqf.supermarket.cashier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Supermarket
 * Created by zhuangqf(zhuangqf@mail2.sysu.edu.cn) on 2017/11/7.
 */
@EnableZuulProxy
@SpringBootApplication
public class App {

    public static void main(String[] arg){
        SpringApplication.run(App.class,arg);
    }

}
