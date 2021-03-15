package com.halley.service;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.Product;
import entity.ProductForShopping;
import entity.ResponseEntity;
import entity.ShoppingcartItem;

/**
 * @author LuBaby
 */
public interface ShoppingcartItemService extends IService<ShoppingcartItem> {
    /**
     * 获取用户购物车的商品
     * @param cartId
     * @return
     */
    ResponseEntity getCartItemByCartId(Integer cartId);

    /**
     * 向购物车添加新物品
     * @param shoppingcartItem
     * @param product
     * @return
     */
    ResponseEntity addCartItem(ShoppingcartItem shoppingcartItem, Product product);

    /**
     * 数量增加
     * @param itemId
     * @return
     */
    ResponseEntity incCartItem(Integer itemId);

    /**
     * 更新购物车信息
     * @param item
     * @return
     */
    ResponseEntity updateCartItem(ProductForShopping item);
}
