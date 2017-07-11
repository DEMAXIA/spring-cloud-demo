package com.tangjingxiang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tangjingxiang on 2017/7/8.
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hi")
    public String sayHi(String name){
        return "Hello, " + name;
    }
}
