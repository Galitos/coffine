<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
<%@ include file="../include/header.jsp"%>
<script>
	$(function() {
		$("#btnUpdate").click(function() {
			document.updateForm.action = "${path}/board/write";
			document.updateForm.submit();
		});
		$("#btnDelete").click(function() {
			if (confirm("삭제하시겠습니까?")) {
				document.updateForm.action = "${path}/board/delete";
				document.updateForm.submit();
			}
		});
	});
</script>
</head>
<body>
	<%@ include file="../include/menu.jsp"%>
	<form name="updateForm" method="post">
		<div>
			<label>번호</label> <input type="text" name="bno" value="${view.bno}"
				readonly="readonly" />
		</div>
		<div>
			<label>제목</label> <input type="text" name="title"
				value="${view.title}" />
		</div>
		<div>
			<label>내용</label>
			<textarea rows="5" cols="50" name="content">${view.contents}</textarea>
		</div>
		<div>
			<label>작성자</label> <input type="text" name="writer"
				value="${view.writer}" />
		</div>

		<div>
			<label>작성날짜</label> <input type="text" name="regDate"
				value="<fmt:formatDate value="${view.postDate}" pattern="yyyy-MM-dd" />" />
		</div>

		<div>
			<input type="hidden" name="bno" value="${view.bno}"> 
			<input type="button" id="btnUpdate" value="수정"> 
			<input type="button" id="btnDelete" value="삭제">
		</div>

	</form>
</body>
</html>