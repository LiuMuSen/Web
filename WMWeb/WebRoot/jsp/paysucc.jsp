<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/paysucc.css">
<title>支付成功 | 美味速递</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class = "content">
		<h1>支付成功</h1>
	</div>
	<%
		request.getSession().removeAttribute("cart");
		response.setHeader("Refresh","5;url=/WMWeb/user/findAllOrderByUserId.do"); 
	%>
	
	<%@include file="foot.jsp" %>
</body>
</html>