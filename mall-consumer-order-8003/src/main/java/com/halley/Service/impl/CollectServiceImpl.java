package com.halley.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.Service.CollectService;
import com.halley.mapper.CollectMapper;
import entity.Collect;
import entity.ResponseEntity;
import org.springframework.stereotype.Service;
import util.ResponseEntityUtil;

/**
 * @author LuBaby
 * @date 2021/3/13 16:37
 */
@Service
public class CollectServiceImpl extends ServiceImpl<CollectMapper, Collect> implements CollectService {


    @Override
    public ResponseEntity getOrCreate(String usesId) {

        QueryWrapper<Collect> collectQueryWrapper = new QueryWrapper<>();
        collectQueryWrapper.eq("user_id", usesId);
        Collect one = getOne(collectQueryWrapper);
        if(one==null){
            Collect collect = new Collect();
            collect.setUserId(usesId);
            save(collect);
            one = getOne(collectQueryWrapper);
        }

        return ResponseEntityUtil.success(one);
    }
}
