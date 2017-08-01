package com.bbriji.gateway.config;

import com.bbriji.gateway.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhangxingke on 2017/8/1.
 */
@Configuration
public class FilterConfig {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
