package com.halley.controller;

import com.halley.Service.CollectItemService;
import com.halley.Service.CollectService;
import entity.Collect;
import entity.CollectItem;
import entity.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import util.ResponseCode;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author LuBaby
 * @date 2021/3/13 16:23
 */
@RestController
@RequestMapping("/collect")
public class CollectController {
    @Resource
    CollectService collectService;

    @Resource
    CollectItemService collectItemService;

    @GetMapping("/getCollect/{userId}")
    public ResponseEntity getCollect(@PathVariable String userId){

        return collectService.getOrCreate(userId);
    }

    @PutMapping("/addCollectItem")
    public ResponseEntity addCollectItem(@RequestBody Map map){
        return collectItemService.addItem(map);
    }

    @GetMapping("/getCollectItem/{collectItem}")
    public ResponseEntity getCollectItem(@PathVariable Integer collectItem){
        return collectItemService.getItem(collectItem);
    }

    @DeleteMapping("/deleteCollect")
    public ResponseEntity deleteCollectItem(@RequestBody CollectItem collectItem){
        return collectItemService.deleteItem(collectItem);
    }

}
