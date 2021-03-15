package com.halley.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LuBaby
 * @date 2021/3/8 15:48
 */
@Configuration
public class RestfulTemplateConfig {

    @Bean
    public  RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
