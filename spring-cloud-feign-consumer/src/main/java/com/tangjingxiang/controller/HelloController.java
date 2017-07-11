package com.tangjingxiang.controller;

import com.tangjingxiang.client.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tangjingxiang
 * Date: 2017/7/8
 * Desc:
 */

@RestController
public class HelloController {

    @Autowired
    private MyFeignClient myFeignClient;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name") String name){
        return myFeignClient.sayHiFromOneClient(name);
    }

}
