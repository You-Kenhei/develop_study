package com.youkenhei.dynamicdatasourse.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youkenhei.dynamicdatasourse.mapper.UserMapper;
import com.youkenhei.dynamicdatasourse.pojo.User;
import com.youkenhei.dynamicdatasourse.service.UserService;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
