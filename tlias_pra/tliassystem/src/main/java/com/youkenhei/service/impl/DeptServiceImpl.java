package com.youkenhei.service.impl;

import com.youkenhei.mapper.DeptMapper;
import com.youkenhei.mapper.EmpMapper;
import com.youkenhei.pojo.Dept;
import com.youkenhei.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;


    @Override
    public List<Dept> list() {
        List<Dept> data = deptMapper.list();
        return data;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
        empMapper.deleteByDeptId(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        dept.setCreateTime(LocalDateTime.now());
        deptMapper.add(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Override
    public void alter(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.alter(dept);
    }


}

