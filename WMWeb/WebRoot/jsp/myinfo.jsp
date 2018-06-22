<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/myinfo.css">
<title>我的信息</title>
<script type="text/javascript">
	function jumpEditMyinfo(){
		window.location.href= "/WMWeb/jsp/edit_myinfo.jsp";
	}
	function jumpManaAdd(){
		window.location.href= "/WMWeb/jsp/mana_myadd.jsp";
	}
</script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="content">
		<div class="welcome">
			<div>
				<span class="w">欢迎,
					<%=session.getAttribute("userName") %>
				</span>
			</div>
		</div>
		<div class="two">
			<div class="editinfo">
				<input type="button" value="修改个人信息" onclick="jumpEditMyinfo()">
			</div>
			<div class="madd">
				<form action="${pageContext.request.contextPath }/user/FindAddressByUserId.do">
					<input type="submit" value="收货地址管理">
				</form>
			</div>
		</div>
	</div>
	<%@include file="foot.jsp" %>
</body>
</html>