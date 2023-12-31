package com.youkenhei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youkenhei.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

//    @Param 注解是为了给参数重命名而使用的，当注入到xml中的参数名相同时则不需要
//    @Select("select * from mybatis_plus.t_user where is_delete = 0 and age > #{age}")
//    Page<User> selectPageByAge(@Param("page") Page<User> page, @Param("age") Integer age);

    Page<User> selectPageByAge(Page<User> page, Integer age);

}
