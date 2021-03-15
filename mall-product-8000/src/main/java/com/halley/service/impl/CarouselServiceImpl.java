package com.halley.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.mapper.CarouselMapper;
import com.halley.service.CarouselService;
import entity.Carousel;
import entity.ResponseEntity;

import org.springframework.stereotype.Service;
import util.ResponseEntityUtil;

import java.util.List;

/**
 * @author LuBaby
 */
@Service
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, Carousel> implements CarouselService {


    @Override
    public ResponseEntity<List<Carousel>> getAllCarousel() {
        QueryWrapper<Carousel> productQueryWrapper = new QueryWrapper<>();
        List<Carousel> list = list(productQueryWrapper);
        return ResponseEntityUtil.success(list);
    }
}
