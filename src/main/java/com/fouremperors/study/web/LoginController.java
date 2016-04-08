package com.fouremperors.study.web;

import com.fouremperors.study.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.fouremperors.study.web.common.SessionKey.LOGINED_USER;
import static com.fouremperors.study.web.common.SessionKey.requestThreadLocal;

/**
 * Created by qianfanyanfa on 16/4/7.
 */
@Controller
public class LoginController {

    /**
     * 登录页面
     */
    @RequestMapping({"/toLogin"})
    public String toLogin(Model model, HttpServletRequest request) {
        return "toLogin";
    }

    /**
     * 登出页面
     */
    @RequestMapping({"/toLogout"})
    public String toLogout(Model model, HttpServletRequest request) {
        LOGINED_USER.remove();
        return "toLogin";
    }


    @RequestMapping("/login")
    public String login(String name,String password,HttpServletRequest request) throws InterruptedException {

        if(name.equals("keith")&&password.equals("123456")){
            User user=new User();
            user.setId(1L);
            user.setNickName("K.F");
            user.setAge(21);
            LOGINED_USER.setSession(user);
            return "redirect:/";
        }
        return "toLogin";
    }

}
