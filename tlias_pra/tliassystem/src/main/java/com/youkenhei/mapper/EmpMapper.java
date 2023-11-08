package com.youkenhei.mapper;

import com.youkenhei.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> selectToList(String name, Short gender, LocalDate begin, LocalDate end);

    void deleteByIds(List<Integer> ids);

    @Insert("insert into tlias_pra.emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) VALUES (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    void addEmp(Emp emp);

    @Select("select * from tlias_pra.emp where id = #{id}")
    Emp selectById(Integer id);

    void update(Emp emp);

    @Select("select  * from tlias_pra.emp where username = #{username} and password = #{password}")
    Emp selectByUsernameAndPassword(Emp emp);

    @Delete("delete from tlias_pra.emp where dept_id = #{id}")
    void deleteByDeptId(Integer id);
}
