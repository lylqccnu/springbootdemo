package com.ccnu.qing.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/springboot/success")
    public String success(Map<String, Object> map) {
        map.put("hello","你好");
        return "success";
    }
}
