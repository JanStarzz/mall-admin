package com.halley.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halley.mapper.CategoryMapper;
import entity.Category;
import entity.ResponseEntity;

import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/3 10:42
 */
public interface CategoryService extends IService<Category> {

    /**
     * 获取全部分类
     * @return
     */
    ResponseEntity<List<Category>> getAll();
}
