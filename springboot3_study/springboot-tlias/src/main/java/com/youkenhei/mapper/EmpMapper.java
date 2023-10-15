package com.youkenhei.mapper;

import com.youkenhei.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    /*
    @Select("select count(*) from tlias.emp")
    Integer count();

    @Select("select * from tlias.emp limit #{start},#{pageSize}")
    List<Emp> page(Integer start, Integer pageSize);
    */

    /**
     * 员工信息查询，以及pageHelper分页所用
     */
    @Select("select * from tlias.emp")
    public List<Emp> list();
}
