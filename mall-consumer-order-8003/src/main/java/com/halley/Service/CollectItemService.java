package com.halley.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.CollectItem;
import entity.ResponseEntity;

import java.util.Map;

/**
 * @author LuBaby
 * @date 2021/3/13 16:36
 */
public interface CollectItemService extends IService<CollectItem> {

    /**
     * 新增收藏
     * @param map
     * @return
     */

    ResponseEntity addItem(Map map);

    /**
     * 获取收藏夹列表
     * @param collectId
     * @return
     */
    ResponseEntity getItem(Integer collectId);

    /**
     * 删除收藏项
     * @param collectItem
     * @return
     */
    ResponseEntity deleteItem(CollectItem collectItem);
}
