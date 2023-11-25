package com.youkenhei;

import com.youkenhei.enums.SexEnum;
import com.youkenhei.mapper.UserMapper;
import com.youkenhei.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusEnumTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void enumTest(){
        User user = new User();
        user.setName("admin");
        user.setAge(33);
        user.setSex(SexEnum.MALE);
        user.setEmail("crazyshit@qq.com");
        int result = userMapper.insert(user);
        System.out.println(result);

    }
}
