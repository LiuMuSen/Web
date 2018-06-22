<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.1:8006/WebImages"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/operator_userList.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/page.css">
<title>运营商|商家审核列表</title>
</head>
<body>
	<br/>
	<form name="Form1" action="findshopByCondition">
			<table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
				<TBODY>
					<tr><td class="ta_01" align="center" style="background-color:rgb(70,141,188)"><strong>查 询 条 件</strong></td></tr>
					<tr><td>
						<table cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01" width="15%">编号:</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text" name="userPhone" size="15" Class="bg"/></td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01" width="15%">申请者姓名:</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text" name="userPhone" size="15" Class="bg"/></td>
							</tr>
							<tr><td height="22" align="center" bgColor="#f5fafe" class="ta_01" width="15%">申请者电话:</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text" name="userName" size="15" Class="bg"/></td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01" width="15%">门店名称:</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text" name="userName" size="15" Class="bg"/></td>
							</tr>
							<tr><td height="22" align="center" bgColor="#f5fafe" class="ta_01" width="15%">是否上传身份证:</td>
								<td class="ta_01" bgColor="#ffffff">
									<input type="radio" name="IsUpIdcard" value="上传"/>上传
									<input type="radio" name="IsUpIdcard" value="没上传"/>没上传
								</td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01" width="15%">是否上传营业资格证:</td>
								<td class="ta_01" bgColor="#ffffff">
									<input type="radio" name="IsUpBLiense" value="上传"/>上传
									<input type="radio" name="IsUpBLiense" value="没上传"/>没上传
								</td>
							</tr>
							<tr><td height="22" align="center" bgColor="#f5fafe" class="ta_01" width="15%">是否上卫生证:</td>
								<td class="ta_01" bgColor="#ffffff">
									<input type="radio" name="IsUpSanitary" value="上传" />上传
									<input type="radio" name="IsUpSanitary" value="没上传"/>没上传
								</td>
							</tr>
							<tr><td width="100" height="22" align="center" bgColor="#f5fafe" class="ta_01"></td>
								<td class="ta_01" bgColor="#ffffff"><font face="宋体" color="red"> &nbsp;</font></td>
								<td align="right" bgColor="#ffffff" class="ta_01"><br><br></td>
								<td align="right" bgColor="#ffffff" class="ta_01"><input type="submit" name="search" value="查询"  class="button_view"/>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="reset" name="reset" value="重置" class="button_view"/></td>
							</tr>
							</table>
					</td></tr>
					
					
					<tr>
						<td class="ta_01" align="center" style="background-color:rgb(70,141,188)">
							<strong>审 核 列 表</strong>
						</TD>
					</tr>
					<tr><td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all" bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR:rgb(70,141,188)">
								<td align="center" width="5%">编号</td>
								<td align="center" width="10%">申请者姓名</td>
								<td align="center" width="10%">申请者电话</td>
								<td align="center" width="10%">门店logon</td>
								<td align="center" width="15%" >门店名称</td>
								<td align="center" width="10%" >门店类型</td>
								<td align="center" width="25%" >门店简介</td>
								<td align="center" width="15%">操作</td>
							</tr>
							
							<!--审核信息  -->
							<c:forEach items="${pageOfApplys.applys }" var="apply">
										<tr onmouseover="this.style.backgroundColor = 'white'"
											onmouseout="this.style.backgroundColor = '#F5FAFE';">
											<td style="CURSOR: hand; HEIGHT: 22px" align="center">
												${apply.applyId}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center">
												${apply.applyRealname}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center">
												${apply.applyPhone}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center">
												<img src="${picPath }${apply.applyShoplogon }" width="50" height="50"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center">
												${apply.applyShopname}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center">
												${apply.type.typeName}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center">
												${apply.applyShopdescription}
											</td>
											<td align="center" style="HEIGHT: 22px">													
												<a style="width:70px;height:30px;line-height:30px;background:RGB(70,144,188);display:block; border:1px solid RGB(70,144,188); border-radius:5px;"  href="${pageContext.request.contextPath}/operator/findApplyById.do?applyId=${apply.applyId}">进行审核</a>
											</td>
										</tr>
								</c:forEach>							
							</table>
						</td>
					</tr>
					
					<tr><td><!-- 分页 -->
						<div class="pagination"><ul>
							<li class="disablepage"><a href="${pageContext.request.contextPath }/operator/pageOfApply.do?currentPage=${pageOfApplys.currentPage-1<1?1:pageOfApplys.currentPage-1}">&lt;&lt;上一页</a></li>
							<li>第${pageOfApplys.currentPage }页/共${pageOfApplys.totalPage }页</li>
							<li class="nextPage"><a href="${pageContext.request.contextPath }/operator/pageOfApply.do?cu
							rrentPage=${pageOfApplys.currentPage+1>pageOfApplys.totalPage?pageOfApplys.totalPage:pageOfApplys.currentPage+1}">下一页&gt;&gt;</a></li>
						</ul></div>
					</td></tr>
				</TBODY>
			</table>
		</form>		
</body>
</html>