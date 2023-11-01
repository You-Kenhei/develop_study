package com.youkenhei;

import com.youkenhei.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
class TliassystemApplicationTests {

    @Test
    void contextLoads() {
        log.info(Result.success("1234qwer").toString());
    }

}
