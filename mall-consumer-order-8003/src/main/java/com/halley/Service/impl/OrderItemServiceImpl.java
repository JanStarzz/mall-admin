package com.halley.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.Service.OrderItemService;
import com.halley.mapper.OrderItemMapper;
import entity.OrderItem;
import entity.ProductForShopping;
import entity.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author LuBaby
 * @date 2021/3/10 14:40
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService{

}
