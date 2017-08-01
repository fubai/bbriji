package com.bbriji.manage.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangxingke on 2017/8/1.
 */
@FeignClient("bbriji-website")
public interface UserService {

    @RequestMapping(value = "test",method = RequestMethod.GET)
    int test();
}
