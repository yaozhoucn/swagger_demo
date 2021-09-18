package com.yaozhou.swagger_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WXHang on HANG at 2021/9/18 14:56
 * Desc：
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "hello";
    }

}
