<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<LINK href="../css/operator_userList.css" type="text/css" rel="stylesheet">
<title>运营商|查看用户信息</title>
</head>
<body>
	<form  action="${pageContext.request.contextPath}/operator/updateUser.do" method="post">
		<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3;" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26">
					<strong><STRONG>用户详细信息</STRONG>
					</strong>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						编号：
					</td>
					<td class="ta_01" bgColor="#ffffff" width="30%">
						${user.userId }
					</td>
					<td align="center" bgColor="#f5fafe" class="ta_01" width="18%">
						名称：
					</td>
					<td class="ta_01" bgColor="#ffffff"  width="30%">
						${user.userName}
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						性别：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${user.userSex }
					</td>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						权限：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${user.powerName }
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						电话：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${user.userPhone }
					</td>
						<td align="center" bgColor="#f5fafe" class="ta_01">
						密码：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${user.password }
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						收货地址：
					</td>
				</tr>
				<c:forEach items="${user.addressList }" var="list">
					<tr>
						<td class="ta_01" align="center" bgColor="#f5fafe">
						</td>
						<td class="ta_01" bgColor="#ffffff" colSpan="3">
							${list.addressContent }
						</td>
					</tr>
				</c:forEach>
				<tr>
					<td class="ta_01" style="WIDTH: 100%" align="right" bgColor="#f5fafe" colSpan="4">
						<input class="button_ok" type="button" onclick="" value="查看消费记录"/>
						<input class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
						<span id="Label1"></span>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>