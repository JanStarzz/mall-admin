package com.halley.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.halley.mapper.ProductMapper;
import com.halley.service.ProductService;
import entity.Product;
import entity.ProductPicture;
import entity.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.ResponseEntityUtil;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author LuBaby
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Resource
    ProductMapper productMapper;

    @Override
    public ResponseEntity getList() {
        QueryWrapper<Product> productQueryWrapper = new QueryWrapper<>();
        List<Product> list = list(productQueryWrapper);
        return ResponseEntityUtil.success(list);
    }

    @Override
    public ResponseEntity<List<Product>> getListByCategory(String category) {
        List<Product> listByCategory = productMapper.getListByCategory(category);
        return ResponseEntityUtil.success(listByCategory);
    }

    @Override
    public ResponseEntity<List<Product>> getPageByCategory(Map map) {
        Integer current = (Integer) map.get("current");
        Integer size = (Integer) map.get("size");
        int categoryId = (Integer) map.get("categoryId") ;
        String search = (String) map.get("search");
        Page page = new Page(current,size);
        IPage pageByCategory = productMapper.getPageByCategory(page, categoryId, search);


        return ResponseEntityUtil.success(pageByCategory);
    }

    @Override
    public ResponseEntity<Boolean> updateNum(Product product) {



        return ResponseEntityUtil.success(productMapper.updateNumAndSale(product)==1);
    }


}
