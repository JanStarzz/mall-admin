package com.halley.controller;

import com.halley.Service.OrdersService;
import entity.OrderItem;
import entity.Orders;
import entity.ProductForShopping;
import entity.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import util.ResponseEntityUtil;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author LuBaby
 * @date 2021/3/11 14:57
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    OrdersService ordersService;

    @PostMapping("/addOrder/{userId}")
    public ResponseEntity addOrder(@RequestBody Map<String, List> map, @PathVariable String userId){

        return ordersService.addOrder(map.get("list"),userId);
    }

    @GetMapping("/getOrder/{userId}")
    public ResponseEntity getOrder(@PathVariable String userId){
        return ordersService.getOrderShow(userId);
    }
}
