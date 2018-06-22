<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家修改密码</title>
<style type="text/css">
	#changePWDForm{
		width:700px;
		margin:0 auto;
		font-size:20px;	
	}
	input[type="password"]{
		width:200px;
		height:50px;
		margin-top:10px;
		margin-bottom:10px;
		border:1px solid  blue;
		border-radius:5px;
		font-size:20px;
	}
	input[type="submit"]{
		width:100px;
		height:30px;
		margin-top:10px;
		border-radius:5px;
		border:1px solid  blue;
		font-size:15px;
		border-radius:5px;
		cursor: pointer;
	}
	
	input[type="submit"]:hover{
		background:yellow;
	}
</style>
</head>
<body>
	<form id="changePWDForm" action="${pageContext.request.contextPath }/shopInfo/modifyPwd.do" method="post">
		<table width="100%" border=0 cellspacing="1" cellpadding="1">
			<tr>
				<td align="right">输入原始密码:</td>
				<td align="left" style="width:500px;"><input type="password" name="userPassword"/><span style="color:red">${mes }</span></td>
			</tr>
			<tr>
				<td align="right">输入新密码:</td>
				<td align="left"><input type="password" name="newPassword"/><span style="color:red">${mes1 }</span></td>
			</tr>
			<tr>
				<td align="right">确定新密码:</td>
				<td align="left"><input type="password" name="rePassword"/></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="确定"/></td>
			</tr>
		</table>
	</form>
</body>
</html>