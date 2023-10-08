package com.youkenhei.service;

import com.youkenhei.dao.EmpDao;
import com.youkenhei.dao.EmpDaoA;
import com.youkenhei.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpServiceA implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();
        for (Emp emp : empList) {
            if ("1".equals(emp.getGender())) {
                emp.setGender("男");
            } else {
                emp.setGender("女");
            }

            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else {
                emp.setJob("就业指导");
            }
        }
        return empList;
    }

}
