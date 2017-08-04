package com.fouremperors.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import sun.net.www.protocol.http.AuthenticationHeader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// @formatter:off
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/css/**", "/index").permitAll()
			.antMatchers("/user/**").hasRole("USER")
			.and()
			.formLogin()
			.loginPage("/login").successHandler(loginSuccess())
			.failureUrl("/login-error");
	}
	// @formatter:on

	// @formatter:off
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.inMemoryAuthentication()
				.withUser("user").password("password").roles("USER");
	}
	// @formatter:on

	@Bean
	public AuthenticationSuccessHandler loginSuccess(){
		AuthenticationSuccessHandler handler= new AuthenticationSuccessHandler() {
			@Override
			public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

				System.out.println(httpServletRequest.getRemoteUser());
				System.out.println(authentication.toString());

			}
		};
		return handler;
	}
}