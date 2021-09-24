package com.yaozhou.swagger_demo.controller;

import com.yaozhou.swagger_demo.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WXHang on HANG at 2021/9/18 14:56
 * Desc：
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String Hello(){
        return "hello";
    }

    @ApiOperation("方法注释")
    @PostMapping(value = "/getUser")
    public User getUser(@ApiParam("参数注释") String username){
        return new User();
    }

}
