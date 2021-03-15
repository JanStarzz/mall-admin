package com.halley.service;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.ResponseEntity;
import entity.Shoppingcart;

/**
 * @author LuBaby
 */
public interface ShoppingcartService extends IService<Shoppingcart> {

    /**
     * 获取用户购物车
     * @param userId
     * @return
     */
    ResponseEntity<Shoppingcart> getByUserId(String userId);

}
