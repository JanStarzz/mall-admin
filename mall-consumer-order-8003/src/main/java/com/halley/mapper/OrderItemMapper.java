package com.halley.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LuBaby
 * @date 2021/3/10 14:39
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
}
