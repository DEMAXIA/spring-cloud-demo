package com.tangjingxiang.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Author: tangjingxiang
 * Date: 2017/7/8
 * Desc:
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String name){
        return restTemplate.getForObject("http://SPRING-CLOUD-PROVIDER/hi?name=" + name, String.class);
    }


    public String hiError(String name){
        return "hi, " + name + ", some errors occured!";
    }

}
