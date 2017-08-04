package com.fouremperors.study.web;

import com.fouremperors.study.web.interceptor.SessionListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@Controller
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model, HttpServletRequest request) {
		model.put("time", new Date());
		model.put("message",this.message);
		model.put("counter", SessionListener.adder.sum());
		return "welcome";
	}

	@RequestMapping("/user/info")
	public String userInfo(Map<String, Object> model, HttpServletRequest request) {
		model.put("time", new Date());
		model.put("message",this.message);
		model.put("counter", SessionListener.adder.sum());
		return "welcome";
	}

}