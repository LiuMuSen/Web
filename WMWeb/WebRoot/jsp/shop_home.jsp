<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<frameset rows="100,*" frameborder=0 border="0" framespacing="0">
		  <frame src="${pageContext.request.contextPath}/jsp/shop_top.jsp" name="topFrame" scrolling="NO" style="border-bottom:1px solid RGB(119,119,119)" noresize >
		  <frameset cols="300,*" frameborder="0" border="0" framespacing="0">
				<frame src="${pageContext.request.contextPath}/jsp/shop_left.jsp" name="leftFrame" noresize scrolling="YES">
				<frame src="${pageContext.request.contextPath}/jsp/shop_welcome.jsp" name="mainFrame"  style="border-left:1px solid RGB(119,119,119)">
		  </frameset>
	</frameset>
</html>