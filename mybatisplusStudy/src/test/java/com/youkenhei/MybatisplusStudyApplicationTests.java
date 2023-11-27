package com.youkenhei;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.youkenhei.mapper.UserMapper;
import com.youkenhei.pojo.User;
import com.youkenhei.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusStudyApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    public void please(){
        System.out.println(userService.getById(1L));
    }

    @Test
    public void test1() {
//        userMapper.deleteById(4L);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "a").
                between("age", 20, 30).
                isNotNull("email");

        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    @Test
    public void test2() {
        String username = "b";
        Integer ageBegin = 20;
        Integer ageEnd = 30;
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(username)) {
            queryWrapper.like("name", username);
        }
        if (ageBegin != null) {
            queryWrapper.gt("age", ageBegin);
        }
        if (ageEnd != null) {
            queryWrapper.lt("age", ageEnd);
        }
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    public void test3() {
        String username = "";
        Integer ageBegin = 20;
        Integer ageEnd = 30;

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(username), "name", username)
                .gt(ageBegin != null, "age", ageBegin)
                .lt(ageEnd != null, "age", ageEnd);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    public void test4() {
        String username = "";
        Integer ageBegin = 20;
        Integer ageEnd = 30;

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(username), User::getName, username)
                .gt(ageBegin != null, User::getAge, ageBegin)
                .lt(ageEnd != null, User::getAge, ageEnd);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }




}
