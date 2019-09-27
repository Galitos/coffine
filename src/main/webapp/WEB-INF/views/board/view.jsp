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
			document.form.action = "${path}/board/update";
			document.form.submit();
		});
		$("#btnDelete").click(function() {
			if (confirm("삭제하시겠습니까?")) {
				document.form.action = "${path}/board/delete";
				document.form.submit();
			}
		});
		$("#btnList").click(function() {
			location.href="${path}/board/boardList";
		});
		
	});
</script>
<script type="text/javascript"
	src="${path}/resources/ckeditor/ckeditor.js"></script>
</head>
<body>
	<%@ include file="../include/menu.jsp"%>
	<form name="form" method="post">
		<div>
			 <input type="hidden" name="bno" value="${view.bno}"
				readonly="readonly" />
		</div>
		<div>
			<label>제목</label> <input type="text" name="title"
				value="${view.title}" />
		</div>
		<div>
			<label>내용</label>
			<textarea name="contents" id="contents">${ view.contents }</textarea>
			<script type="text/javascript">
					CKEDITOR.replace('contents', {
						height : 400
						});
			</script>
		</div>
				
		<div>
			<label>작성자</label> <input type="text" name="writer"
				value="${view.writer}" readonly />
		</div>

		<div>
			<label>작성날짜</label> <input type="text" name="regDate"
				value="<fmt:formatDate value="${view.postDate}" pattern="yyyy-MM-dd" />" />
		</div>

		<div align="center">
		<!-- 	<button id="btnDelete" class="btn btn-danger">삭제</button>
			<button id="btnUpdate" class="btn btn-primary">수정</button> -->
			<input type="hidden" name="bno" value="${view.bno}"> 
			<c:if test="${ loginUser.user_id == view.writer }">
			<input type="button" id="btnUpdate" value="수정"> 
			<input type="button" id="btnDelete" value="삭제">
			</c:if>
			<input type="button" id="btnList" value="목록">
		</div>

	</form>
</body>
</html>