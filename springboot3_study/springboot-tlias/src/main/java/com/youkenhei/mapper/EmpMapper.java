package com.youkenhei.mapper;

import com.youkenhei.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select count(*) from tlias.emp")
    Integer count();

    @Select("select * from tlias.emp limit #{start},#{pageSize}")
    List<Emp> page(Integer start, Integer pageSize);
}
