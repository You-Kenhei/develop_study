package com.youkenhei.dynamicdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youkenhei.dynamicdb.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    Page<User> selectPageAge (@Param("page") Page<User> page, @Param("age") Integer age);
}
