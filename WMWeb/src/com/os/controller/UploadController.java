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
		//�����ļ������ƻ�ȡ�ļ�����
		CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
		byte[] fbyte = cm.getBytes();
		
		//�����ļ�����
		String newFileName = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		newFileName = sdf.format(new Date());
		Random r = new Random();
		for(int i =0; i<3; i++){
			newFileName = newFileName+r.nextInt(10);
		}
		
		//��ȡ�ļ���չ��
		String originalFilename = cm.getOriginalFilename();
		//���ļ�������Զ�̷�����
		String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
		
		//����jesy������������ϴ�
		Client client = Client.create();
		WebResource resource = client.resource(commons.PIC_HOST+"/upload/"+newFileName+suffix);
		//�ϴ�
		resource.put(String.class, fbyte);
		
		//ajax����
		String fullPath = commons.PIC_HOST+"/upload/"+newFileName+suffix;
		String relativePath = "/upload/"+newFileName+suffix;
		String result="{\"fullPath\":\""+fullPath+"\",\"relativePath\":\""+relativePath+"\"}";
		out.print(result);
	}
	
}