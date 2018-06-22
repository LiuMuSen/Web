<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/buycar.css"/>
<title>购物车</title>
</head>
<body>
	<div id="header">
		<div id="nav_top">
			<div id="topnav-wrap">
				<div id="current-address">
					<span>位于：仲恺农业工程学院|</span><a href="" id="change_address"
						style="color: RGB(255, 198, 67)">切换地址</a>
				</div>
				<div id="nav_login">
					<a href="">登录</a>/<a href="">注册</a>
				</div>
			</div>
		</div>
		<div id="nav_middle">
			<div id="middlenav-wrap">
				<div id="logon">
					<h1>
						<a hrf="#">美味速递</a>
					</h1>
				</div>
				<div id="desire">
					<a>首页</a><a>我的订单</a>
				</div>
				<div id="search">
					<input type="text" name="search_content">
					<button>搜索</button>
				</div>
			</div>
		</div>
	</div>
	
	<div class="content">
		<div class="tablehead">
			<ul class="cartop">
				<li class="list_chk"><input type="checkbox">全选</li>
				<li class="list_info">商品信息</li>
				<li class="list_num">数量</li>
				<li class="list_sum">小计</li>
				<li class="list_op">操作</li>
			</ul>
			
		</div>
		<div class="product">
			<div class="shopinfo">
				<div class="all_check"><input type="checkbox" id="shop_a" class="shopchoice"></div>
				<div class="shop_name">店铺：<a href="#">麦当劳</a></div>
			</div>
			<div class="order_content">
				<ul class="order_list">
					<li class="list_check"><input type="checkbox" id="checkbox_2" class="son_check"><label for="checkbox_2" class=""></label></li>
					<li class="list_info">
						<div class="list_img"><a href="#"><img src="../images/food1.jpg"></a></div>
						<div class="list_text"><a href="#">套餐一号</a></div>
					</li>
					<li class="list_num">
						<div><a class="reduce">-</a><input type="text" value="1" class="num"><a class="+">+</a></div>
					</li>
					<li class="list_price">
						<p class="price">￥10</p>
					</li>
					<li class="list_op">
						<p class="del"><a href="#">移除</a></p>
					</li>
				</ul>
			
			</div>
		</div>
		<div class="carfoot">
			<div class="right">
				<span>已选商品
					<span class="sum_num">0</span>
					件
				</span>
				<span>合计 (不含运费): </span>
				<span class="sum_price">￥0.00</span>
				<button class="createOrder">结  算</button>
			</div>
		</div>
		
	</div>
	
	
	<div id="footer">
		<div id="footer-wrap">
			<div class="column">
				<ul>
					<li><a><span>开店申请</span></a></li>
					<li><a><span>配送加盟</span></a></li>
					<li><a><span>城市代理</span></a></li>
					<li><a><span>零售加盟</span></a></li>
				</ul>
			</div>
			<div class="column"><ul>
					<li><a><span>开放平台</span></a></li>
					<li><a><span>关于美团</span></a></li>
					<li><a><span>媒体报道</span></a></li>
					<li><a><span>平台制度</span></a></li>
				</ul></div>
			<div class="column">
				<ul>
					<li><a><span>常见问题</span></a></li>
					<li><a><span>用户反馈</span></a></li>
					<li><a><span>诚信举报</span></a></li>
					<li><a><span>加入我们</span></a></li>
				</ul>
			</div>
			<div class="column detail">
				<p><h2>电话号码<span>1234-5678</span></h2></p>
				<p><span>周一至周日 9:00-23:00</span><br/></p>
				<p><span>客服不受理商务合作</span><br/></p>
			</div>
		</div>
	</div>
</body>
</html>