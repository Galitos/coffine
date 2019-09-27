<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert title here</title>
<%@ include file="../include/header.jsp"%>
<script>
	$(function() {
		$("#btnWritrForm").click(function() {
			location.href = "${path}/board/write";
		});
	});
</script>
<script>
	//이전 버튼 이벤트
	function fn_prev(page, range, rangeSize) {
		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;
		var url = "${path}/board/boardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}

	//페이지 번호 클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
		var url = "${path}/board/boardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}

	//다음 버튼 이벤트
	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;
		var url = "${path}/board/boardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
</script>
</head>
<body>
	<%@ include file="../include/menu.jsp"%>
	<div class="container">
		<table class="table" border="1" width="900px">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>작성일</th>
				</tr>
			</thead>
	
			<tbody>
				<c:forEach items="${list}" var="list">
					<tr>
						<td>${list.bno}</td>
						<td><a href="${path}/board/view?bno=${list.bno}">${list.title}</a></td>
						<td>${list.writer}</td>
						<td>${list.viewCnt}</td>
						<td><fmt:formatDate value="${list.postDate}"
								pattern="yyyy-MM-dd" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div style="float:right;">
			<button type="button" class="btn btn-sm-primary" id="btnWritrForm">글쓰기</button>
		</div>
		<div style="clear:both"></div>

		<!-- pagination{s} -->
		<div id="paginationBox" style="margin: 0 auto;">
			<ul class="pagination">
	
				<c:if test="${pagination.prev}">
					<li class="page-item"><a class="page-link" href="#"
						onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}')">Previous</a></li>
				</c:if>
	
				<c:forEach begin="${pagination.startPage}"
					end="${pagination.endPage}" var="idx">
					<li
						class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/> "><a
						class="page-link" href="#"
						onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}')">
							${idx} </a></li>
				</c:forEach>
	
				<c:if test="${pagination.next}">
					<li class="page-item"><a class="page-link" href="#"
						onClick="fn_next('${pagination.range}', 
				'${pagination.range}', '${pagination.rangeSize}')">Next</a></li>
				</c:if>
			</ul>
		</div>
		<!-- pagination{e} -->
	</div>


</body>
</html>