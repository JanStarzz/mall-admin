package com.halley.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halley.mapper.UserMapper;
import com.halley.service.UserService;
import entity.User;
import org.springframework.stereotype.Service;

/**
 * @author LuBaby
 * @date 2021/3/4 12:36
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
