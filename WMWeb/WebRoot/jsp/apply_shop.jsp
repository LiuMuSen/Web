<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="../css/apply_shop.css">
<script type="text/javascript" src="../js/apply_shop.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.form.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>申请开店 | 美味速递</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="content">
		<h2>申请开店</h2>
		
		<div  class="form">
			<form id="applyForm" action="${pageContext.request.contextPath }/apply/applyShop.do" method="post">
				<div class="shop_name">
					<div>真实姓名:</div>
					<div><input type="text" class="name" name="applyRealname"></div>
				</div>	
				<div class="shop_phonenumber">
					<div>手机号码:</div>
					<div><input type="text" class="pn" name="applyPhone"></div>
				</div>
				<div>
					<div>分类：</div>
					<div>
						<input type="radio" name="typeName" value="美食">美食
						<input type="radio" name="typeName" value="正餐优选">正餐优选
						<input type="radio" name="typeName" value="超市">超市
						<input type="radio" name="typeName" value="精选小吃">精选小吃
						<input type="radio" name="typeName" value="鲜果购">鲜果购
						<input type="radio" name="typeName" value="下午茶">下午茶
					</div>
				</div>
				<div class="shop_name">
					<div>门店名称:</div>
					<div><input type="text" class="name" name="applyShopname"></div>
				</div>	
				<div class="shop_address">
					<div>门店地址:</div>
					<div><input type="text" class="add" name="applyShopaddress"></div>
				</div>
				<div class="shop_description">
					<div>门店简介:</div>
					<div><input type="text" class="des" name="applyShopdescription"></div>
				</div>
				<div class="IDnumber">
					<div>身份证号码:</div>
					<div><input type="text" class="iIDnumber" name="applyIdcard"></div>
				</div>
				<div class="IDCardphoto">
					<div>身份证照片:</div>
					<p><label></label>
						<img id='IDCardphotoSrc' src='${picPath }${apply.idcardphotopic }'  height="100" width="100" />
						<input type='file' id='imgSize1File1' name='imgSize1File1' class="file" onchange='submitIDUpload()' />
			        	<input type='hidden' id='imgSize1' name='idcardphotopic' value='' reg="^.+$" tip="亲！您忘记上传图片了。" />
					</p>
				</div>
				<div class="business_liense">
					<div>营业执照照片:</div>
						<p><label></label>
						<img id='businessSrc' src='${picPath }${apply.businesspic }'  height="100" width="100" />
						<input type='file' id='imgSize1File2' name='imgSize1File2' class="file" onchange='submitBussUpload()' />
			        	<input type='hidden' id='imgSize2' name='businesspic' value='' reg="^.+$" tip="亲！您忘记上传图片了。" />
					</p>
				</div>
				<div class="business_liense">
					<div>卫生证照片:</div>
						<p><label></label>
						<img id='sanitarySrc' src='${picPath }${apply.sanitarypic }'  height="100" width="100" />
						<input type='file' id='imgSize1File3' name='imgSize1File3' class="file" onchange='submitSanitaryUpload()' />
			        	<input type='hidden' id='imgSize3' name='sanitarypic' value='' reg="^.+$" tip="亲！您忘记上传图片了。" />
					</p>
				</div>
				<div class="business_liense">
					<div>门店logon:</div>
						<p><label></label>
						<img id='applyShoplogonSrc' src='${picPath }${apply.applyShoplogon }'  height="100" width="100" />
						<input type='file' id='imgSize1File4' name='imgSize1File4' class="file" onchange='submitLogonUpload()' />
			        	<input type='hidden' id='imgSize4' name='applyShoplogon' value='' reg="^.+$" tip="亲！您忘记上传图片了。" />
					</p>
				</div>
				<div>
					<input type="submit" value="提交" class="submit">
				</div>			
			</form>
		</div>
	</div>
	<%@include file="foot.jsp" %>
</body>
</html>