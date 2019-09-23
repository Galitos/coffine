<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp"%>
<!-- 에디터 추가-->
<script type="text/javascript"
	src="${path}/resources/ckeditor/ckeditor.js"></script>
</head>
<body>
	<%@ include file="../include/menu.jsp"%>
			<form name="writeForm" method="post" action="${path}/board/write">
				<table border="1" width="900px">
					<tr>
						<td>제목</td>
						<td><input type="text" name="title"></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td><input type="text" name="writer"></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><textarea name="contents" id="contents"></textarea> <script
								type="text/javascript">
							CKEDITOR.replace('contents', {
								height : 400
							});
						</script></td>
					</tr>
				</table>
				<div align="center">
					<input type="submit" value="저장">
				</div>
			</form>
	<%@ include file="../include/footer.jsp" %>
</body>
</html>