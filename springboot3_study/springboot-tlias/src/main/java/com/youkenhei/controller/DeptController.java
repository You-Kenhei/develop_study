package com.youkenhei.controller;

import com.youkenhei.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DeptController {
    @RequestMapping("/depts")
    public Result list() {
        log.info("查询全部部门数据");
        return Result.success();
    }
}
