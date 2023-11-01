package com.youkenhei.mapper;

import com.youkenhei.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from tlias_pra.dept")
    public List<Dept> list();

    @Delete("delete from tlias_pra.dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into tlias_pra.dept(name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void add(Dept dept);
}
