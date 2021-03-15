package com.halley.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.mapper.ShoppingcartMapper;
import com.halley.service.ShoppingcartService;
import entity.ResponseEntity;
import entity.Shoppingcart;
import org.springframework.stereotype.Service;
import util.ResponseEntityUtil;

/**
 * @author LuBaby
 * @date 2021/3/5 9:04
 */
@Service
public class ShoppingcartServiceImpl extends ServiceImpl<ShoppingcartMapper, Shoppingcart> implements ShoppingcartService {


    @Override
    public ResponseEntity<Shoppingcart> getByUserId(String userId) {
        QueryWrapper<Shoppingcart> shoppingcartQueryWrapper = new QueryWrapper<>();
        shoppingcartQueryWrapper.eq("user_id",userId);
        Shoppingcart one = getOne(shoppingcartQueryWrapper);
        if (one==null) {
            Shoppingcart shoppingcart = new Shoppingcart(null, userId);
            save(shoppingcart);
            one = getOne(shoppingcartQueryWrapper);
        }


        return ResponseEntityUtil.success(one);
    }
}
