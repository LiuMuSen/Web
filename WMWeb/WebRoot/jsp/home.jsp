<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/home.css"/>
<title>美味速递</title>
</head>
<body>
	<div id="header" >
		<div id="nav_top">
			<div id="topnav-wrap">
				<div id="current-address"><span>位于：仲恺农业工程学院|</span><a href="" id="change_address" style="color:RGB(255,198,67)">切换地址</a></div>
				<div id="nav_login"><a href="">登录</a>/<a href="">注册</a></div>	
			</div>
		</div>	
		<div id="nav_middle">
			<div id="middlenav-wrap">
				<div id="logon"><h1><a hrf="#">美味速递</a></h1></div>
				<div id="desire"><a>首页</a><a>我的订单</a></div>
				<div id="search"><input type="text" name="search_content"><button>搜索</button></div>
			</div>
		</div>	
	</div>
	
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
				<div class="shop_td">
					<div class="shop">
						<p><a href="#"><img src="../images/MDL.jpg" width="230px" height="150px"border="0" /> </a></p>
					</div>
					<div class="shop">
						<a href="#">广州麦当劳百利华庭餐厅</a><br/>
						<span>起送费：￥0</span><span>配送费：￥9</span>
					</div>
				</div>
				
			</div>
			
			<div style="clear:both;"></div>
			<div class="pagination">
				<ul>
					<li class="disablepage"><a href="#">&lt;&lt;上一页</a></li>
					<li>第1页/共20页</li>
					<li class="nextPage"><a href="#">下一页&gt;&gt;</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<div id="footer">
	</div>
</body>
</html>