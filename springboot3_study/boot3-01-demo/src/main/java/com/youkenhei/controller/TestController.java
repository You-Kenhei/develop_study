package com.youkenhei.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {


        String[] name = {"张三", "李四", "王五", "陈六"};
        String[] image = {"https://inews.gtimg.com/newsapp_bt/0/4479555809/640", "https://img1.baidu.com/it/u=3236138915,187045974&fm=253&fmt=auto?w=300&h=300", "https://tupian.qqw21.com/article/UploadPic/2019-3/201931711454915475.jpg", "https://img1.baidu.com/it/u=1035926869,2598734641&fm=253&fmt=auto&app=138&f=JPEG?w=300&h=300"};
        int[] gender = {1, 1, 1, 2};
        String[] job = {"班主任", "讲师", "校长", "保安"};
        String[] entryDate = {"2008-05-09", "2012-08-09", "2013-05-23", "2000-01-18"};
        String[] updateTime = {"2022-10-01 12:00:00", "2022-10-01 12:00:00", "2022-10-01 12:00:00", "2022-10-01 12:00:00"};

        LinkedHashMap[] sm = new LinkedHashMap[4];
        for (int i = 0; i < 4; i++) {
            LinkedHashMap<String, Object> em = new LinkedHashMap<>();
            em.put("id", i + 1);
            em.put("name", name[i]);
            em.put("image", image[i]);
            em.put("gender", gender[i]);
            em.put("job", job[i]);
            em.put("entrydate", entryDate[i]);
            em.put("updatetime", updateTime[i]);

            sm[i] = em;

        }
        LinkedHashMap<String, Object> result = new LinkedHashMap<>();
        result.put("code", 1);
        result.put("message", "success");
        result.put("data", sm);

        return new JSONObject(result).toString();
    }

}
