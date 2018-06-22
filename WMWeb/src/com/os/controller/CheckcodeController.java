package com.os.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.dsna.util.images.ValidateCode;

/**
 * 用于验证码的生成
 * @author 刘木森
 *
 */

@Controller
public class CheckcodeController {
	
	@RequestMapping("checkCode")
	public void getCheckCode(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException{
		ValidateCode vc = new ValidateCode(80,30,4,5);
		request.getSession().setAttribute("scode", vc.getCode().toString());
		vc.write(response.getOutputStream());
	}
}
