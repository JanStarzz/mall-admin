package com.halley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LuBaby
 */
@EnableEurekaClient
@SpringBootApplication
public class ProductMain {
    public static void main(String[] args){
        SpringApplication.run(ProductMain.class, args);
    }

}
