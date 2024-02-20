package com.youkenhei.testsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class GlobalController {

    @GetMapping("regist")
    public void setTime(Model model){
        model.addAttribute("time", DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDate.now()));
    }
}
