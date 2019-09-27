<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<div style="text-align: right;">
	<span class="hidden-xs">
				<% if (session.getAttribute("loginUser") == null) { %>
					로그인 하세요
				<% } else { %>
					${ loginUser.user_id}
				<% } %>		
	</span>	
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
			<a class="navbar-brand page-scroll" href="${path}/"><i class="fa fa-coffee"></i>&nbsp;커피사이트<%-- <img src="${path}/resources/images/logo.png?v1" style="width:215px; height:50px;" alt="커피사이트 로고"> --%></a>		
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden">
					<a href="#page-top"></a>
				</li>			
				<li>					
					<a class="page-scroll" href="${path}/login">로그인</a>
				</li>
				
				<li>					
					<a class="page-scroll" href="${path}/logout">로그아웃</a>
				</li>
				<li>
					<a class="page-scroll" href="${path}/user/join">회원가입</a>
				</li>
				<li>
					<a class="page-scroll" href="${path}/board/boardList">게시판</a>
				</li>
				<li>
					<a class="page-scroll" href="${path}/user/list">회원목록</a>
				</li>
				<li>
					<a class="page-scroll" href="${path}/user/myPage">마이페이지</a>
				</li>					
			</ul>		
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

