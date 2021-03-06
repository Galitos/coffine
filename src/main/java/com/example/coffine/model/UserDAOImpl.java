package com.example.coffine.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.coffine.domain.User;
import com.example.coffine.dto.LoginDTO;


@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject  // DI  의존관계 형성 
	SqlSession sqlSession;
	
	@Override  // 회원  조회   
	public List<User> listUser() {
		return sqlSession.selectList("user.listUser");
	}

	@Override // 회원 업데이트 
	public void updateUser(User dto) {
		sqlSession.update("user.updateUser", dto);
	}

	@Override // 회원 삭제
	public void deleteUser(int user_num) {
		sqlSession.delete("user.deleteUser", user_num);
	}

	@Override // 회원 추가 
	public void insertUser(User dto) {
		sqlSession.insert("user.insertUser", dto);
	}

	@Override // 회원 상세 정보 
	public User viewUser(int user_num) {
		return sqlSession.selectOne("user.viewUser", user_num);
	}

	@Override // 비밀번호 체크 
	public boolean checkPw(String user_id, String user_pw) {
		boolean result = false;
		Map<String, String> map = new HashMap<String,String>();
		map.put("user_id", user_id);
		map.put("user_pw", user_pw);
		int count =sqlSession.selectOne("user.checkPw", map);
		if(count == 1) result=true;
		return result;
	}

	@Override
	public User login(LoginDTO dto) throws Exception {
		return sqlSession.selectOne("login.UserLogin", dto);
	}

	

}
