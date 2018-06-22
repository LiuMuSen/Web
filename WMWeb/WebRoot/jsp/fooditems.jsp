<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/fooditems.css"/>
<script src="../js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	$(".add").click(function(){
		var name = $(this).siblings("#left1").html();
		var cast = $(this).siblings("#left2").html();
		var totalNum = $("#gwc").html();
		var totalCast =  $("#bill").html();
		var j = 0;
		var num = 0;
		var cast1 = 0;
		for(var i = 1;i<$("#order-body").children("div").length;i++){
			if($("#order-body").children("div").eq(i).children("div").html()==name){
			num = $("#order-body").children("div").eq(i).children("div").eq(1).children("span").html();
			num = parseInt(num) +1;
			if (num > 0){
				$("#show").show();
			}
			cast1 = $("#order-body").children("div").eq(i).children("div").eq(2).html();
			cast1 = (parseFloat(cast1)+parseFloat(cast)).toFixed(1);
			j = parseInt(j)+1;					
			$("#order-body").children("div").eq(i).children("div").eq(1).children("span").html(num);
			$("#order-body").children("div").eq(i).children("div").eq(2).html(cast1);
			break;
			}
		}
		if(j==0){
			$("#order-body").children("div:last-child").after("<div class='order-body-both' id='show'><div id='itemName' class='order-body-1-both'>"+name+"</div><div class='order-body-2-both'><input type='button' value='-' id='jian' class='order-math' onclick='jian()'/><span id='num'>1</span><input type='button' value='+' id='jia'  class='order-math' onclick='jia()'/></div><div class='order-body-3-both' id='price'>"+cast+"</div></div>");
		}
		totalNum = parseInt(totalNum)+1;
		totalCast = (parseFloat(totalCast)+parseFloat(cast)).toFixed(1);
		$("#gwc").html(totalNum);
		$("#bill").html(totalCast);
		var id= $(this).siblings("#left3").html();
		$.ajax({
			url:"${pageContext.request.contextPath}/cart/addItems.do",
			type:"post",
			data:{"itemsId":id},
			xhrFields: {
		           withCredentials: true
		       },
		       crossDomain: true,
			success:function(data){
				
			},
			error:function(){
				
			}
		});
		
	});
	
});

</script>
<title>${shop.shopName} | 美味速递</title>
</head>
<body>
	<!-- oy -->
	<%@include file="header.jsp" %>
	
	<div id="content">
		<div id="shop_info">
			<div id="shop_logon"><img alt="" src="${picPath }${shop.shopLogon }" width="90px" height="70px"border="0"/></div>
			<div id="shop_name"><h2>${shop.shopName}</h2></div>
			<div class="money"><p>配送：<h2>￥${shop.shopTransfercost}</h2></p></div>
			<div class="money"><p>起送：<h2>￥${shop.shopBegincost}</h2></p></div>
		</div>
		
		<div style="clear:both;"></div>
		
		<div id="food_banner">
			<ul><li class="slected"><a href=""><span>菜单</span></a></li><li><a href=""><span>评价</span></a></li></ul>
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
							<button class="add">+</button>
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
		
<!-- 		<div id="" class="access_listcontent"">
			<div class="access">
				<ul>
					<li>好吃好吃好吃好吃好吃</li>
					<li>好吃好吃好吃好吃好吃</li>
					<li>好吃好吃好吃好吃好吃</li>
					<li>好吃好吃好吃好吃好吃</li>
				</ul>
			</div>
			
			<div style="clear:both;"></div>
			<div class="pagination">
				<ul>
					<li class="disablepage"><a href="#">&lt;&lt;上一页</a></li>
					<li>第1页/共20页</li>
					<li class="nextPage"><a href="#">下一页&gt;&gt;</a></li>
				</ul>
			</div>
		</div> -->
		
		
		<!-- <div class="buycar">
			<input type="button" value="购物车">
		</div>  -->
		
		<div id="order">
			<div id="order-head">
				<div id="order-head-left">
	          		<span>购物车</span>
	  	    	</div>
	  	   		<div id="order-head-right">
	  	    		<a href=" ">清空</a >
	  	    	</div>
			</div>
			<div id="clean"></div>
	  	    <%-- <div id="order-neck">
		  		<span>地址${name }</span>
		  		<a href="${pageContext.request.contextPath}/address/toaddress.action" id="addaddress">选择地址</a >
	  	    </div>  --%>
	  	    <div id="order-body">
	  	    	<div class="order-body-both-new" id="bro">
	  	    		<div class="order-body-1-both">
	  	    			餐点
	  	    		</div>
	  	    		<div class="order-body-2-both">
	  	    			
	  	    			数量
	  	    			
	  	    		</div>
	  	    		<div class="order-body-3-both">
	  	    			价格
	  	    		</div>
	  	    	</div>
	  	    </div>
	  	    <div id="clean"></div>
	  	    <div id="feet">
	  	    	<form action="${pageContext.request.contextPath}/cart/downOrder.do" method="post">
		  			<div id="feet-left">
		  				<div class="first">&nbsp;共<span class="totalnumber"  id = "gwc">0</span>份</div>
		  				<div class="first">总计<span class="bill" ><span id="bill" name="totalPrice">0</span>元</span></div>
		  			</div>
					<div id="feet-right"><input type="submit" value="结算" id="downOrder"/></div>
	  	    	</form>
	  	    </div>
			<div id="fixedd"></div>
	  	</div>
	</div>
	
	<%@include file="foot.jsp" %>

</body>
</html>

