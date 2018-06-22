<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/fooditems.css"/>
<script src="../js/jquery-3.3.1.min.js"></script>
<title>商家首页</title>
</head>
<body>
	<div id="content">
		<div id="shop_info">
			<div id="shop_logon"><img alt="" src="${picPath }${shop.shopLogon }" width="90px" height="70px"border="0"/></div>
			<div id="shop_name"><h2>${shop.shopName}</h2></div>
			<div class="money"><p>配送：<h2>￥${shop.shopTransfercost}</h2></p></div>
			<div class="money"><p>起送：<h2>￥${shop.shopBegincost}</h2></p></div>
		</div>
		
		<div style="clear:both;"></div>
		
		<div id="food_banner">
			<ul><li class="slected"><a href=""><span>菜单</span></a></li></ul>
		</div>
		
		<div  class="items_listcontent">
			<div  class="foodlist">
				<c:forEach items="${itemList }" var = "i">
					<div class="food_td">
						<div class="food">
							<p><a href="#"><img src="${picPath }${i.itemsImagespic }" title="${i.itemsContent }" width="200px" height="150px"border="0" /></a></p>
						</div>
						<div class="food">
							<a href="#" id="left1">${i.itemsName }</a>
							<span>价格:￥</span>
							<span id="left2">${i.itemsPrice }</span>
							<div id="left3"  style="display: none">${i.itemsId }</div>
						</div>
					</div>	
				</c:forEach>
				
			</div>
			
			<div style="clear:both;"></div>
			
		</div>
	</div>
</body>
</html>