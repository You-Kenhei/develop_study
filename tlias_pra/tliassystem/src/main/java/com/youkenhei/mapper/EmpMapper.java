package com.youkenhei.mapper;

import com.youkenhei.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> selectToList(String name, Short gender, LocalDate begin, LocalDate end);
}
