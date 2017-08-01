package com.bbriji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 管理控制台
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ApplicationManage
{
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationManage.class,args);
    }
}
