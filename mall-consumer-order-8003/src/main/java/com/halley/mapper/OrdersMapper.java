package com.halley.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.OrderShow;
import entity.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/10 14:37
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
    /**
     * 获得订单整体的对象
     * @param userId
     * @return
     */
    List<OrderShow> getOrderShow(String userId);
}
