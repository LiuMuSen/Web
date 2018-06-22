package com.os.controller;
/**
 * зЂВс
 * @author oy
 */
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.User;
import com.os.service.IUserService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Resource
	private IUserService iUserService;
	
	//зЂВс
	@RequestMapping("Register")
	public String Register(HttpServletRequest request, User user) {
		String phone = request.getParameter("userPhone");
		String pw = request.getParameter("password");
		
		user.setUserPhone(phone);
		user.setPassword(pw);
		user.setPowerId(3);
		
		iUserService.register(user);
		return "login1";
	}
}
