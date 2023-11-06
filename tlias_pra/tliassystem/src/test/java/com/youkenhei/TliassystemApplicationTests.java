package com.youkenhei;

import com.youkenhei.pojo.Result;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@SpringBootTest
@ServletComponentScan // SpringWeb 并不包含 Servlet，配置Servlet扫描注解以使用Filter
class TliassystemApplicationTests {

    @Test
    void contextLoads() {
        log.info(Result.success("1234qwer").toString());
    }

    @Test
    public void testGetJWT() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 1);
        claims.put("name", "YangJianPing");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "youkenhei")
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 设置令牌的有效期
                .compact();
        System.out.println(jwt);
    }

    @Test
    public void testGenJwt(){
        String claims = "eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiWWFuZ0ppYW5QaW5nIiwiaWQiOjEsImV4cCI6MTY5OTE3MDQwNn0.QJCnmMDVA5j7EeGGAoY4CGeY1423yuYFJnJx4b7hhMY";

        Claims result = Jwts.parser().setSigningKey("youkenhei")
                .parseClaimsJws(claims)
                .getBody();

        System.out.println(result);
    }

}
