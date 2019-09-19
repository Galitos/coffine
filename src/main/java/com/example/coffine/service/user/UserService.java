package com.example.coffine.service.user;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.coffine.model.user.dto.UserDTO;

public interface UserService {
	
	//회원 전체 목록 
	List<UserDTO> listUser();
	// 회원 목록 수정 	
	void updateUser(UserDTO dto);
	// 회원 목록 삭제 
	void deleteUser(String user_num);
	// 회원 목록  추가 
	void insertUser(UserDTO dto);
	
	
	/*
	 * public UserDTO viewMemeber(String userid); public boolean checkPw(String
	 * userid, String passwd); public String login(MemberDTO dto); public void
	 * logout(HttpSession session);
	 */
	}
