package com.example.coffine.controller.user;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.coffine.model.user.dto.UserDTO;
import com.example.coffine.service.user.UserService;

@Controller
@RequestMapping("/user/*") // 전체 매핑
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
		@Inject
		UserService userService;
	
		@RequestMapping(value = "list", method = RequestMethod.GET) // 세부적인 매핑 
		public void listUser(Model model) {
			logger.info("list호출...");
			
			List<UserDTO> list = userService.listUser(); // DB레코드 list에 저장
			model.addAttribute("list", list); // model에 저장 
			
		}
		@RequestMapping(value = "join", method = RequestMethod.GET)
		public void getJoinUser() {
			// Mapping과 동일한 페이지로 이동 
		}
		@RequestMapping(value = "insert", method = RequestMethod.POST)
		public String InsertUser(UserDTO dto) {
			userService.insertUser(dto);
			return "redirect:/user/list";
		}
}
