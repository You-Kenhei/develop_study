package com.youkenhei.testsystem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("title", "传递的内容");
        model.addAttribute("name", "this name");
        log.debug("成功激活信息传递服务");
        System.out.println("打印：传递成功");
        return "index";
    }


}
