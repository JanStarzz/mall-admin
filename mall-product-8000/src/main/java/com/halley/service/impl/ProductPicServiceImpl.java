package com.halley.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.mapper.ProductPicMapper;
import com.halley.service.ProductPicService;
import entity.ProductPicture;
import entity.ResponseEntity;
import org.springframework.stereotype.Service;
import util.ResponseEntityUtil;

import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/3 18:34
 */
@Service
public class ProductPicServiceImpl extends ServiceImpl<ProductPicMapper, ProductPicture> implements ProductPicService {
    @Override
    public ResponseEntity<List<ProductPicture>> getPicById(int id) {
        QueryWrapper<ProductPicture> productPictureQueryWrapper = new QueryWrapper<>();
        productPictureQueryWrapper.eq("product_id",id);
        List<ProductPicture> list = list(productPictureQueryWrapper);
        return ResponseEntityUtil.success(list);
    }
}
