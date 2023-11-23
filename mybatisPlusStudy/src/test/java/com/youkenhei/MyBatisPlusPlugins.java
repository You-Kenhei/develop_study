package com.youkenhei;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youkenhei.mapper.UserMapper;
import com.youkenhei.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusPlugins {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPage1() {
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPage(page, null);
        System.out.println("Page输出:" + page.getRecords());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());

    }

    @Test
    public void testPage2(){
        Page<User> page = new Page<>(1,3);
        userMapper.selectPageByAge(page, 20);
        System.out.println("Page输出:" + page.getRecords());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
    }
}
