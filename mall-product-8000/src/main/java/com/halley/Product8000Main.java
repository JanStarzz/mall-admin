package com.halley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LuBaby
 */
@EnableEurekaClient
@SpringBootApplication
public class Product8000Main {
    public static void main(String[] args){
        SpringApplication.run(Product8000Main.class, args);
    }

}
