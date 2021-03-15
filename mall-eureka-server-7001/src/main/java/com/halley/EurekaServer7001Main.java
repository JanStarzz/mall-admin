package com.halley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LuBaby
 * @date 2021/3/15 16:01
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001Main {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7001Main.class, args);
    }
    
}
