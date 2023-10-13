package com.youkenhei.mapper;

import com.youkenhei.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    @Delete("delete from mybatis.emp where id = #{id}")
    public Integer delete(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into mybatis.emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);

    @Update("update mybatis.emp set username = #{username}, name = #{name}, gender = #{gender}, image = #{image}, job = #{job}, entrydate = #{entrydate}, dept_id = #{deptId}, update_time = #{updateTime} where id = #{id}")
    public void update(Emp emp);

    @Select("select * from mybatis.emp")
    public List<Emp> selectAll();

    /*@Select("select id, username, password, name, gender, image, job, entrydate, dept_id deptId, create_time createTime, update_time updateTime from mybatis.emp where id = #{id}")
//    通过为字段名起别名，以匹配实体类属性*/

    /* @Results({
             @Result(column = "dept_id", property = "deptId"),
             @Result(column = "create_time", property = "createTime"),
             @Result(column = "update_time", property = "updateTime")
     })
 //    通过在 @Results 注解中创建 @Result 数组，并在其中指明字段名与实体类属性的对应关系 */

    @Select("select * from mybatis.emp where id = #{id}")
//    当前使用最推荐的方法，在application.properties中配置camel转换为true
    public Emp selectById(Integer id);

//    @Select("select * from mybatis.emp where name like concat('%',#{name},'%') and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time desc")
    public List<Emp> selectList(String name, Short gender, LocalDate begin, LocalDate end);


}
