package com.wdbot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("index")
    public String index(){
        System.out.print("TEST SUCCESS");
        return "/WEB-INF/views/index.html";
    }

    @RequestMapping("test")
    public String test1(){
        System.out.print("TEST SUCCESS");
        return "/WEB-INF/views/index.html";
    }

}
