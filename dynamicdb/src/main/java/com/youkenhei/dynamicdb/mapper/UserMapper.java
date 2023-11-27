package com.youkenhei.dynamicdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youkenhei.dynamicdb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
//    Page<User> selectPageAge (@Param("page") Page<User> page, @Param("age") Integer age);
}
