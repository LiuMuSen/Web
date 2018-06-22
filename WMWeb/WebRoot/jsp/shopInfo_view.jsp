<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link  rel="stylesheet" href="../css/shopInfo_view.css"/>
<title>商家信息</title>
</head>
<body>
	<form id="shopInfoForm" action="#" method="post">
		<table width="100%" border=0 cellspacing="1" cellpadding="1">
		<tr>
			<td width="15%">商家名称:</td>
			<td><input type="text" name="shopName" value="${Info.shopName}" disabled="disabled"/></td>
		</tr>
		<tr>
			<td width="15%">商家属性:</td>
			<td><input type="text" name="shopName" value="${Info.type.typeName}" disabled="disabled"/></td>
		</tr>
		<tr>
			<td width="15%">商家地址:</td>
			<td><input type="text" name="shopName" value="${Info.shopAddress}" disabled="disabled"/></td>
		</tr>
		<tr>
			<td width="15%">起送费(元):</td>
			<td><input type="text" name="shopName" value="${Info.shopBegincost}" disabled="disabled"/></td>
		</tr>
		<tr>
			<td width="15%">配送费(元):</td>
			<td><input type="text" name="shopName" value="${Info.shopTransfercost}" disabled="disabled"/></td>
		</tr>
		<tr>
			<td width="15%">商家图标:</td>
			<td>
				<p>
					<img id='imgSize1ImgSrc' src='${picPath }${Info.shopLogon}'  height="100" width="150" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="15%">商家简介:</td>
			<td><textarea rows="9" cols="75" name="shop_description" id="shop_description" disabled="disabled">${Info.shopDescription}</textarea></td>
		</tr>
		</table>
	</form>
</body>
</html>