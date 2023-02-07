package com.swy.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
public class ApplicationController {
    @RequestMapping("/hello")
    @ResponseBody
    public String func1(){
        return "hello world";

    }
}
