package com.os.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.os.untils.commons;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@RequestMapping("uploadPic")
	public void uploadPic(HttpServletRequest request, String fileName, PrintWriter out){
		MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
		//根据文件的名称获取文件对象
		CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
		byte[] fbyte = cm.getBytes();
		
		//设置文件名称
		String newFileName = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		newFileName = sdf.format(new Date());
		Random r = new Random();
		for(int i =0; i<3; i++){
			newFileName = newFileName+r.nextInt(10);
		}
		
		//获取文件扩展名
		String originalFilename = cm.getOriginalFilename();
		//把文件关联到远程服务器
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		
		//建设jesy服务器，跨服上传
		Client client = Client.create();
		WebResource resource = client.resource(commons.PIC_HOST+"/upload/"+newFileName+suffix);
		//上传
		resource.put(String.class, fbyte);
		
		//ajax回显
		String fullPath = commons.PIC_HOST+"/upload/"+newFileName+suffix;
		String relativePath = "/upload/"+newFileName+suffix;
		String result="{\"fullPath\":\""+fullPath+"\",\"relativePath\":\""+relativePath+"\"}";
		out.print(result);
	}
	
}