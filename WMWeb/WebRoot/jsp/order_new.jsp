<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>最新订单页面</title>
<link rel="stylesheet" href="../css/new_order.css">
</head>
<body>
	<div id="content">
	  <div>
		<div class="panel-heading"><span>订单信息列表</span></div>
			<c:forEach items="${shopOrder.order }" var="orders">
			<!-- 一张订单的开始 -->
			<form action="${pageContext.request.contextPath }/shopInfo/dealOrder.do?orderId=${orders.orderId}"  method="post">
				<div class="oreder_new">
					<div class="userInfo">
						<span><input type="hidden" name="orderId"  value="${orders.orderId}"/></span>
						<div class="username">顾客:${orders.address.user.userName}</div>
						<div class="userphone">电话:${orders.address.user.userPhone}</div>
						<div class="userAdd"><a href="#"><span>地址:${orders.address.addressContent}</span></a></div>
						<div class="createTime">下单时间:<fmt:formatDate value="${orders.orderCreatetime}" pattern="yyyy-MM-dd HH:mm:ss" /></div>
					</div>
					<div style="clear:both;"></div>
					<c:forEach items="${orders.detailList }" var="detail" >
						<div class="foodInfo">
							<div class="foodImage"><img src="../images/food1.jpg" width="30px" height="30px;"></div>
							<div class="foodName">${detail.items.itemsName }</div>
							<div class="foodNumber">数量:${detail.number}</div>
							<div class="foodPrice">单价:${detail.items.itemsPrice}</div>
						</div>
					</c:forEach>
					<div style="clear:both;"></div>
	
					<div class="otherInfo">
						<div>起送费:${shopOrder.shopBegincost }元</div>
						<div>配送费:${shopOrder.shopTransfercost }元</div>
						<div class="totalPrice">总价:${orders.orderTotalprice }元</div>
					</div>
					<div class="btn">
							<c:if test="${orders.orderStatus == 0}"><a href="#"><span>未接单</span></a><input  type="submit" style="float:right; margin-right:3px; height:25px; cursor: pointer;" value="接单处理"/></c:if>
							<c:if test="${orders.orderStatus == 2}"><a href="#"><span>已接单</span></a></c:if>
					</div>
				</div>
			</form>
		<!-- 一张订单的结束 -->	
		</c:forEach>
		
		<div style="clear:both;"></div>
		<!-- 分页开始 -->
		<div class="pagination">
			<ul>
				<li class="disablepage"><a href="#">&lt;&lt;上一页</a></li>
				<li>第1页/共1页</li>
				<li class="nextPage"><a href="#">下一页&gt;&gt;</a></li>
			</ul>
		</div><!-- 分页结束 -->
		
		
	</div>
</div>
</body>
</html>