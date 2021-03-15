package com.halley.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LuBaby
 * @date 2021/3/12 14:16
 */
@Configuration
public class RestTemplateUtil {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
