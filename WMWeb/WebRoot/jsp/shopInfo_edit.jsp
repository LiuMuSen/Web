<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link  rel="stylesheet" href="../css/shopInfo_edit.css"/>
<title>修改商家信息</title>
</head>
<body>
	<form id="shopInfoForm" action="${pageContext.request.contextPath }/shopInfo/saveOrUpdate.do" method="post">
		<input type="hidden" name="shopId" value="${Info.shopId}"/>
		<p id="editInfo"><img src="../images/GK.jpg" width="40" height="40"  style="border:1px solid white;"/>只允许修改以下相关信息</p>
		<table width="100%" border=0  cellspacing="1" cellpadding="1">
		<tr>
			<td width="15%">商家地址:</td>
			<td><input type="text" name="shopAddress" style="margin-bottom:20px;height:50px;width:700px;font-size:25px;border:1px solid blue;
		border-radius:15px" value="${Info.shopAddress}" /></td>
		</tr>
		<tr>
			<td width="15%">起送费(元):</td>
			<td><input type="text" name="shopBegincost" style="margin-bottom:20px;height:50px;width:200px;font-size:25px;border:1px solid blue;
		border-radius:15px" value="${Info.shopBegincost}"/></td>
		</tr>
		<tr>
			<td width="15%" >配送费(元):</td>
			<td><input type="text" name="shopTransfercost" style="margin-bottom:20px;height:50px;width:200px;font-size:25px;border:1px solid blue;
		border-radius:15px" value="${Info.shopTransfercost}"/></td>
		</tr>
		<tr>
	       <td width="15%">商家简介:</td>
		   <td><textarea rows="9" cols="60" name="shopDescription" id="shop_description" style="margin-bottom:20px;font-size:25px;border:1px solid blue;
		border-radius:15px">${Info.shopDescription}</textarea></td>
		</tr>
		<tr>
			<td  align="center" colspan="2"><input type="submit" value="提交"/></td>
		</tr>
		</table>
	</form>
</body>
</html>

