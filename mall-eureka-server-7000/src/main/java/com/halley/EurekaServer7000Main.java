package com.halley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LuBaby
 * @date 2021/3/15 14:41
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7000Main {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7000Main.class, args);
    }

}
