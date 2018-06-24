<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码 | 我的信息  | 美味速递</title>
<link rel="stylesheet" href="../css/myinfo_changepw.css">
</head>
<body>
	<%@include file="header.jsp" %>
	
	<div class = "content">
		<h3>修改密码</h3>
		<form action="${pageContext.request.contextPath }/user/modifyPwd.do" method="post">
			<div class="change">
				<div class="o_pw">
					<span>原始密码：</span>
					<span>
						<input type="password" name="userPassword">
					</span>
				</div>
				<div class="n_pw">
					<span>新密码：</span>
					<span>
						<input type="password" name="newPassword">
					</span>
				</div>
				<div class="cn_pw">
					<span>确认新密码：</span>
					<span>
						<input type="password" name="rePassword">
					</span>
				</div>
				<div>
					<input type="submit" id="btn_submit" value="修改密码">
				</div>
			</div>
		</form>
	</div>
	
	<%@include file="foot.jsp" %>
</body>
</html>