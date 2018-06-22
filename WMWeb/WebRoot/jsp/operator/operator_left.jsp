<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../../js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="../../js/main.js"></script>
<link rel="stylesheet" href="../../css/operator_left.css">
</head>
<body>
	<div>
		<ul class="ce">
			  <li> 
			       <a href="${pageContext.request.contextPath }/operator/pageOfUser.do" target="mainFrame">用户管理</a>
			  </li>
			  <li> 
			       <a href="#">商家管理<img class="more" src="../../images/more.png"/></a>
			       <ul class="er">
			    	    <li><a  href="${pageContext.request.contextPath }/operator/pageOfshop.do" target="mainFrame">商家列表</a></li>
						<li><a  href="${pageContext.request.contextPath }/operator/pageOfApply.do" target="mainFrame">商家审核</a></li>
				   </ul>
			  </li>
			  <li> 
			       <a href="#">个人管理<img class="more" src="../../images/more.png"/></a>
			       <ul class="er">
						<li><a  href="operator_changePWD.jsp" target="mainFrame">修改密码</a></li>
				   </ul>
			  </li>
		</ul>
	</div>
	
</body>
</html>