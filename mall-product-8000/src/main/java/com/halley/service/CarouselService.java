package com.halley.service;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.Carousel;
import entity.ResponseEntity;

import java.util.List;

/**
 * @author LuBaby
 */
public interface CarouselService extends IService<Carousel> {
    /**
     * 获得所有轮播图
     * @return
     */
    ResponseEntity<List<Carousel>> getAllCarousel();
}
