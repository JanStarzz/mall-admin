package com.halley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author LuBaby
 * @date 2021/3/10 14:27
 */
@EnableFeignClients
@SpringBootApplication
public class ConsumerOrder8003Main {


    public static void main(String[] args){
        SpringApplication.run(ConsumerOrder8003Main.class, args);
    }

}
