package com.example.coffine.model.user.dto;

import java.util.Date;

public class UserDTO {
	
	private int user_num; 		// 사용자 고유 번호 (pk)
	private String user_email;  // 이메일(아이디로 사용) 중복X
	private String user_pw;     // 비밀번호
	private String user_pwCheck;// 비밀번호 확인
	private String user_name;   // 사용자 이름
	private String user_phone;  // 사용자 전화번호
	private String user_gender; // 사용자 성별 
	private Date user_joinDate; // 사용자 가입날짜 
	
	@Override
	public String toString() {
		return "UserDTO [user_num=" + user_num + ", user_email=" + user_email + ", user_pw=" + user_pw
				+ ", user_pwCheck=" + user_pwCheck + ", user_name=" + user_name + ", user_phone=" + user_phone
				+ ", user_gender=" + user_gender + ", user_joinDate=" + user_joinDate + "]";
	}
	public int getUser_num() {
		return user_num;
	}
	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_pwCheck() {
		return user_pwCheck;
	}
	public void setUser_pwCheck(String user_pwCheck) {
		this.user_pwCheck = user_pwCheck;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public Date getUser_joinDate() {
		return user_joinDate;
	}
	public void setUser_joinDate(Date user_joinDate) {
		this.user_joinDate = user_joinDate;
	}
	
	
}
