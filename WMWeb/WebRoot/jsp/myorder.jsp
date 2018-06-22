<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/myorder.css">
<title>我的订单</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div id="content">
		
		<!-- 一张订单的开始 -->
		<c:forEach items="${user.order }" var="o">
			
		
		<table class="order" cellSpacing="1" cellPadding="5" width="100%" border="0">
			<tr class="first_tr" align="left">
				<th colspan="2" width="60%">
					<span style="font-size:30px; font-style: italic;">订单号：${o.orderId }</span>
					<span style="color:red"></span>
				</th>
				<th colspan="2" width="40%">
					<%-- <fmt:parseDate value="${o.orderCreatetime}" pattern="yyyy-MM-dd HH:mm" var="test"/> 
					<fmt:formatDate value="${test}" pattern="yyyy-MM-dd　HH：mm"/>   --%>
					时间：${o.orderCreatetime }
				</th>
			</tr>
			<tr class="second_tr" align="left">
				
					<th colspan="4"><img src="../images/GK.png" width="40" heigth="40">订单状态：<c:if test="${o.orderStatus == 0}"><span>已下单</span></c:if>
						<c:if test="${o.orderStatus == 2}"><span>已完成</span></c:if>
					</th>
				
			</tr>
			<tr class="thress_tr">
				<th colspan="4" align="left">
					<span>顾客：${user.userName }</span>
					<span>电话：${user.userPhone }</span>
					<span>地址：${o.address.addressContent }</span>
				</th>
			</tr>
			<tr class="four_tr">
				<th width="50%">菜品</th>
				<th width="25%">单价(元)</th>
				<th width="25%">数量</th>
			</tr>
			 <c:forEach items="${o.detailList }" var="i"> 
				<tr>
						<th>${i.items.itemsName}</th>
						<th>12</th>
						<th>1</th>
				</tr>
			</c:forEach> 
				
			<tr align="right">
				<th colspan="4"><span style="color:RGB(70,141,188)">配送费：</span>${o.shop.shopTransfercost }元</th>
			</tr>
			<tr class="seven_tr" align="right">
				<th colspan="4"><span style="color:RGB(70,141,188)">总价：${o.orderTotalprice }元</span></th>
			</tr>
			</table>
		<!-- 一张订单的结束 -->
		</c:forEach>
		</div>
	
	
	<%@include file="foot.jsp" %>
	
</body>
</html>