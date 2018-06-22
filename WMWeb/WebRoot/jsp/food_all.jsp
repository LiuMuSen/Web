<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有菜品</title>
<link rel="stylesheet" href="../css/food_all.css">
</head>
<body>
	<table width="100%" cellSpacing="1" cellPadding="5" width="100%" border="0" align="center">
		<tr align="center" style="background: RGBA(240,240,240,0.9); color:#009FCC;">
			<td width="5%"></td>
			<td width="15%">商品名称</td>
			<td width="15%">商品图片</td>
			<td width="5%">商品价格</td>
			<td width="30%">商品描述</td>
			<td width="5%">修改</td>
			<td width="5%">删除</td>
		</tr>
		<c:forEach items="${itemsList }" var="item">
			<tr align="center">
				<td><input type="checkbox" name="id" value="${item.itemsId }"></td>
				<td>${item.itemsName }</td>
				<td><img id='imgSize1ImgSrc' src='${picPath }${item.itemsImagespic }'  height="100" width="100" /></td>
				<td>${item.itemsPrice }</td>
				<td>${item.itemsContent }</td>
				<td><a href="${pageContext.request.contextPath }/items/edit.do?id=${item.itemsId}">修改</a></td>
				<td><a href="${pageContext.request.contextPath }/items/deleteByID.do?id=${item.itemsId}">删除</a></td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>