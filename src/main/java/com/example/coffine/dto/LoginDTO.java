package com.example.coffine.dto;


public class LoginDTO {
	private String user_id; 	// 아이디
	private String user_pw;     // 비밀번호
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	@Override
	public String toString() {
		return "LoginDTO [user_id=" + user_id + ", user_pw=" + user_pw + "]";
	}
	
}
