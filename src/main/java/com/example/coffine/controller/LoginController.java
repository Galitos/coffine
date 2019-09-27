package com.example.coffine.controller;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import com.example.coffine.domain.User;
import com.example.coffine.dto.LoginDTO;
import com.example.coffine.interceptor.SessionNames;
import com.example.coffine.service.UserService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Inject
	UserService userService;

	// login
	@RequestMapping(value = "/login", method = RequestMethod.GET) // 세부적인 매핑
	public void login() throws Exception {
		logger.info("login 호출...");

	}

	// loginPost
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void loginPost(LoginDTO dto, Model model) throws Exception {
		logger.info("loginPost...");
		try {
			User user = userService.login(dto);
			if (user != null) {
				model.addAttribute("user", user);
			} else {
				model.addAttribute("loginResult", "로그인 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// logout
	@RequestMapping(value = "/logout", method = RequestMethod.GET) // 세부적인 매핑
	public String logout(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("logout 호출...");
		session.removeAttribute(SessionNames.LOGIN);  
		session.invalidate(); // 세션 정보 삭제 		
		//session.setAttribute("loginTime", new Date());
		Cookie loginCookie = WebUtils.getCookie(request, SessionNames.LOGIN);
		if (loginCookie != null) {
			loginCookie.setPath("/");
			loginCookie.setMaxAge(0);
			
			response.addCookie(loginCookie);
		}
		return "main";
	}

}
