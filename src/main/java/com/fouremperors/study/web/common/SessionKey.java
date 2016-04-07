package com.fouremperors.study.web.common;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qianfanyanfa on 16/4/7.
 * 项目自定义session管理对象
 */
public enum  SessionKey {

    /**
     * 己登录用户的sessionkey
     */
    LOGINED_USER,

    SMS_CODE
    ;

    /**
     * session取值
     * @param <T>
     * @return
     */
    public <T>  T  getSession() {
        return (T) requestThreadLocal.get().getSession().getAttribute(getSessionKey());
    }

    /**
     * session赋值
     * @param value  值
     */
    public  void setSession(Object value){
        requestThreadLocal.get().getSession().setAttribute(getSessionKey(),value);
    }

    public void remove(){
        requestThreadLocal.get().getSession().removeAttribute(getSessionKey());
    }
    /**
     * 返回在session对应对象的的key值
     * @return
     */
    public String getSessionKey(){
        return  "sessionkey-"+this.toString().toLowerCase();
    }

    public static ThreadLocal<HttpServletRequest> requestThreadLocal=new ThreadLocal<>();

}
