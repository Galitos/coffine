package com.example.coffine.service.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.coffine.model.user.dao.UserDAO;
import com.example.coffine.model.user.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	UserDAO userDao;
	
	@Override // 회원 조회 
	public List<UserDTO> listUser() {
		return userDao.listUser();
	}

	@Override // 회원 업데이트
	public void updateUser(UserDTO dto) {
		userDao.updateUser(dto);
	}

	@Override
	public void deleteUser(int user_num) {
		userDao.deleteUser(user_num);
	}

	@Override // 회원 추가 
	public void insertUser(UserDTO dto) {
		userDao.insertUser(dto);
	}

	@Override // 회원 상세 정보 
	public UserDTO viewUser(int user_num) {
		return userDao.viewUser(user_num);
	}

	@Override
	public boolean checkPw(String user_id, String user_pw) {
		return userDao.checkPw(user_id, user_pw);
	}

	

}
