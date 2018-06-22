<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.form.js"></script>
<link  rel="stylesheet" href="../css/food_add.css"/>
<title>增加菜品</title>

<script type="text/javascript">
function submitImgSize1Upload(){	
	var option={
			type:'POST',
			url:'${pageContext.request.contextPath }/upload/uploadPic.do',
			dataType:'text',
			data:{
				fileName : 'imgSize1File'
			},
			success:function(data){
				//把json格式的字符串转换成json对象
				var jsonObj = $.parseJSON(data);
				//返回服务器图片路径，把图片路径设置给img标签
				$("#imgSize1ImgSrc").attr("src",jsonObj.fullPath);
				//数据库保存相对路径
				$("#imgSize1").val(jsonObj.relativePath);
			}
		};
	$("#itemsForm").ajaxSubmit(option);
}
</script>

</head>
<body>
	<form id="itemsForm" action="${pageContext.request.contextPath }/items/insertItem.do" method="post">
		<table width="100%" border=0 cellspacing="1" cellpadding="1">
		<tr>
			<td width="10%">菜品名称:</td>
			<td><input type="text" name="itemsName"/></td>
		</tr>
		<tr>
			<td width="10%">菜品价格:</td>
			<td><input type="text" name="itemsPrice"/></td>
		</tr>
		<tr>
			<td width="10%">菜品图片:</td>
			<td>
				<p>
				<img id='imgSize1ImgSrc' src='${picPath }${item.itemsImagespic }'  height="100" width="100" />
				<input type='file' id='imgSize1File' name='imgSize1File' class="file" onchange='submitImgSize1Upload()'/>
		        <input type='hidden' id='imgSize1' name='itemsImagespic' value='' reg="^.+$" tip="亲！您忘记上传图片了。" />
				</p>
		 
			</td>
		</tr>
		<tr>
			<td width="10%">菜品简介:</td>
			<td><textarea rows="9" cols="100" name="itemsContent" id="items_content"></textarea></td>
		</tr>
		<tr>
			<td  colspan="2" align="center"><input type="submit" value="提交"/></td>
		</tr>
		</table>
	</form>
</body>
</html>