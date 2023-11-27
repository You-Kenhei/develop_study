package com.youkenhei.dynamicdatasourse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.youkenhei.dynamicdatasourse.mapper")
public class DynamicdatasourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicdatasourseApplication.class, args);
    }

}
