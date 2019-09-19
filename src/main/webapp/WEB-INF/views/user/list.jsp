<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커피에 관심있는 사람들</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h1>회원 목록 </h1>
<table border="1" width="700px">
	<tr>
		<td>번호</td>
		<td>이메일</td>
		<td>비밀번호</td>
		<td>비밀번호확인</td>
		<td>이름</td>
		<td>휴대폰 번호</td>
		<td>성별</td>
		<td>가입날짜</td>
	</tr>
<c:forEach var="row" items="${list}">
	<tr>
		<td>${row.user_num}</td>
		<td><a href="${path}/user/view?user_num=${row.user_num}">${row.user_email}</a></td>
		<td>${row.user_pw}</td>
		<td>${row.user_pwCheck}</td>
		<td>${row.user_name}</td>
		<td>${row.user_phone}</td>
		<td>${row.user_gender}</td>
		<td><fmt:formatDate value="${row.user_joinDate}"
			pattern="yyyy-MM-dd"/></td>
	</tr>
</c:forEach>	
</table> 

</body>
</html>