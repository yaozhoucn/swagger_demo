package com.yaozhou.swagger_demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by WXHang on HANG at 2021/9/24 11:58
 * Desc：
 */
@Service
public class AsyncService {
    //告诉spring这是一个异步方法
    @Async
    public void hello(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据处理中。。。。。");
    }
}
