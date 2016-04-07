package com.fouremperors.study.web.interceptor;

import com.fouremperors.study.web.common.SessionKey;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.fouremperors.study.web.common.SessionKey.requestThreadLocal;

/**
 * Created by qianfanyanfa on 16/4/7.
 */
public class InfoInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        requestThreadLocal.set(request);

        return true;
    }
}
