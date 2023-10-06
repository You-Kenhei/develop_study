package com.youkenhei.controller;

import com.youkenhei.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController_01 {

    //    @PostMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + ":" + age);
//
//        return "ok";
//    }
    @RequestMapping("/simpleParam")
    public String simpleParam(String name, int age) {
        System.out.println(name + ":" + age);
        return "ok";
    }

    @RequestMapping("/simpleParamRP")
    public String simpleParamRP(@RequestParam(name = "name", required = false) String userName, int age) {
        System.out.println(userName + ":" + age);
        return "ok";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/complexPojo")
    public String simplePojoWithClass(User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }

    @RequestMapping("/listParam")
//    List 和 ArrayList 都可以，只要是 List 及其子类都可以接受数据
    public String listParam(@RequestParam ArrayList<String> hobby) {
        System.out.println(hobby);
        return "ok";
    }

    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "ok";
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id + ":" + name);
        return "ok";
    }
}
