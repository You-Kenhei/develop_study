package com.youkenhei.service;

import com.youkenhei.pojo.Dept;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

public interface DeptService {
    List<Dept> list();

    void deleteById(Integer id);

    void add(String name);
}
