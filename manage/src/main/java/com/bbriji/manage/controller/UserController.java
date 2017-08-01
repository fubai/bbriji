package com.bbriji.manage.controller;

import com.bbriji.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangxingke on 2017/8/1.
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        return restTemplate.getForEntity("http://BBRIJI-WEBSITE/test",String.class).getBody();
    }

    @RequestMapping(value = "test2",method = RequestMethod.GET)
    public int test2(){
        return userService.test();
    }
}
