package com.youkenhei.mapper;

import com.youkenhei.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from tlias.dept")
    public List<Dept> list();
}
