package com.ztl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/add")
    public String add(){
        System.out.println("add is running...");
        return "/index.html";
    }

    /*
    * 请求转发
    * */
    @RequestMapping("/a")
    public String a(){
        System.out.println("a is running...");
        return "forward:/index.html";
    }

    /*
    * 请求重定向
    * */
    @RequestMapping("/b")
    public String b(){
        System.out.println("b is running...");
        return "redirect:/index.html";
    }

}
