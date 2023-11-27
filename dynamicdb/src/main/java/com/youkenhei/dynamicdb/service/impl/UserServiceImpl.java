package com.youkenhei.dynamicdb.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youkenhei.dynamicdb.mapper.UserMapper;
import com.youkenhei.dynamicdb.pojo.User;
import com.youkenhei.dynamicdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    public Page<User> selectPageAge(Page<User> page, Integer age){
        return userMapper.selectPageAge(page, age);
    }
}
