package com.youkenhei;

import com.youkenhei.pojo.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@ServletComponentScan
@SpringBootTest
@RestController
class SpringbootTliasApplicationTests {
    @Autowired
    private AliOSSUtils aliOSSUtils;

    @Test
    @PostMapping("/testLoad")
    public Result testLoad(MultipartFile image) throws IOException {
        String url = aliOSSUtils.upload(image);

        return Result.success(url);
    }

    
}
