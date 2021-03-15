package com.halley.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LuBaby
 * @date 2021/3/4 12:33
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


}
