<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/login.css">
<title>登录页面</title>
</head>
<body>
	<div id="nav"><a href="#">美味速递</a></div>
	<div style="width:100%;height:1px; background:RGB(255,255,255);"></div>
	<div id="login_div">
		<div id="login_div1">
			<div style="width:100%;height:10px; background:RGB(250,179,71);"></div>
			<h1>欢迎登录</h1>
			<div id="regin_div"><a href="#">没有帐号？点击注册</a></div>
			<form action="" method="post" id="login_form">
				<input type="text"　name="user_name" id="user_name" placeholder="请输入手机号码"/><br/>
				<input type="password" name="password" id="password" placeholder="请输入密码"/><br>
				<input type="text" name="checkcode" id="checkcode" placeholder="请输入验证码"/><img id="scode" src="../images/checkcode.png"/><br>
				<input type="submit" id="btn_submit" value="立即登录"/>
			</form>
		</div>
	</div>
</body>
</html>