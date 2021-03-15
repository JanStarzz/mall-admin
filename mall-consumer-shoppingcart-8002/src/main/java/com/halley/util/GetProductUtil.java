package com.halley.util;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import entity.Product;
import entity.ResponseEntity;
import entity.ShoppingcartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.LinkedHashMap;

/**
 * @author LuBaby
 * @date 2021/3/9 13:25
 */
@Component
public class GetProductUtil {


    private static final String productUrl = "http://localhost:8000/product/";

    public static Product getProduct(ShoppingcartItem item){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity productDetail = restTemplate.getForObject(productUrl + "getDetails/" + item.getProductId(), ResponseEntity.class);
        JSONObject jsonObject = JSONUtil.parseFromMap((LinkedHashMap) productDetail.getData());
        return JSONUtil.toBean(jsonObject, Product.class);
    }

}
