package com.halley.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.halley.Service.OrderItemService;
import com.halley.Service.OrdersService;
import com.halley.Service.ProductFeignClient;
import com.halley.Service.ShoppingcartFeignClient;
import com.halley.mapper.OrdersMapper;
import entity.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import util.ResponseCode;
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
    ShoppingcartFeignClient shoppingcartFeignClient;

    @Resource
    ProductFeignClient productFeignClient;


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public ResponseEntity addOrder(List<LinkedHashMap> list, String userId) {


        Orders order = new Orders();
        order.setShip(false);
        order.setCartId((Integer) list.get(0).get("cartId"));
        order.setAddress((String) list.get(0).get("address"));
        order.setPhoneNum((String) list.get(0).get("phoneNum"));
        order.setDetail((String) list.get(0).get("detail"));
        order.setUserId(userId);
        Object savepoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();
        if (save(order)) {
            ArrayList<OrderItem> orderItems = new ArrayList<>();
            for (LinkedHashMap map: list){

                ProductForShopping p = mapper.convertValue(map, ProductForShopping.class);
                OrderItem orderItem = new OrderItem();
                Product product = new Product();
                orderItem.setOrderId(order.getOrderId());
                orderItem.setCount(p.getNum());
                orderItem.setProductId(p.getProductId());
                orderItems.add(orderItem);
                product.setProductId(p.getProductId());
                product.setProductNum(p.getNum());
                shoppingcartFeignClient.deleteItem(p.getItemId());
                if (!productFeignClient.updateNum(product).getData()){
                    TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savepoint);
                    return ResponseEntityUtil.error(ResponseCode.DATABASE_ERROR.getCode()
                            ,"您订单中的"+p.getProductName()+"库存不足，返回购物车");
                }
            }
            if (orderItemService.saveBatch(orderItems)) {



                return ResponseEntityUtil.success(ResponseCode.SUCCESS.getCode());
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
