<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function checkout(){
		if(confirm("对于退出，你是认真的吗？？？")){
			location.href="${pageContext.request.contextPath }/login/checkout.do";
		}
	}
</script>
<title>退出</title>
	<style>
			body{
				width:100%;
				height:100%;
				background:RGB(70,141,188);
				border-radius: 3px;
			}
			.navbar-brand{
				width:500px;
				font-size:50px;
				line-height: 50px;
				float:left;
			}
			.shopInfo{
				float:right;
				margin-right:20px;
			}
			.imga img{
				width:50px;
				height:50px;
				border:1px solid white;
				border-radius:50px;
			}
			.spanName{
				color:white;
			}
			.btn button{
				width:50px;
				height:30px;
				float: right;
				margin-top:35px;
				margin-right:20px;
				cursor: pointer;
				border:1px solid white;
				border-radius:5px;
			}
			.btn button:hover{
				background:blue;
			}
	</style>
</head>
<body>
	<h1 class="navbar-brand" style="color:white;">美味速递<span>商家版</span></h1>
	<div class="btn"><button onclick="checkout()">退出</button></div>
	<div class="shopInfo">
		<div class="imga"><img src="images/shopImage.jpg" /></div>
		<div class="spanName"><span style="color:white;"><%=session.getAttribute("userName")%></span></div>
	</div>
</body>
</html>