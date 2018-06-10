<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/order_history.css">
<link rel="stylesheet" href="../css/order_back.css">
<title>退单页面</title>
</head>
<body>
	<div id="content">
		<div class="panel-heading"><span>退单信息列表:共</span><span style="color:red">1</span>张订单</div>
		
		<!-- 一张订单的开始 -->
		<table class="order" cellSpacing="1" cellPadding="5" width="100%" border="0">
			<tr class="first_tr" align="left">
				<th colspan="2" width="60%">
					<span style="font-size:30px; font-style: italic;">订单号：1</span>
					<span style="color:red">(用户退单)</span>
				</th>
				<th colspan="2" width="40%">
					时间：2018/06/10 15:19:10
				</th>
			</tr>
			<tr class="second_tr" align="left">
				<th colspan="4"><img src="../images/GK.png" width="40" heigth="40">在线支付:用户已经在线支付过费用</th>
			</tr>
			<tr class="thress_tr">
				<th colspan="4" align="left">
					<span>顾客：刘木森</span>
					<span>电话：13609752254</span>
					<span>地址：仲恺农业工程学院</span>
				</th>
			</tr>
			<tr class="four_tr">
				<th width="50%">菜品</th>
				<th width="25%">单价(元)</th>
				<th width="25%">数量</th>
			</tr>
			<tr>
				<th>套餐1</th>
				<th>12</th>
				<th>1</th>
			</tr>
			<tr align="right">
				<th colspan="4"><span style="color:RGB(70,141,188)">配送费：</span>0元</th>
			</tr>
			<tr  align="right">
				<th colspan="4"><span style="color:RGB(70,141,188)">总价：12元</span></th>
			</tr>
			<tr class="eight_tr" align="right">
				<th colspan="4">
					<input type="button" value="接受退单">
				</th>
			</tr>
		</table>
		<!-- 一张订单的结束 -->
		
		<!-- 分页开始 -->
		<div class="pagination">
			<ul>
				<li class="disablepage"><a href="#">&lt;&lt;上一页</a></li>
				<li>第1页/共1页</li>
				<li class="nextPage"><a href="#">下一页&gt;&gt;</a></li>
			</ul>
		</div><!-- 分页结束 -->
		
	</div>
</body>
</html>