<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="include/header.jsp" %>
<%@ include file="include/menu.jsp" %>
<title>upload test</title>
</head>
<body>
	<form action="${path}/uploadForm" id="form1" method="post" enctype="multipart/form-data" target="ifr">
	 	<input type="file" name="file1" />
		<input type="submit"/>
	</form>
	savedFileName: ${ savedFileName }
	<iframe frameborder="1" width="500" height="400" name="ifr"></iframe>
	
</body>
<%@ include file="include/footer.jsp" %>
</html>