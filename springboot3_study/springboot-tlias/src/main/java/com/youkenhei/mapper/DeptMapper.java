package com.youkenhei.mapper;

import com.youkenhei.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from tlias.dept")
    public List<Dept> list();

    @Delete("delete from tlias.dept where id = #{id}")
    public void deleteById(Integer id);

    @Insert("insert into tlias.dept(name, create_time, update_time) values(#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);
}
