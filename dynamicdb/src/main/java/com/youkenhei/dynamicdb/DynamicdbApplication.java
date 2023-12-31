package com.youkenhei.dynamicdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.youkenhei.dynamicdb.mapper")
public class DynamicdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicdbApplication.class, args);
    }

}
