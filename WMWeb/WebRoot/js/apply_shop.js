function submitIDUpload(){	
	var option={
			type:'POST',
			url:'/WMWeb/upload/uploadPic.do',
			dataType:'text',
			data:{
				fileName : 'imgSize1File1'
			},
			success:function(data){
				var jsonObj = $.parseJSON(data);
				$("#IDCardphotoSrc").attr("src",jsonObj.fullPath);
				$("#imgSize1").val(jsonObj.relativePath);
			}
		};
	$("#applyForm").ajaxSubmit(option);
}


function submitBussUpload(){	
	var option={
			type:'POST',
			url:'/WMWeb/upload/uploadPic.do',
			dataType:'text',
			data:{
				fileName : 'imgSize1File2'
			},
			success:function(data){
				var jsonObj = $.parseJSON(data);
				$("#businessSrc").attr("src",jsonObj.fullPath);
				$("#imgSize2").val(jsonObj.relativePath);
			}
		};
	$("#applyForm").ajaxSubmit(option);
}


function submitSanitaryUpload(){	
	var option={
			type:'POST',
			url:'/WMWeb/upload/uploadPic.do',
			dataType:'text',
			data:{
				fileName : 'imgSize1File3'
			},
			success:function(data){
				var jsonObj = $.parseJSON(data);
				$("#sanitarySrc").attr("src",jsonObj.fullPath);
				$("#imgSize3").val(jsonObj.relativePath);
			}
		};
	$("#applyForm").ajaxSubmit(option);
}

function submitLogonUpload(){	
	var option={
			type:'POST',
			url:'/WMWeb/upload/uploadPic.do',
			dataType:'text',
			data:{
				fileName : 'imgSize1File4'
			},
			success:function(data){
				var jsonObj = $.parseJSON(data);
				$("#applyShoplogonSrc").attr("src",jsonObj.fullPath);
				$("#imgSize4").val(jsonObj.relativePath);
			}
		};
	$("#applyForm").ajaxSubmit(option);
}

























