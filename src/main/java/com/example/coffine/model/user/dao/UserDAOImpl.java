package com.example.coffine.model.user.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.coffine.model.user.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject  // DI  의존관계 형성 
	SqlSession sqlSession;
	
	@Override  // 회원  조회   
	public List<UserDTO> listUser() {
		return sqlSession.selectList("user.listUser");
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
		sqlSession.insert("user.insertUser", dto);
	}

}
