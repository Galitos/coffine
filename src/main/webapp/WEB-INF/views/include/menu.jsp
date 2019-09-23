<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<div style="text-align: right;">
	<a href="${path}/새로 작성">로그인</a>
	<a href="${path}/user/join">회원가입</a>
	<a href="${path}/user/list">회원목록</a>
	<a href="${path}/board/boardList">게시판</a>
	<a href="${path}/새로 작성">즐겨찾기</a>
	<a href="${path}/user/myPage">마이페이지</a>
	<a href="${path}/새로 작성">장바구니</a>
</div>

<!-- Navigation -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand page-scroll" href="${path}/"><img src="${path}/resources/images/logo.png" alt="Lattes theme logo"></a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden">
					<a href="#page-top"></a>
				</li>
				<li>
					<a class="page-scroll" href="#about">About</a>
				</li>
				<li>
					<a class="page-scroll" href="${path}/user/join">회원가입</a>
				</li>
				<li>
					<a class="page-scroll" href=""${path}/user/list">회원목록</a>
				</li>
				<li>
					<a class="page-scroll" href="${path}/user/myPage">마이페이지</a>
				</li>
				<li>
					<a class="page-scroll" href="#contact">Contact</a>
				</li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

