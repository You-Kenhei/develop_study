package com.youkenhei.testsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("demo")
    public String demoTest(Model model) {
        model.addAttribute("name", "demo name");
        return "demo";
    }
}
