package com.tangjingxiang.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: tangjingxiang
 * Date: 2017/7/8
 * Desc:
 */

@FeignClient(value = "spring-cloud-provider")
public interface MyFeignClient {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromOneClient(@RequestParam(value = "name") String name);
}
