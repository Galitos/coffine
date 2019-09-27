package com.example.coffine.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.coffine.domain.User;
import com.example.coffine.dto.LoginDTO;
import com.example.coffine.model.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	UserDAO userDao;
	
	@Override // 회원 조회 
	public List<User> listUser() throws Exception {
		return userDao.listUser();
	}

	@Override // 회원 업데이트
	public void updateUser(User dto) throws Exception {
		userDao.updateUser(dto);
	}

	@Override
	public void deleteUser(int user_num) throws Exception {
		userDao.deleteUser(user_num);
	}

	@Override // 회원 추가 
	public void insertUser(User dto) throws Exception {
		userDao.insertUser(dto);
	}

	@Override // 회원 상세 정보 
	public User viewUser(int user_num) throws Exception {
		return userDao.viewUser(user_num);
	}

	@Override
	public boolean checkPw(String user_id, String user_pw) throws Exception {
		return userDao.checkPw(user_id, user_pw);
	}

	@Override
	public User login(LoginDTO dto) throws Exception {
		return userDao.login(dto);
	}

	

}
