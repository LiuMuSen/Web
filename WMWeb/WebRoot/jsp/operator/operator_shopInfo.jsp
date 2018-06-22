<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.btn_check{
		width:80px;
		height:30px;
		line-height:30px;
		background:RGB(70,144,188);
		border:1px solid RGB(70,144,188); 
		border-radius:5px;
		cursor: pointer; 
		font-weight: bolder;
		display:block;
		float:right;
		margin-right:5px;
	}
	.a_check{
		text-decoration: none;
		font-size:13px;
		color:black;
	}
	
	.a_check span{
		padding-right:10px;
	}
</style>
</head>
<body>
		<form  action="#" method="post">
		<table cellSpacing="1" cellPadding="5" width="980px" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3;" border="0">
			<tr>
				<td class="ta_01" align="center" style="background-color:rgb(70,141,188)" colSpan="4"
					height="50">
					<strong><STRONG>审核信息</STRONG>
					</strong>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01" height="30">
						编号：
					</td>
					<td class="ta_01" bgColor="#ffffff" width="30%">
						${apply.applyId }
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" width="18%" height="30">
						申请者姓名:
					</td>
					<td class="ta_01" bgColor="#ffffff"  width="30%">
						${apply.applyRealname}
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						申请者电话:
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${apply.applyPhone}
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" width="18%" height="30">
						身份证号
					</td>
					<td class="ta_01" bgColor="#ffffff"  width="30%">
						${apply.applyIdcard}
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						身份证照片::
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<img src="${picPath }${apply.idcardphotopic}" width="400" height="250"/>
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						门店Logon:
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<img src="${picPath }${apply.applyShoplogon}" width="150" height="100"/>
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						门店名称:
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${apply.applyShopname}
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						门店类型:
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${apply.type.typeName}
					</td>
				</tr>
					<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						门店地址:
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${apply.applyShopaddress}
					</td>
				</tr>
					<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						门店简介:
					</td>
					<td class="ta_01" bgColor="#ffffff">
						${apply.applyShopdescription}
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						营业执照照片:
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<img src="${picPath }${apply.businesspic}" width="400" height="250"/>
					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01" height="30">
						卫生证照片:
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<img src="${picPath }${apply.sanitarypic}" width="400" height="250"/>
					</td>
				</tr>
				<tr>
					<td class="ta_01" style="WIDTH: 100%" align="right" bgColor="#f5fafe" colSpan="4">	
						<a class="btn_check a_check"  href="${pageContext.request.contextPath}/operator/failApply.do?applyId=${apply.applyId }"><span>审核不通过</span></a>
						<a class="btn_check a_check"  href="${pageContext.request.contextPath}/operator/passApply.do?applyId=${apply.applyId }&userId=${apply.userId}"><span>审核通过</span></a>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>