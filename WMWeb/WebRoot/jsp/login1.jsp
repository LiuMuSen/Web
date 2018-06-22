<%@ page language="java" pageEncoding="UTF-8"%>
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/login1.css">
<title>登录 | 美味速递</title>
	<script type="text/javascript">
		function changecode(){
			var safecode = document.getElementById("safecode");
			safecode.src="checkCode.do?"+Math.random();
		}
	</script>
</head>
<body>
	<div class="content">
		<div id="logon"><img src="images/bg2.jpg"/></div>
		<div id="login_div">
			<div id="nav">
				<a href="#">美味速递</a>
			</div>
			<form action="login/LoginMWSD.do" method="post" id="login_form">
				<div>
					<input type="text" name="userPhone" id="userPhone"
						placeholder="请输入手机号码" />
				</div>
				<div>
					<input type="password" name="password" id="password"
						placeholder="请输入密码" />
				</div>
				<div class="checkcode">
					<input type="text" name="check" id="check" 
						placeholder="请输入验证码" /><img id="safecode" onclick="changecode()"
						src="checkCode.do" />
				</div>
				<div>
					<input type="submit" id="btn_submit" value="登录" />
				</div>
				<div class="text">
					<a href="${pageContext.request.contextPath }/jsp/register.jsp" >注册账号</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>