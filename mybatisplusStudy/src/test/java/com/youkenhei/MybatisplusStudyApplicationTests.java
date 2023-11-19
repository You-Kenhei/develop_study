package com.youkenhei;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.youkenhei.mapper.UserMapper;
import com.youkenhei.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatisPlusStudyApplicationTests {
    @Autowired
    private UserMapper userMapper;

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

}
