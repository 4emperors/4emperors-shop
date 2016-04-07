package com.fouremperors.study.web.interceptor;

import com.fouremperors.study.domain.User;
import com.fouremperors.study.web.common.SessionKey;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.fouremperors.study.web.common.SessionKey.*;

/**
 * Created by qianfanyanfa on 16/4/7.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        User user = LOGINED_USER.getSession();
        boolean flag = false;
        if (null == user) {
            // Session中没有用户名，将请求转发到错误页面或者登录页面
      /* 判断是不是ajax请求 ajax请求 返回700 */
            if (request.getHeader("x-requested-with") != null
                    && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
                response.setStatus(700);
            } else {
                response.sendRedirect(request.getContextPath() + "/toLogin");
            }
        }else {
            flag=true;
        }
        return flag;
    }

}
