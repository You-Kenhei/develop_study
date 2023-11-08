package com.youkenhei.exception;

import com.youkenhei.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result ex(Exception exception) {
        exception.printStackTrace();
        return Result.error("很抱歉操作未能顺利进行，请联系管理员");
    }
}
