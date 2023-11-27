package com.youkenhei.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youkenhei.mapper.UserMapper;
import com.youkenhei.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
