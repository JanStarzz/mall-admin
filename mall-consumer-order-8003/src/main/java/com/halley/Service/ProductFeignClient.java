package com.halley.Service;

import entity.Product;
import entity.ResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author LuBaby
 * @date 2021/3/17 10:20
 */

@Component
@FeignClient(value = "MALL-PRODUCT")
public interface ProductFeignClient {
    /**
     * 更新Product信息
     * @param product
     * @return
     */
    @PostMapping(value="/product/product",consumes = "application/json")
    ResponseEntity<Boolean> updateNum(@RequestBody Product product);

}
