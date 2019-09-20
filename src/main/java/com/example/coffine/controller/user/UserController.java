package com.example.coffine.controller.user;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.coffine.model.user.dto.UserDTO;
import com.example.coffine.service.user.UserService;

@Controller
@RequestMapping("/user/*") // 전체 매핑
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
		@Inject
		UserService userService;
		

		//날짜 타입 데이터 변환
		@InitBinder
		protected void initBinder(WebDataBinder wdb) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			wdb.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		}
		
		// 회원 목록 
		@RequestMapping(value = "list", method = RequestMethod.GET) // 세부적인 매핑 
		public void listUser(Model model) {
			logger.info("list호출...");
			
			List<UserDTO> list = userService.listUser(); // DB레코드 list에 저장
			model.addAttribute("list", list); // model에 저장 
			
		}
		// 회원가입 페이지로 이동 
		@RequestMapping(value = "join", method = RequestMethod.GET)
		public void getJoinUser() {
			// Mapping과 동일한 페이지로 이동 
		}
		// 회원 추가 
		@RequestMapping(value = "insert", method = RequestMethod.POST)
		public String InsertUser(UserDTO dto) {
			userService.insertUser(dto);
			return "redirect:/user/list";
		}
		// 회원 상세 정보 
		@RequestMapping(value = "view", method = RequestMethod.GET)
		public String viewUser(@RequestParam("user_num") int user_num, Model model) {
			model.addAttribute("dto", userService.viewUser(user_num));
			return "user/view";
		}
		// 비밀번호 체크 후 수정 
		@RequestMapping(value = "update", method = RequestMethod.POST)
		public String updateUser(Model model,UserDTO dto) {
			boolean result = userService.checkPw(dto.getuser_id(),dto.getUser_pw() );
			logger.info("result :"+result);
			if(result) {
				userService.updateUser(dto);
				return "redirect:/user/list";
			}else {
				UserDTO dto2 = userService.viewUser(dto.getUser_num());
				model.addAttribute("dto", dto);
				model.addAttribute("message", "비밀번호 오류");
				return "user/view";
			}
		}
		// 회원 삭제 
		@RequestMapping("delete")
		public String delete(UserDTO dto, Model model) {
			boolean result = userService.checkPw(dto.getuser_id(),dto.getUser_pw());
			if(result) {
				userService.deleteUser(dto.getUser_num());
				return "main";
			}else {
				model.addAttribute("dto",userService.viewUser(dto.getUser_num()));
				model.addAttribute("message", "비밀번호가 틀렸습니다 ");
				 return "user/view";
						
			}
			
		}
}
