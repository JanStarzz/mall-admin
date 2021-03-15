package com.halley.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.core.JsonParser;
import com.halley.service.UserService;
import com.halley.wechatutil.WeChatModel;
import com.halley.wechatutil.WeChatSessionModel;
import entity.ResponseEntity;
import entity.User;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import util.ResponseEntityUtil;

import javax.annotation.Resource;

/**
 * @author LuBaby
 * @date 2021/3/4 11:09
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    @Resource
    RestTemplate restTemplate;

    @Resource
    UserService userService;

    private static final String APPID = "wxfd28bb7875ca0a08";

    private static final String APPSECRET = "057d7fc8ed390aae13b454263376bfc1";



    @PostMapping("/login")
    public ResponseEntity wechatLogin(@RequestBody WeChatModel weChatModel){
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+APPID+ "&secret="+APPSECRET+"&js_code="+ weChatModel.getCode() +"&grant_type=authorization_code";
        org.springframework.http.ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String body = responseEntity.getBody();
        WeChatSessionModel weChatSessionModel = JSONUtil.toBean(body, WeChatSessionModel.class);
        User user = new User(weChatSessionModel.getOpenid(),null,null,null,weChatModel.getNickName());

        if (userService.getById(weChatSessionModel.getOpenid())==null){
            userService.save(user);
        }
        return ResponseEntityUtil.success(user);

    }
}
