package com.bbriji.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangxingke on 2017/8/1.
 */
@RestController
public class UserController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public int test(){
        List<String> services = discoveryClient.getServices();
        services.forEach(x->
                discoveryClient.getInstances(x).forEach(y->
                        System.out.println(y.getHost()
                                + ":" + y.getServiceId()
                                + ":" + y.getMetadata()
                                + ":" + y.getPort()
                                + ":" + y.getUri())));
        return 0;
    }

}
