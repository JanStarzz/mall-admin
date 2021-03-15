package com.halley.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.Service.CollectItemService;
import com.halley.mapper.CollectItemMapper;
import entity.CollectItem;
import entity.Product;
import entity.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import util.ResponseEntityUtil;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author LuBaby
 * @date 2021/3/13 16:39
 */
@Service
public class CollectItemServiceImpl extends ServiceImpl<CollectItemMapper, CollectItem> implements CollectItemService {

    @Resource
    CollectItemMapper mapper;



    @Override
    public ResponseEntity addItem(Map map) {
        CollectItem collectItem = new CollectItem();
        collectItem.setCollectId((Integer) map.get("collectId")) ;
        collectItem.setProductId(Integer.parseInt((String) map.get("productId")) );
        QueryWrapper<CollectItem> collectItemQueryWrapper = new QueryWrapper<>();
        collectItemQueryWrapper.eq("product_id", collectItem.getProductId());
        if (getOne(collectItemQueryWrapper)==null){
            return ResponseEntityUtil.success(save(collectItem));

        }else {
            return ResponseEntityUtil.error("201","已经存在无需收藏");
        }

    }

    @Override
    public ResponseEntity getItem(Integer collectId) {

        List<Product> list = mapper.getProductForCollect(collectId);
        return ResponseEntityUtil.success(list);
    }

    @Override
    public ResponseEntity deleteItem(CollectItem collectItem) {

        UpdateWrapper<CollectItem> wrapper = new UpdateWrapper<>();
        wrapper.eq("product_id",collectItem.getProductId());
        wrapper.eq("collect_id",collectItem.getCollectId());

        return ResponseEntityUtil.success(remove(wrapper));
    }
}
