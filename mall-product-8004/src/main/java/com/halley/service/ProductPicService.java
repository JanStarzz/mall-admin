package com.halley.service;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.ProductPicture;
import entity.ResponseEntity;

import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/3 18:33
 */
public interface ProductPicService extends IService<ProductPicture> {

    /**
     * 获取商品详细图片
     * @param id
     * @return
     */
    ResponseEntity<List<ProductPicture>> getPicById(int id);
}
