package com.youkenhei.controller;

import com.youkenhei.pojo.Emp;
import com.youkenhei.pojo.Result;
import com.youkenhei.service.EmpService;
import com.youkenhei.utils.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp) {
        log.info("员工登陆：{}", emp);
        Emp e = empService.login(emp);
        if (e != null) {
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", e.getId());
            claims.put("name", e.getName());
            claims.put("username", e.getUsername());
            String jwt = JWTUtils.generateJwt(claims);
            log.info(jwt);
            return Result.success(jwt);
        }
        return Result.error("用户名或密码错误");
    }

}
