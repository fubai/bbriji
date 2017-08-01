package com.bbriji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationConfig
{
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationConfig.class,args);
    }
}
