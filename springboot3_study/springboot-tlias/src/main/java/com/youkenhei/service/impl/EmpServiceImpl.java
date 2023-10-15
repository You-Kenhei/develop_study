package com.youkenhei.service.impl;

import com.youkenhei.mapper.EmpMapper;
import com.youkenhei.pojo.Emp;
import com.youkenhei.pojo.PageBean;
import com.youkenhei.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageBean page(Integer page, Integer pageSize) {
        Integer count = empMapper.count();
        Integer start = pageSize * (page - 1);
        List<Emp> empList = empMapper.page(start,pageSize);
        return new PageBean(count, empList);
    }
}
