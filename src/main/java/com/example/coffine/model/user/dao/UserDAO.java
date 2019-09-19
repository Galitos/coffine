package com.example.coffine.model.user.dao;

import java.util.List;

import com.example.coffine.model.user.dto.UserDTO;

public interface UserDAO { 
	
	
	//회원 전체 목록 
	List<UserDTO> listUser();
	// 회원 목록 수정 	
	void updateUser(UserDTO dto);
	// 회원 목록 삭제 
	void deleteUser(String user_num);
	// 회원 목록  추가 
	void insertUser(UserDTO dto);
}
