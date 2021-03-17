package com.halley.service;


import com.baomidou.mybatisplus.extension.service.IService;

import entity.Product;
import entity.ProductPicture;
import entity.ResponseEntity;

import java.util.List;
import java.util.Map;

/**
 * @author LuBaby
 */
public interface ProductService extends IService<Product> {
    /**
     * 获取全部商品
     * @return
     */
    ResponseEntity<List<Product>> getList();

    /**
     * 分类获取
     * @param category
     * @return
     */
    ResponseEntity<List<Product>> getListByCategory(String category);

    /**
     * 分页查询
     * @param map
     * @return
     */
    ResponseEntity<List<Product>> getPageByCategory(Map map);

    /**
     * 修改销量和库存
     * @param product
     * @return
     */
    ResponseEntity updateNum(Product product);


}
