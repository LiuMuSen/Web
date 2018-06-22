<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>运营商|美味速递</title>
</head>
	<frameset rows="100,*" frameborder="0" border="0" framespacing="0">
		  <frame src="${pageContext.request.contextPath}/jsp/operator/operator_top.jsp" name="topFrame" scrolling="NO" noresize >
		  <frameset cols="300,*" frameborder="0" border="0" framespacing="0">
				<frame src="${pageContext.request.contextPath}/jsp/operator/operator_left.jsp" name="leftFrame" noresize scrolling="YES">
				<frame src="${pageContext.request.contextPath}/jsp/operator/operator_welcome.jsp" name="mainFrame">
		  </frameset>
	</frameset>
</html>