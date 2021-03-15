package com.halley.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.halley.Service.OrderItemService;
import com.halley.Service.OrdersService;
import com.halley.mapper.OrdersMapper;
import entity.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import util.ResponseEntityUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/10 15:23
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Resource
    OrdersMapper ordersMapper;

    @Resource
    OrderItemService orderItemService;

    @Resource
    ObjectMapper mapper;

    @Resource
    RestTemplate restTemplate;

    private static final String cartUrl = "http://localhost:8002/shoppingcart/deleteCartItem/";


    @Override
    public ResponseEntity addOrder(List<LinkedHashMap> list, String userId) {


        Orders order = new Orders();
        order.setShip(false);
        order.setCartId((Integer) list.get(0).get("cartId"));
        order.setAddress((String) list.get(0).get("address"));
        order.setPhoneNum((String) list.get(0).get("phoneNum"));
        order.setDetail((String) list.get(0).get("detail"));
        order.setUserId(userId);
        if (save(order)) {
            ArrayList<OrderItem> orderItems = new ArrayList<>();
            for (LinkedHashMap map: list){

                ProductForShopping p = mapper.convertValue(map, ProductForShopping.class);
                OrderItem orderItem = new OrderItem();
                orderItem.setOrderId(order.getOrderId());
                orderItem.setCount(p.getNum());
                orderItem.setProductId(p.getProductId());
                orderItems.add(orderItem);
                restTemplate.delete(cartUrl+p.getItemId());
            }
            if (orderItemService.saveBatch(orderItems)) {



                return ResponseEntityUtil.success(true);
            }

        }
        return ResponseEntityUtil.error("203","提交失败");
    }

    @Override
    public ResponseEntity getOrderShow(String userId) {
        List<OrderShow> orderShow = ordersMapper.getOrderShow(userId);
        return ResponseEntityUtil.success(orderShow);
    }
}
