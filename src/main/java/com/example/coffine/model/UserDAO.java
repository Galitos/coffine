package com.example.coffine.model;

import java.util.List;

import com.example.coffine.domain.User;
import com.example.coffine.dto.LoginDTO;


public interface UserDAO { 
	
	
	//회원 전체 목록 
	List<User> listUser() throws Exception;
	// 회원 목록 수정 	
	void updateUser(User dto) throws Exception;
	// 회원 목록 삭제 
	void deleteUser(int user_num) throws Exception;
	// 회원 목록  추가 
	void insertUser(User dto) throws Exception;
	// 회원 상세 정보 
	User viewUser(int user_num) throws Exception;
	// 비밀번호 체크 	
	boolean checkPw(String user_pw, String user_pwCheck) throws Exception;
	// 로그인
	User login(LoginDTO dto) throws Exception;
	
}
