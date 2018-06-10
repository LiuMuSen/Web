<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<td width="5%">删除</td>
			<td width="5%">修改</td>
		</tr>
		
		<tr align="center">
			<td><input type="checkbox" name="id" value="${item.id }"></td>
			<td>套餐1号</td>
			<td><img id='imgSize1ImgSrc' src='../images/food1.jpg'  height="100" width="100" /></td>
			<td>￥10</td>
			<td>很好吃的套餐</td>
			<td><input type="button" value="删除"/></td>
			<td><input type="button" value="修改"/></td>
		</tr>
		
	</table>
</body>
</html>