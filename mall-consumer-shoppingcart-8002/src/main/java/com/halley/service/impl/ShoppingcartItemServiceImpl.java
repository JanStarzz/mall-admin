package com.halley.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.mapper.ShoppingcartItemMapper;
import com.halley.service.ShoppingcartItemService;
import com.halley.util.GetProductUtil;
import entity.Product;
import entity.ProductForShopping;
import entity.ResponseEntity;
import entity.ShoppingcartItem;
import org.springframework.stereotype.Service;
import util.ProductUtil;
import util.ResponseEntityUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/5 13:45
 */
@Service
public class ShoppingcartItemServiceImpl extends ServiceImpl<ShoppingcartItemMapper, ShoppingcartItem>
        implements ShoppingcartItemService {
    @Resource
    ShoppingcartItemMapper mapper;


    @Override
    public ResponseEntity getCartItemByCartId(Integer cartId) {
        QueryWrapper<ShoppingcartItem> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("shoppingcart_id",cartId);
        List<ShoppingcartItem> list = list(queryWrapper);
        ArrayList<ProductForShopping> forShoppingArrayList = new ArrayList<>();
        for (ShoppingcartItem item : list) {
            forShoppingArrayList.add(ProductUtil.forShopping(GetProductUtil.getProduct(item), item));
        }
        return ResponseEntityUtil.success(forShoppingArrayList);
    }

    @Override
    public ResponseEntity addCartItem(ShoppingcartItem shoppingcartItem, Product product) {
        QueryWrapper<ShoppingcartItem> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("shoppingcart_id",shoppingcartItem.getShoppingcartId())
                .eq("product_id",shoppingcartItem.getProductId());
        ShoppingcartItem one = getOne(queryWrapper);

        if (one!=null){
            if (one.getCount()+1 > product.getProductNum()) {
                return ResponseEntityUtil.error("300","这个商品没货啦！");
            }else {
                return incCartItem(one.getId());
            }
        }else {
            shoppingcartItem.setCount(1);
            mapper.insert(shoppingcartItem);
            ShoppingcartItem byId = getById(shoppingcartItem.getId());
            ProductForShopping productForShopping = ProductUtil.forShopping(GetProductUtil.getProduct(byId), byId);
            return ResponseEntityUtil.customize("200","添加成功",productForShopping);
        }

    }

    @Override
    public ResponseEntity incCartItem(Integer itemId) {
        mapper.incItemCount(itemId);
        return ResponseEntityUtil.customize("201","商品数量+1",itemId);
    }

    @Override
    public ResponseEntity updateCartItem(ProductForShopping item) {
        ShoppingcartItem shoppingcartItem = new ShoppingcartItem();
        shoppingcartItem.setId(item.getItemId());
        shoppingcartItem.setCount(item.getNum());
        shoppingcartItem.setProductId(item.getProductId());
        return ResponseEntityUtil.success(updateById(shoppingcartItem));
    }


}
