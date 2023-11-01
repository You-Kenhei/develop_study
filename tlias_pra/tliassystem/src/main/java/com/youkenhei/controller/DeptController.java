package com.youkenhei.controller;

import com.youkenhei.pojo.Dept;
import com.youkenhei.pojo.Result;
import com.youkenhei.service.DeptService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list() {
//        log.info("查询所有部门信息");
        List<Dept> data = deptService.list();
        return Result.success(data);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        log.info("按id删除部门");
        deptService.deleteById(id);
        return Result.success();
    }


    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("添加部门");
        deptService.add(dept);
        return Result.success();
    }

}
