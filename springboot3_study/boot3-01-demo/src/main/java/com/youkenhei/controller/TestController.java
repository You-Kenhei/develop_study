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
        String[] image = {"https://www.apple.com.cn/leadership/images/overview/ceo_image.jpg.large_2x.jpg",
                "https://www.apple.com.cn/leadership/images/overview/srvpsoftwareengineering_image.jpg.large_2x.jpg",
                "https://www.apple.com.cn/leadership/images/overview/carol_surface.png.large_2x.png",
                "https://www.apple.com.cn/leadership/images/overview/greaterchina_image.jpg.large_2x.jpg"};
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
