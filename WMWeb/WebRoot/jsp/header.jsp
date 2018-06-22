<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" href="../css/header_and_foot.css"/>
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=ACXO181HLICt5kvY2GBgHG8PbI3qL54A"></script>
</head>
<body>
	<div id="header" >
		<div id="nav_top">
			<div id="topnav-wrap">
				<div id="current-address"><span>位于：<span id="adressName"></span> | </span><a href="" id="change_address" style="color:RGB(255,198,67)">切换地址</a><a class="applyshop" href="${pageContext.request.contextPath }/jsp/apply_shop.jsp"> |  申请开店</a></div>
				<div id="nav_login">
				<% 
					String userPhone = (String) session.getAttribute("userPhone");
					String userName = (String) session.getAttribute("userName");
					if(userName == null){
						userName="sadas1213131";
					}
				%>
				<% 
					if( userPhone == null) {
						out.print("<a href=\"../jsp/login1.jsp\">登录</a>/<a href=\"../jsp/register.jsp\">注册</a>");
					}else{
						out.print(userName);
						out.print(" / <a href=\"../jsp/myinfo.jsp\">个人中心</a>");
						out.print(" / <a href=\"../login/userCheckOut.do\">退出</a>");
					}
				%>
					
				</div>	
			</div>
		</div>	
		<div id="nav_middle">
			<div id="middlenav-wrap">
				<div id="logon"><h1><a href="/WMWeb/">美味速递</a></h1></div>
				<div id="desire"><a href="/WMWeb/">首页</a><a href="${pageContext.request.contextPath }/user/findAllOrderByUserId.do">我的订单</a></div>
				<div id="search"><input type="text" name="search_content"><button>搜索</button></div>
			</div>
		</div>	
	</div>
</body>
</html>
<script type="text/javascript">
	// 百度地图API功能
	//var map = new BMap.Map("allmap");
	var point = new BMap.Point(113.307649,23.1200491);
	
	//初始化经纬度
	var lng = 113.307649;
	var lat = 23.1200491;
	//map.centerAndZoom(point,12);

	var geolocation = new BMap.Geolocation();
	geolocation.getCurrentPosition(function(r){
		if(this.getStatus() == BMAP_STATUS_SUCCESS){
			var mk = new BMap.Marker(r.point);
			map.addOverlay(mk);
			map.panTo(r.point);
			lnglat = [r.point.lng,r.point.lat];
			//alert('您的位置：'+r.point.lng+','+r.point.lat);
			lng=r.point.lng;
			lat=r.point.lat;
		}
		else {
			alert('failed'+this.getStatus());
		}        
	},{enableHighAccuracy: true})
	
	$.ajax({
		url:"http://api.map.baidu.com/geocoder/v2/?location="+lat+","+lng 
    	+ "&output=json&ak=ACXO181HLICt5kvY2GBgHG8PbI3qL54A",
		type:"get",
		dataType:'jsonp',
		crossDomain: true,
		//data:data,
		success:function(data){
			$("#adressName").html(data.result.formatted_address);
		},
		error:function(){
			
		}
	});
	
	
	//关于状态码
	//BMAP_STATUS_SUCCESS	检索成功。对应数值“0”。
	//BMAP_STATUS_CITY_LIST	城市列表。对应数值“1”。
	//BMAP_STATUS_UNKNOWN_LOCATION	位置结果未知。对应数值“2”。
	//BMAP_STATUS_UNKNOWN_ROUTE	导航结果未知。对应数值“3”。
	//BMAP_STATUS_INVALID_KEY	非法密钥。对应数值“4”。
	//BMAP_STATUS_INVALID_REQUEST	非法请求。对应数值“5”。
	//BMAP_STATUS_PERMISSION_DENIED	没有权限。对应数值“6”。(自 1.1 新增)
	//BMAP_STATUS_SERVICE_UNAVAILABLE	服务不可用。对应数值“7”。(自 1.1 新增)
	//BMAP_STATUS_TIMEOUT	超时。对应数值“8”。(自 1.1 新增)
</script>