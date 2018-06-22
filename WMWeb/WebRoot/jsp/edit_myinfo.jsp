<%@page import="com.os.domain.*"%>
<%@page import="java.lang.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/edit_myinfo.css">
<title>修改个人信息 | 美味速递</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<div class="content">
		<h3>修改个人信息</h3>
		<form action="${pageContext.request.contextPath }/user/EditMyinfo.do" method="post">
			<div class="edit">
				<div>
				<input type="hidden" name="userId" value="${user.userId }">
					<span>姓名：</span>
					<span>
						<%
							if(userName == null){
								out.print("<input type=\"text\" name=\"userName\">");
							}else{
								out.print("<input type=\"text\" name=\"userName\" value=\""+ userName +"\">");
							}
						%>
					</span>
				</div>
				<div class="sex">
					<span>性别：</span><br><span><input type="radio" name="userSex" value="男" 
						<% User user = (User) session.getAttribute("user");
							String sex = user.getUserSex();
							if(sex == "男"){
								out.print(sex);
								out.print("checked");
							}
						%>>
						男<input
						type="radio" name="userSex" value="女"<%if(sex =="女"){out.print("checked");} %>>女</span>
				</div>
				<div>
					<input type="submit" id="btn_submit" value="修改">
				</div>
			</div>
		</form>

	</div>

	<%@include file="foot.jsp"%>
</body>
</html>