<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>	
<%@ include file="./include/header.jsp"%>
<%@ include file="./include/menu.jsp"%>
	<div class="container">
		<form role="form" action="${path}/loginPost" method="post">
			<div class="box-body">
				<div class="form-group"> 
					<input type="text" id="user_id" 
						name="user_id" class="form-control" placeholder="User ID..." />
				</div>
	
				<div class="form-group">
					<input type="password" name="user_pw" id="user_pw" 
						class="form-control" placeholder="Password..."/>
				</div>
				
				<div class="form-group">
					<label for="useCookie">
						<input type="checkbox" id="useCookie" name="useCookie" /> Remember Me
					</label>		
				</div>
			
			</div> <!-- end of box-body -->
			
			<div class="box-footer" style="margin:0 auto">
			  <button type="submit" class="btn btn-primary">Sign In</button>
			</div>
	
		</form>
	</div>
	<%-- <div class="text-center">
	   <a href="${ naver_url }"><img width="300" src="/resources/images/naver-login.png" alt="Naver Login" /></a>
	   <a href="${ google_url }"><img width="300" src="/resources/images/google-login.png" alt="Google Login" /></a>
	</div> --%>
	
<%@ include file="./include/footer.jsp"%>

</html>