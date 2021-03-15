package com.halley.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.CollectItem;
import entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/13 16:24
 */
@Mapper
public interface CollectItemMapper extends BaseMapper<CollectItem> {
    /**
     * 过去收藏夹里的商品
     * @param collectId
     * @return
     */
    List<Product> getProductForCollect(Integer collectId);
}
