<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="커피">
<meta name="author" content="">
<link rel="icon" href="favicon.ico">
<title>커피에 관심있는 사람들</title>

<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<link rel="stylesheet" href="${path}/include/radio.css" />

<link href="${path}/resources/style.css?ver=1" rel="stylesheet" type="text/css" />

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="${path}/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Custom styles for this template -->
<link rel="stylesheet" href="${path}/resources/css/owl.carousel.css" >
<link rel="stylesheet" href="${path}/resources/css/owl.theme.default.min.css">
<link rel="stylesheet" href="${path}/resources/css/style.css?v3">
<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="${path}/resources/js/ie-emulation-modes-warning.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->

<!-- Bootstrap core JavaScript
	================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
<script src="${path}/resources/js/bootstrap.min.js"></script>
<script src="${path}/resources/js/owl.carousel.min.js"></script>
<script src="${path}/resources/js/cbpAnimatedHeader.js"></script>
<script src="${path}/resources/js/theme-scripts.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="${path}/resources/js/ie10-viewport-bug-workaround.js"></script>

<!-- Header -->
<header>
	<div class="container">
		<div class="slider-container">
			<div class="intro-text">
				<div class="intro-lead-in">커피 홍보 사이트</div>
				<div class="intro-heading">포토폴리오</div>
				<a href="#about" class="page-scroll btn btn-xl">소개</a>
			</div>
		</div>
	</div>
</header>








