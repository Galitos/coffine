<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<script>
$(function() {
	$("#btnUpdate").click(function() {
		document.form1.action="${path}/user/update";
		document.form1.submit();
	});
	$("#btnDelete").click(function() {
		if(confirm("삭제하겠습니까?")){
			document.form1.action="${path}/user/delete";
			document.form1.submit();
		}
	});
});

</script>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>회원 상세 정보</h2>
<form name="form1" method="post">
<table border="1" width="600px">
<tr>
	<td>번호</td>
	<td><input type="text" name="user_num" value="${dto.user_num}" readonly="readonly"></td>
</tr>		
<tr>
	<td>아이디</td>
	<td><input type="text" name="user_id" value="${dto.user_id}" ></td>
</tr>
<tr>
	<td>비밀번호</td>
	<td><input type="password" name="user_pw" /></td>
</tr>

<tr>	
	<td>이름</td>
	<td><input type="text" name="user_name" value="${dto.user_name}"></td>
</tr>
<tr>	
	<td>휴대폰 번호</td>
	<td><input type="text" name="user_phone" value="${dto.user_phone}"></td>
</tr>
<tr>	
	<td>성별</td>
	<td><input type="text" name="user_gender" value="${dto.user_gender}"></td>
</tr>
<tr>	
	<td>가입날짜</td>
	<td><fmt:formatDate value="${dto.user_joinDate}"
	pattern="yyyy-MM-dd"/></td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="button" value="수정" id="btnUpdate">
		<input type="button" value="삭제" id="btnDelete">
		<div style="color:red;">${message}</div>
	</td>	
</tr>
</table>
</form>
</body>
</html>