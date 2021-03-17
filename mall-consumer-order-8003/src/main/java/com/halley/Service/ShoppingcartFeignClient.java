package com.halley.Service;

import entity.ResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author LuBaby
 * @date 2021/3/17 10:50
 */
@Component
@FeignClient(value = "MALL-CONSUMER-SHOPPINGCART")
public interface ShoppingcartFeignClient {

    /**
     * Feign客户端调用购物车
     * @param id
     * @return
     */
    @DeleteMapping("/shoppingcart/deleteCartItem/{id}")
    ResponseEntity deleteItem(@PathVariable(value = "id") Integer id);
}
