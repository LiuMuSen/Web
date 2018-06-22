<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/mana_myadd.css">
<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
<script>
	$(document).ready(function(){
		
		$(".add").click(function(){
			if($(".addAddress_box").css("display")=="none"){
				$(".addAddress_box").show();
			}else{
				$(".addAddress_box").hide();
			}
		});
	})
</script>
<title>我的地址</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<div class="content">
		<div class="mt">
			<button class="add">新增收货地址</button>
			
			<div class="address_box">
				<div class="boxc">
					<c:forEach items="${addressList }" var = "a">
							
							<div><span class="item">地址:</span><div class="address">${a.addressContent }</div></div>
							<div><input type="submit" value="编辑" class="edit"></div>
					</c:forEach>
					<!-- <div><span class="item">收货人：</span><div class="name">XXX</div></div> -->
					<!-- <div><span class="item">地址:</span><div class="address">仲恺农业工程学院</div></div> -->
					<!-- <div><span class="item">手机:</span><div class="phonenumber">13609752253</div></div> -->
<!-- 					<div><input type="submit" value="编辑" class="edit"></div> -->
				</div>
			</div>
			
			
			<div class="addAddress_box" >
				<div class ="boxc">
				<form action="${pageContext.request.contextPath }/user/AddAddress.do" method="post">
						<h3>添加新地址</h3>
						<input type="hidden" name="userId" value="${addressList[0].userId }">
						<div class="newAddress"><span class="item">地址:</span><div><input type="text" name="addressContent"></div></div>
						<div><input type="submit" value="添加" class="edit"></div>
					</form>
				</div>
			</div>
			
		</div>
	</div>
	<%@include file="foot.jsp"%>
</body>
</html>