<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/register.css">
<title>注册 | 美味速递</title>
</head>
<body>
	<div style="width: 100%; height: 1px; background: RGB(255, 255, 255);"></div>
	<div class="content">
		<div class = "reg_div">
			<div id="nav">
				<a href="#">美味速递</a>
			</div>
			<form action="" method="post">
				<div>
					<input type="text" name="phone" placeholder ="手机号">
				</div>
				<div>
					<input type="password" name="password" placeholder ="密码">
				</div>
				<div>
					<input type="password" name="password2" placeholder ="确认密码">
				</div>
				<div>
					<input type="submit" id="btn_submit" value="注册">
				</div>
				<div>
					<a href="#" class = "text">已有账号?登录</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>