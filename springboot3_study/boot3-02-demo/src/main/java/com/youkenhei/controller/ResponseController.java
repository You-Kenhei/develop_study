package com.youkenhei.controller;

import com.youkenhei.pojo.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

    @RequestMapping("/getStr")
    public String getStr() {
        System.out.println("getStr");
        return "getStr done";
    }

    @RequestMapping("/getInstance")
    public Address getInstance() {
        Address addr = new Address();
        addr.setCity("北京");
        addr.setProvince("海淀");
        return addr;
    }

    @RequestMapping("/getListInstance")
    public List<Address> getListInstance() {
        List<Address> addrs = new ArrayList<>();
        Address addr1 = new Address();
        addr1.setCity("北京");
        addr1.setProvince("北京");

        Address addr2 = new Address();
        addr2.setCity("深证");
        addr2.setProvince("广东");

        Address addr3 = new Address();
        addr3.setCity("西安");
        addr3.setProvince("陕西");

        addrs.add(addr1);
        addrs.add(addr2);
        addrs.add(addr3);

        return addrs;
    }
}
