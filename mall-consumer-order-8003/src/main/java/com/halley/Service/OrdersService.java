package com.halley.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.Orders;
import entity.ProductForShopping;
import entity.ResponseEntity;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/10 15:23
 */
public interface OrdersService extends IService<Orders> {
    /**
     * 添加订单
     * @param list
     * @param userId
     * @return
     */
    ResponseEntity addOrder(List<LinkedHashMap> list, String userId);

    /**
     * 获取订单内容
     * @param userId
     * @return
     */
    ResponseEntity getOrderShow(String userId);

}
