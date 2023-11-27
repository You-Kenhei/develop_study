package com.youkenhei.dynamicdb;

import com.youkenhei.dynamicdb.service.ProductService;
import com.youkenhei.dynamicdb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DynamicdbApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @Test
    public void dynamicTest2() {
        System.out.println(userService.getById(1L));
        System.out.println(productService.getById(1L));
    }
}
