<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<LINK href="../css/operator_userList.css" type="text/css" rel="stylesheet">
<title>运营商|编辑用户信息</title>
</head>
<body>
	<form  action="${pageContext.request.contextPath}/operator/updateUser.do" method="post">
		<table cellSpacing="1" cellPadding="5" width="500px" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3; margin-top:10%;" border="0">
			<tr>
				<td class="ta_01" align="center" style="background-color:rgb(70,141,188)" colSpan="4"
					height="50">
					<strong><STRONG>修改用户信息</STRONG>
					</strong>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01" height="30">
						编号：
					</td>
					<td class="ta_01" bgColor="#ffffff" width="30%">
						<input type="hidden" name="userId" value="${user.userId }">${user.userId }
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" width="18%" height="30">
						名称：
					</td>
					<td class="ta_01" bgColor="#ffffff"  width="30%">
						<input type="text" name="userName" value="${user.userName}">
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						性别：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="radio" name="userSex" value="男">男
						<input type="radio" name="userSex" value="女">女
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						电话：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="userPhone" value="${user.userPhone}">
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						密码：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="password" name="password"  value="${user.password}">
					</td>
				</tr>
				<tr>
					<td class="ta_01" style="WIDTH: 100%" align="right" bgColor="#f5fafe" colSpan="4">
						<input class="button_ok" type="submit"  value="确定修改"/>
						<input class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
						<span id="Label1"></span>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>