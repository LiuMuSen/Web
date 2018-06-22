<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/order.css">
<!-- <link rel="stylesheet" href="../css/reset.css"> -->
<title>结算 | 美味速递</title>
</head>
	<%@include file="header.jsp" %>
    <section class="cartMain">
        <div class="cartMain_hd">
            <ul class="order_lists cartTop">
                <li class="list_con">商品信息</li>
                <li class="list_price">单价</li>
                <li class="list_amount">数量</li>
                <li class="list_sum">金额</li>
            </ul>
        </div>

        <div class="cartBox">
            <div class="order_content">
                <!-- <ul class="order_lists">
                    <li class="list_con">
                        <div class="list_img"><a href="javascript:;"><img src="images/1.png" alt=""></a></div>
                        <div class="list_text"><a href="javascript:;">夏季男士迷彩无袖T恤圆领潮流韩版修身男装背心青年时尚打底衫男</a></div>
                    </li>
                    <li class="list_price">
                        <p class="price"></p>
                    </li>
                    <li class="list_amount">
                        <div class="amount_box">
                            <a href="javascript:;" class="reduce reSty">-</a>
                            <input type="text" value="1" class="sum">
                            <a href="javascript:;" class="plus">+</a>
                        </div>
                    </li>
                    <li class="list_sum">
                        <p class="sum_price">￥980</p>
                    </li>
                </ul> -->
				
				<c:forEach items="${cartList }" var="c">
					<ul class="order_lists">
						<li class="list_con">
							<div class="list_img"><a href="javascript:;"><img alt="物品图片" src="${c.itemsImagespic }" title="${c.itemsContent }"></a></div>
							<div class="list_text"><a href="javascript:;">${c.itemsName }</a></div>
						</li>
						<li class="list_price">
							<p class="price">${c.itemsPrice }</p>
						</li>
						<li class="list_amount">
							<div class="amount_box">
                            	<a href="javascript:;" class="reduce reSty">-</a>
                            	<input type="text" value="${c.number }" class="sum">
                            	<a href="javascript:;" class="plus">+</a>
                        	</div>
						</li>
						<li class="list_sum">
							<p class="sum_price">￥${c.totalPrice }</p>
						</li>
					</ul>
				</c:forEach>
				                	
            </div>
        </div>
        
        <form action="${pageContext.request.contextPath}/cart/pay.do" method="post">
        	<div class="info">
	        	<div>名字：${user.userName }</div>
	        	<div>联系方式：${user.userPhone }</div>
	        	<div>收货地址：
	        		<select name="addressId">
	        			<option value="0" selected>请选择地址</option>
	        			<c:forEach items="${addressList }" var="a">
		        			<option  value="${a.addressId }">${a.addressContent }</option>
	        			</c:forEach>
	        		</select>
	        	</div>
        	</div>
        
        	<!--底部-->
        	<div class="bar-wrapper">
            	<div class="bar-right">
                	<div class="totalMoney">共计: <strong class="total_text">${sessionScope.totalPrice }元</strong></div>
                	<div class="calBtn"><input type="submit" value="结算"></div>
            	</div>
        	</div>
        </form>
        
    </section>
	
</body>
</html>