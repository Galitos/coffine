package com.example.coffine.service.user;

import java.util.List;

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

	@Override
	public void updateUser(UserDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String user_num) {
		// TODO Auto-generated method stub

	}

	@Override // 회원 추가 
	public void insertUser(UserDTO dto) {
		userDao.insertUser(dto);
	}

}
