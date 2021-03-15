package com.halley.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @author LuBaby
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
    /**
     * 按照分类查找
     * @param category
     * @return
     */
    List<Product> getListByCategory(String category);

    /**
     * 获取分类的
     * @param page
     * @param categoryId
     * @param search
     * @return
     */
    IPage<Product> getPageByCategory(IPage<Product> page, @Param("categoryId") int categoryId,@Param("search") String search);
}
