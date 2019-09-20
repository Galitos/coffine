<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커피를 좋아하는 사람들</title>
<%@ include file="../include/header.jsp" %>
<script>
$(function() {
	$("#btnJoin").click(function() {
		var user_id=$("#user_id").val();
		var user_pw=$("#user_pw").val();
		var user_pwCheck=$("#user_pwCheck").val();
		var user_name=$("#user_name").val();
		var user_phone=$("#user_phone").val();
		var user_gender=$("#user_gender").val();
		if(user_id == ""){
			alert("이메일 입력하세요")
			$("#user_id").focus();
			return
		}
		if(user_pw == ""){
			alert("비밀번호 입력하세요")
			$("#user_pw").focus();
			return
		}
		if(user_pwCheck == ""){
			alert("비밀번호 확인하세요")
			$("#user_pwCheck").focus();
			return
		}
		if(user_name == ""){
			alert("이름 입력하세요")
			$("#user_name").focus();
			return
		}
		if(user_phone == ""){
			alert("전화번호 입력하세요")
			$("#user_phone").focus();
			return
		}
		if(user_gender == ""){
			alert("성별을 체크하세요")
			$("#user_gender").focus();
			return
		}
		document.form1.action="${path}/user/insert";
		document.form1.submit();
	});
	
	
});

</script>

</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h1>회원가입</h1>
<form name="form1"  method="post">
<table border="1" width="500px">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="user_id" id="user_id"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="user_pw" id="user_pw"></td>	
	</tr>
	<tr>
		<td>비밀번호 확인</td>
		<td><input type="password" name="user_pwCheck" id="user_pwCheck"></td>	
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="user_name" id="user_name"></td>	
	</tr>
	<tr>
		<td>휴대폰 번호</td>
		<td><input type="text" name="user_phone" id="user_phone"></td>	
	</tr>
	<tr>
		<td>성별</td>
		<td>
			<input type="radio" name="user_gender" value="남" id="user_gender">남자
			<input type="radio" name="user_gender" value="여" id="user_gender">여자
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="button" id="btnJoin" value="회원가입">
		</td>	
	</tr>
</table>
</form>
</body>
</html>