<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>运营商|添加用户</title>
</head>
<body>
	<form  action="${pageContext.request.contextPath}/operator/adduserInfo.do" method="post">
		<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3;" border="0">
			<tr>
				<td class="ta_01" align="center" style="background-color:rgb(70,141,188)" colSpan="4"
					height="26">
					<strong><STRONG>添加用户信息</STRONG>
					</strong>
					</td>
				</tr>

				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" width="18%">
						名称：
					</td>
					<td class="ta_01" bgColor="#ffffff"  width="30%">
						<input type="text" name="userName">
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						性别：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="radio" name="userSex" value="男">男
						<input type="radio" name="userSex" value="女">女
					</td>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						权限：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="radio" name="PowerName" value="管理员">管理员
						<input type="radio" name="PowerName" value="顾客">顾客
						<input type="radio" name="PowerName" value="商家">商家
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						电话：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="userPhone">
					</td>
						<td align="center" bgColor="#f5fafe" class="ta_01">
						密码：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="password" name="password">
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						收货地址：
					</td>
					<td class="ta_01" bgColor="#ffffff" colSpan="3">
						<input type="text" name="addressContent">
					</td>
				</tr>
				<tr>
					<td class="ta_01" style="WIDTH: 100%" align="right" bgColor="#f5fafe" colSpan="4">
						<input class="buuton＿ok" type="submit" value="确认添加"/>
						<input class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
						<span id="Label1"></span>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>