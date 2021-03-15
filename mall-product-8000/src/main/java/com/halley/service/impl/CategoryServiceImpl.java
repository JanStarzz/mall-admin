package com.halley.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.mapper.CategoryMapper;
import com.halley.service.CategoryService;
import entity.Category;
import entity.ResponseEntity;
import org.springframework.stereotype.Service;
import util.ResponseEntityUtil;

import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/3 10:45
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Override
    public ResponseEntity<List<Category>> getAll() {
        QueryWrapper<Category> listQueryWrapper = new QueryWrapper<>();
        List<Category> list = list(listQueryWrapper);

        return ResponseEntityUtil.success(list);
    }
}
