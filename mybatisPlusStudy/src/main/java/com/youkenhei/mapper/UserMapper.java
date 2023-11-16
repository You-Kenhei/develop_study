package com.youkenhei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youkenhei.pojo.User;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
