package com.zhuangqf.supermarket.cashier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Supermarket
 * Created by zhuangqf(zhuangqf@mail2.sysu.edu.cn) on 2017/11/8.
 */
@Controller
public class LoginController {

    @RequestMapping({"home","/"})
    public String home(){
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
