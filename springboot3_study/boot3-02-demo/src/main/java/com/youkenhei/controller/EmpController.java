package com.youkenhei.controller;

import com.youkenhei.pojo.Emp;
import com.youkenhei.pojo.Result;
import com.youkenhei.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.List;
import java.util.Set;

@RestController
public class EmpController {
    @RequestMapping("/listEmp")
    public Result list(){

        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        for (Emp emp : empList) {
            if ("1".equals(emp.getGender())) {
                emp.setGender("男");
            }else {
                emp.setGender("女");
            }

            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            }else {
                emp.setJob("就业指导");
            }
        }

        return Result.success(empList);
    }
}
