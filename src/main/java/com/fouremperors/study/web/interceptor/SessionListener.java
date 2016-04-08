package com.fouremperors.study.web.interceptor;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

@WebListener
public class SessionListener implements HttpSessionListener {

    public static LongAdder adder=new LongAdder();

    public void sessionCreated(HttpSessionEvent event) {
        adder.increment();
    }

    public void sessionDestroyed(HttpSessionEvent event) {
        adder.decrement();
    }

}