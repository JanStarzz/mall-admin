package com.halley.controller;


import com.halley.service.CarouselService;
import com.halley.service.CategoryService;
import com.halley.service.ProductPicService;
import com.halley.service.ProductService;
import entity.Category;
import entity.Product;
import entity.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import util.ResponseEntityUtil;

import javax.annotation.Resource;
import java.util.Map;


/**
 * @author LuBaby
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    ProductService productService;

    @Resource
    CategoryService categoryService;

    @Resource
    ProductPicService productPicService;

    @Resource
    CarouselService carouselService;

    @GetMapping("/all")
    public ResponseEntity getAllProduct(){
        ResponseEntity list = productService.getList();
        return list;
    }

    @GetMapping("/category")
    public ResponseEntity getAllCategory(){
        return categoryService.getAll();
    }


    @PostMapping("/getPromoProduct")
    public ResponseEntity getByCategory(@RequestBody Category category){
        return  productService.getListByCategory(category.getCategoryName());
    }

    @PostMapping("/getPageProduct")
    public ResponseEntity getPage(@RequestBody Map map){
        return productService.getPageByCategory(map);
    }

    @GetMapping("/getDetails/{id}")
    public ResponseEntity getById(@PathVariable int id){
        return ResponseEntityUtil.success(productService.getById(id));
    }

    @GetMapping("/getDetailsPicture/{id}")
    public ResponseEntity getPicById(@PathVariable int id){
        return productPicService.getPicById(id);
    }

    @GetMapping("/carousel")
    public ResponseEntity getCarousel(){
        return carouselService.getAllCarousel();
    }

    @PostMapping("/product")
    public ResponseEntity<Boolean> updateNum(@RequestBody Product product){
        return productService.updateNum(product);
    }
}
