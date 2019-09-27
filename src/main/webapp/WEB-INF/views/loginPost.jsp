<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="./include/header.jsp"%>
<%@ include file="./include/menu.jsp"%>

<div>
	<div class="text-center text-danger mtb50">${ loginResult }</div>

	<div class="box-footer text-center" >
		<a href="${path}/login" class="btn btn-primary">Retry Sign In</a>
	</div>

</div>

<%@ include file="./include/footer.jsp"%>
</html>