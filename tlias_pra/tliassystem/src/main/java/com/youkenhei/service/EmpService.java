package com.youkenhei.service;

import com.youkenhei.pojo.Emp;
import com.youkenhei.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void deleteByIds(List<Integer> ids);

    void addEmp(Emp emp);

    Emp selectById(Integer id);

    void update(Emp emp);
}
