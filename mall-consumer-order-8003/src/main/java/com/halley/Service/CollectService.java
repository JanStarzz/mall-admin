package com.halley.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import entity.Collect;
import entity.ResponseEntity;

/**
 * @author LuBaby
 * @date 2021/3/13 16:37
 */
public interface CollectService extends IService<Collect> {

    /**
     * 获取或者新建一个收藏夹
     * @param usesId
     * @return
     */
    ResponseEntity getOrCreate(String usesId);
}
