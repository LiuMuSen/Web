$(document).ready(function(){
		$.ajax({
			type:"get",
			url:"http://localhost:8080/WMWeb/operator/pageOfUser.do",
			contentType:'application/json;charset=utf-8',
			success:function(data){
				var str="";
				$.each(data,function(idx,val){
					str+="<tr>"
					+"<td style='CURSOR: hand; HEIGHT: 22px' align='center' width='15%'>"+val.userId
					+"</td><td style='CURSOR: hand; HEIGHT: 22px' align='center'width='15%'>"+val.userName
					+"</td><td style='CURSOR: hand; HEIGHT: 22px' align='center' width='5%'>"+val.userSex
					+"</td><td style='CURSOR: hand; HEIGHT: 22px' align='center' width='15%'>"+val.powerName
					+"</td><td style='CURSOR: hand; HEIGHT: 22px' align='center' width='20%'>"+val.userPhone
					+"</td><td align='center' style='HEIGHT: 22px'><a href='editUserInfo.jsp?userId='"+val.userId
					+"'><img src='/WMWeb/images/i_edit.gif' border='0' style='CURSOR:hand'/></a>"
					+"</td><td align='center' style='HEIGHT: 22px'><a href='findUserInfo.jsp?userId='"+val.userId
					+"'><img src='/WMWeb/images/i_ok.gif' border='0' style='CURSOR: hand'/></a>"
					+"</td><td align='center' style='HEIGHT: 22px'><a href='deleteUserInfo.jsp?userId='"+val.userId
					+"'><img src='/WMWeb/images/i_del.gif' border='0' style='CURSOR: hand'/></a></td><tr>";
				});
				$('#DataGrid1').append(str);
			},
	});
		
		
})
 




























