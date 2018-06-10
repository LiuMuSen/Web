<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="../js/main.js"></script>
<link rel="stylesheet" href="../css/shop_left.css">
<style>
	body{
		background:RGB(30,40,44);
	}
	.divStyle{
		witdh:100%; 
		height:50px; 
		border:1px solid white; 
		border-radius:5px;
		margin-top:20px;
	}
	.divStyle a{
		text-decoration:none;
		line-height:50px;
	}
	
	.divStyle a span{
		font-size:30px;
		margin-left:25%;
	}
	
	.divStyle:hover{
		background:gray;
	}
</style>
</head>
<body>
	<div>
		<ul class="ce">
			  <li> 
			       <a href="fooditems.jsp" target="mainFrame">商家首页</a>
			  </li>
			  <li> 
			       <a href="#">订单管理<img class="more" src="../images/more.png"/></a>
			       <ul class="er">
						<li><a  href="order_new.jsp" target="mainFrame">今日订单</a></li>
						<li><a  href="order_back.jsp" target="mainFrame">退单处理</a></li>
						<li><a  href="order_history.jsp" target="mainFrame">历史订单</a></li>
				   </ul>
			  </li>
			  <li> 
			       <a href="#">菜品信息<img class="more" src="../images/more.png"/></a>
			       <ul class="er">
						<li><a  href="food_all.jsp" target="mainFrame">所有菜品</a></li>
						<li><a  href="##">增加菜品</a></li>
				   </ul>
			  </li>
			  <li> 
			       <a href="#">商家信息<img class="more" src="../images/more.png"/></a>
			       <ul class="er">
						<li><a  href="test.jsp" target="mainFrame">查看信息</a></li>
						<li><a  href="##">修改信息</a></li>
				   </ul>
			  </li>
			  <li> 
			       <a href="#">数据统计<img class="more" src="../images/more.png"/></a>
			       <ul class="er">
						<li><a  href="test.jsp" target="mainFrame">已收资金</a></li>
						<li><a  href="##">菜式售出数量</a></li>
						<li><a  href="##">用户性别比例</a></li>
				   </ul>
			  </li>
		</ul>
	</div>
	
</body>
</html>