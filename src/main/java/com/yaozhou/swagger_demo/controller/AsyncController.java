package com.yaozhou.swagger_demo.controller;

import com.yaozhou.swagger_demo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WXHang on HANG at 2021/9/24 11:59
 * Desc：
 */
@Controller
public class AsyncController {
    @Autowired
    AsyncService asyncService;
    @RequestMapping("/asyncHello")
    @ResponseBody
    public String asyncHello(){
        asyncService.hello();
        return "success";
    }

}
