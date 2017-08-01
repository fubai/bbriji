package com.bbriji.manage.service;

import com.bbriji.manage.fallback.UserServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangxingke on 2017/8/1.
 */
@FeignClient(value = "bbriji-website",fallback = UserServiceFallback.class)
public interface UserService {

    @RequestMapping(value = "test",method = RequestMethod.GET)
    int test();
}
