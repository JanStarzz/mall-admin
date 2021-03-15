package com.halley.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.ShoppingcartItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LuBaby
 * @date 2021/3/5 13:37
 */
@Mapper
public interface ShoppingcartItemMapper extends BaseMapper<ShoppingcartItem> {

    /**
     * 商品数量+1
     * @param itemId
     * @return
     */
    int incItemCount(Integer itemId);
}
