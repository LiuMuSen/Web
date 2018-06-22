<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/home.css"/>
<title>首页 | 美味速递</title>
<script src="../js/jquery-1.4.2.min.js"></script>

</head>
<body>
	<%@include file="header.jsp" %>
	
	<div id="content">
		<div id="rest-banner">
			<span>商家分类</span>
			<ul>
				<li class="selected"><a href="#"><span>全部</span></a></li>
				<li><a href="#"><span>美食</span></a></li>
				<li><a href="#"><span>正餐优选</span></a></li>
				<li><a href="#"><span>超市</span></a></li>
				<li><a href="#"><span>精选小吃</span></a></li>
				<li><a href="#"><span>鲜果购</span></a></li>
				<li><a href="#"><span>下午茶</span></a></li>
			</ul>
		</div>
		
		<div  class="listcontent">
			<div  class="shoplist">
				<!-- <div class="shop_td">
					<div class="shop">
						<p><a href="#"><img src="../images/MDL.jpg" width="230px" height="150px"border="0" /> </a></p>
					</div>
					<div class="shop">
						<a href="fooditems.jsp">广州麦当劳百利华庭餐厅</a><br/>
						<span>起送费：￥0</span><span>配送费：￥9</span>
					</div>
				</div>  -->
				<c:forEach items="${shopList }" var = "s">
					<div class="shoplist">
						<div class="shop_td">
							<div class="shop">
								<p><a href="${pageContext.request.contextPath }/items/findAllByShopId.do?shopId=${s.shopId }"><img src="${picPath }${s.shopLogon }" title="${s.shopDescription }" width="230px" height="150px"border="0"></a></p>
							</div>
							<div class="shop">
								<a href="${pageContext.request.contextPath }/items/findAllByShopId.do?shopId=${s.shopId }">${s.shopName }</a><br>
								<span>起送费：￥${s.shopBegincost }</span><span>配送费：￥${s.shopTransfercost }</span>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			
			<div style="clear:both;"></div>
			<div class="pagination">
				<ul>
					<li class="disablepage"><a href="#">&lt;&lt;上一页</a></li>
					<li>第1页/共1页</li>
					<li class="nextPage"><a href="#">下一页&gt;&gt;</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<%@include file="foot.jsp" %>
</body>
</html>