package com.youkenhei.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.youkenhei.pojo.Result;
import com.youkenhei.utils.JWTUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
        String url = req.getRequestURL().toString();
        if (url.contains("/login")) {
            log.info("@@@@@  login pass");
            return true;
        }

        String jwt = req.getHeader("token");
        if (!StringUtils.hasLength(jwt)) {
            log.info("@@@@@  NOT_LOGIN");
            Result error = Result.error("NOT_LOGIN");
            String result = JSONObject.toJSONString(error);
            resp.getWriter().write(result);
            return false;
        }


        try {
            JWTUtils.parseJwt(jwt);
        } catch (Exception e) {
            log.info("@@@@@  JWT parse error");
            Result error = Result.error("认证失败，请联系管理员");
            String result = JSONObject.toJSONString(error);
            resp.getWriter().write(result);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("拦截后业务");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("渲染后业务");
    }
}
