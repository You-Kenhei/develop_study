package com.youkenhei.testsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.youkenhei.testsystem.mapper")
public class TestsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestsystemApplication.class, args);
    }

}
