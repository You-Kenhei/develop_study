package com.youkenhei.service.impl;

import com.youkenhei.mapper.DeptMapper;
import com.youkenhei.pojo.Dept;
import com.youkenhei.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        List<Dept> data = deptMapper.list();
        return data;
    }

    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(String name) {
        LocalDateTime createTime = LocalDateTime.now();
        LocalDateTime updateTime = LocalDateTime.now();
        new Dept(name,createTime,updateTime)
        deptMapper.add(Dept dept);
    }


}

