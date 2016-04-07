package com.fouremperors.study.web;

import com.fouremperors.study.domain.User;
import com.fouremperors.study.web.common.SessionKey;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.fouremperors.study.web.common.SessionKey.*;

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
    public String login(String name,String password,HttpServletRequest request) {
        SMS_CODE.getSession();
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
