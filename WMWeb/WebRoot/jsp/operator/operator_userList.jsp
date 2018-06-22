<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
<title>用户管理</title>
<link rel="stylesheet" href="../css/operator_userList.css">
<link rel="stylesheet" href="../css/page.css">
</head>
</body>
	<br>
		<form name="Form1" action="findUserByCondition">
			<table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
				<TBODY>
					<tr><td class="ta_01" align="center" style="background-color:rgb(70,141,188)"><strong>查 询 条 件</strong></td></tr>
					<tr><td>
						<table cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr><td height="22" align="center" bgColor="#f5fafe" class="ta_01">用户名称</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text" name="userName" size="15" Class="bg"/></td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">电话号码：</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text" name="userPhone" size="15" Class="bg"/></td>
							</tr>
							<tr><td height="22" align="center" bgColor="#f5fafe" class="ta_01">用户编号</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text" name="userName" size="15" Class="bg"/></td>
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
							<strong>用 户 列 表</strong>
						</TD>
					</tr>
					<tr>
						<td class="ta_01" align="right">
							<a href="${pageContext.request.contextPath}/jsp/operator_userAdd.jsp"><button type="button" id="add" name="add" value="&#28155;&#21152;" class="button_add" onclick="addUser()">添加</button></a>
						</td>
					</tr>
					<tr><td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all" bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR:rgb(70,141,188)">
								<td align="center" width="15%">编号</td>
								<td align="center" width="15%">名称</td>
								<td align="center" width="15%">性别</td>
								<td width="20%" align="center">权限</td>
								<td align="center" width="7%">电话</td>
								<td width="5%" align="center">编辑</td>
								<td width="5%" align="center">查看</td>
								<td width="5%" align="center">删除</td>
							</tr>
							
							<!--用户信息  -->
								<c:forEach items="${pageUser.users }" var="user">
										<tr onmouseover="this.style.backgroundColor = 'white'"
											onmouseout="this.style.backgroundColor = '#F5FAFE';">
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="15%">
												${user.userId}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="15%">
												${user.userName}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												${user.userSex}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="15%">
												${user.powerName}
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="20%">
												${user.userPhone}
											</td>
											<td align="center" style="HEIGHT: 22px">													
												<a href="${pageContext.request.contextPath}/operator/edituserInfo.do?userId=${user.userId }"><img src="${pageContext.request.contextPath}/images/i_edit.gif" border="0" style="CURSOR: hand"></a>
											</td>
											<td align="center" style="HEIGHT: 22px">													
												<a href="${pageContext.request.contextPath}/operator/finduserInfo.do?userId=${user.userId }"><img src="${pageContext.request.contextPath}/images/i_ok.gif" border="0" style="CURSOR: hand"></a>
											</td>
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/operator/deleteuserInfo.do?userId=${user.userId }"><img src="../images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand"></a>
											</td>
										</tr>
								</c:forEach>
								
								
							</table>
						</td>
					</tr>
					
					<tr><td><!-- 分页 -->
						<div class="pagination"><ul>
							<li class="disablepage"><a href="${pageContext.request.contextPath }/operator/pageOfUser.do?currentPage=${pageUser.currentPage-1<1?1:pageUser.currentPage-1}">&lt;&lt;上一页</a></li>
							<li>第${pageUser.currentPage }页/共${pageUser.totalPage }页</li>
							<li class="nextPage"><a href="${pageContext.request.contextPath }/operator/pageOfUser.do?currentPage=${pageUser.currentPage+1>pageUser.totalPage?pageUser.totalPage:pageUser.currentPage+1}">下一页&gt;&gt;</a></li>
						</ul></div>
					</td></tr>
				</TBODY>
			</table>
		</form>		
	</body>
</html>
