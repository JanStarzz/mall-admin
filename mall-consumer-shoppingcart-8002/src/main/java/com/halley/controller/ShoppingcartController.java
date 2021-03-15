package com.halley.controller;

import com.halley.service.ShoppingcartItemService;
import com.halley.service.ShoppingcartService;
import com.halley.util.GetProductUtil;
import entity.*;
import org.springframework.web.bind.annotation.*;
import util.ResponseEntityUtil;

import javax.annotation.Resource;

/**
 * @author LuBaby
 * @date 2021/3/5 13:08
 */

@RestController
@RequestMapping(value = "/shoppingcart")
public class ShoppingcartController {



    @Resource
    ShoppingcartService shoppingcartService;

    @Resource
    ShoppingcartItemService shoppingcartItemService;



    @GetMapping("/getShoppingcart/{userId}")
    public ResponseEntity getShoppingcart(@PathVariable String userId){

        return shoppingcartService.getByUserId(userId);
    }


    @GetMapping("/getCartItem/{userId}")
    public ResponseEntity getShoppingcartItem(@PathVariable String userId){
        ResponseEntity<Shoppingcart> byUserId = shoppingcartService.getByUserId(userId);
        return shoppingcartItemService.getCartItemByCartId(byUserId.getData().getId());
    }

    @PostMapping("/addItem")
    public ResponseEntity addCartItem(@RequestBody ShoppingcartItem item){
        Product product = GetProductUtil.getProduct(item);
        return shoppingcartItemService.addCartItem(item, product);
    }

    @PutMapping("/incItem")
    public ResponseEntity incShoppingcartItem(@RequestBody ShoppingcartItem item){
        return shoppingcartItemService.incCartItem(item.getId());
    }

    @PutMapping("/updateShoppingCart")
    public ResponseEntity updateItem(@RequestBody ProductForShopping product){
        return shoppingcartItemService.updateCartItem(product);
    }

    @DeleteMapping("/deleteCartItem/{id}")
    public ResponseEntity deleteItem(@PathVariable Integer id){
        return ResponseEntityUtil.success(shoppingcartItemService.removeById(id));
    }

}
