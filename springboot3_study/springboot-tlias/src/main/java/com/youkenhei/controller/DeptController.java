package com.youkenhei.controller;

import com.youkenhei.pojo.Dept;
import com.youkenhei.pojo.Result;
import com.youkenhei.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping ("/depts")
    public Result list() {
        log.info("查询全部部门数据");
        List<Dept> data = deptService.list();
        return Result.success(data);
    }
}
