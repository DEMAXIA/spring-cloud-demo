package com.tangjingxiang.controller;

import com.tangjingxiang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tangjingxiang
 * Date: 2017/7/8
 * Desc:
 */
@RestController
public class HelloControlller {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String sayHi(String name){
        return helloService.sayHi(name);
    }
}
