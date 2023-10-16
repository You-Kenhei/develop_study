package com.youkenhei.service;

import com.youkenhei.pojo.Emp;
import com.youkenhei.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void delete(List<Integer> ids);

    void sava(Emp emp);
}