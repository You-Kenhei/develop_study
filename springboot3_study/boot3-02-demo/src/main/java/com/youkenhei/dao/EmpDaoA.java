package com.youkenhei.dao;

import com.youkenhei.pojo.Emp;
import com.youkenhei.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
