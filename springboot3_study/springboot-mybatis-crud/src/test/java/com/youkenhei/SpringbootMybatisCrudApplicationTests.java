package com.youkenhei;

import com.youkenhei.mapper.EmpMapper;
import com.youkenhei.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete() {
        Integer result = empMapper.delete(19);
        System.out.println(result);
    }

    @Test
    public void testInsert() {
        Emp emp = new Emp();
        emp.setUsername("Tom");
        emp.setName("汤姆");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2000, 1, 1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdate() {
        Emp emp = new Emp();
        emp.setId(20);
        emp.setUsername("Tom2");
        emp.setName("汤姆2");
        emp.setImage("2.jpg");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2000, 1, 1));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.update(emp);
    }

    @Test
    public void testSelectAll() {
        List<Emp> empList = empMapper.selectAll();
        System.out.println(empList);
    }

    @Test
    public void testSelectById() {
        Emp emp = empMapper.selectById(20);
        System.out.println(emp);
    }

    @Test
    public void testSelectList() {
//        List<Emp> empList = empMapper.selectList("张", (short) 1, LocalDate.of(2010, 1, 1), LocalDate.of(2020, 1, 1));
        List<Emp> empList = empMapper.selectList("张",null,null,null);
        System.out.println(empList);
    }
}
