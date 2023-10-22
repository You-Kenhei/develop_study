package com.youkenhei.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LogAspect {
    @Around("@annotation(com.youkenhei.anno.Log)")
    public Object recordLog(ProceedingJoinPoint pjp){
        
    }
}
