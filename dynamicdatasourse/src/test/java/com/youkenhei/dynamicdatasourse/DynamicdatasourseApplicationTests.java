package com.youkenhei.dynamicdatasourse;

import com.youkenhei.dynamicdatasourse.service.ProductService;
import com.youkenhei.dynamicdatasourse.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DynamicdatasourseApplicationTests {
    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        System.out.println(userService.getById(1L));
        System.out.println(productService.getById(1L));
    }
}
