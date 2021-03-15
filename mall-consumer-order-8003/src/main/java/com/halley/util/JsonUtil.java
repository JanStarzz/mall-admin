package com.halley.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author LuBaby
 * @date 2021/3/12 9:36
 */
@Component
public class JsonUtil {

    @Bean
    public ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }

}
