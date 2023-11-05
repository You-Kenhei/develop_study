package com.youkenhei.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JWTUtils {
    private static String signKey = "youkenhei";
    private static Long Expiration = 43200000L;

    public static String generateJwt(Map<String,Object> claims){
        String jwt = Jwts.builder().signWith(SignatureAlgorithm.HS256, signKey)
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + Expiration))
                .compact();
        return jwt;
    }

    public static Claims parseJwt(String jwt){
        Claims claims = Jwts.parser()
                .setSigningKey(signKey)
                .parseClaimsJws(jwt)
                .getBody();
        return claims;
    }
}
