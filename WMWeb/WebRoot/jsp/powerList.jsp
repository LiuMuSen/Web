<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.0.1:8003/ssmImage19"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/items/deleteByIds.do" method="post">
</table>
权限列表：
<table width="100%" border=1>
<tr>
	<td>ID</td>
	<td>名称</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemsList }" var="item">
<tr>
	<td>${item.id }</td>
	<td>${item.powerName }</td>
	<td><a href="${pageContext.request.contextPath }/items/edit.do?id=${item.id}">修改</a>
	<a href="${pageContext.request.contextPath }/items/deleteByID.do?id=${item.id}">删除</a>
	</td>

</tr>
</c:forEach>

</table>
</form>
</body>

</html>