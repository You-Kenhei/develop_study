package com.youkenhei.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.youkenhei.mapper.EmpMapper;
import com.youkenhei.pojo.Emp;
import com.youkenhei.pojo.PageBean;
import com.youkenhei.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        PageHelper.startPage(page,pageSize);
        List<Emp> empList = empMapper.selectToList(name,gender,begin,end);
        Page<Emp> p = (Page<Emp>) empList;
        return new PageBean(p.getTotal(),p.getResult());
    }
}
