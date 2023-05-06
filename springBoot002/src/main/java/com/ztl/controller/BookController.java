package com.ztl.controller;


import com.alibaba.fastjson.JSON;
import com.ztl.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/book")
public class BookController {



    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam List<String> likes){
        System.out.println(likes);
        return JSON.toJSONString(likes);
    }
}
