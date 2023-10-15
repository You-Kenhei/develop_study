package com.youkenhei.service;

import com.youkenhei.pojo.PageBean;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize);
}
