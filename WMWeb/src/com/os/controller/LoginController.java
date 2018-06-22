package com.os.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.os.domain.User;
import com.os.service.IUserService;

/**
 * 用于登录的判断以及分发转向
 * @author 刘木森
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Resource
	private IUserService iUserService;
	
	@RequestMapping("LoginMWSD.do")
	public String LoginMWSD(HttpServletRequest request, Model model , User user){
		String checkcode = request.getParameter("check");
		String scode = (String) request.getSession().getAttribute("scode");
		
		if(!checkcode.equalsIgnoreCase(scode)){ 	//验证码错误
			return "login1";
		}
		
		User u = iUserService.findUser(user);

		if(u == null){		//查询无该用户
			return "login1";
		}
		
		if(u.getPassword().equals(user.getPassword())){	//匹配密码
			request.getSession().setAttribute("userName", u.getUserName());
			//-------oy----------
			request.getSession().setAttribute("userPhone", u.getUserPhone());
			
			request.getSession().setAttribute("user", u);
			if(u.getPowerId()==2){	//商家
				return "shop_home";
			}else if(u.getPowerId()==1){ //管理员
				return "operator/operator_home";
			}else{			//买家
				return "forward:/shop/findAllShop.do";
			}
		}else{	//密码错误
			return "login1";
		}
	
	}
	
	
	//商家登录注销
	@RequestMapping("checkout.do")
	public String checkout(HttpServletRequest request, HttpServletResponse response) throws IOException{
		request.getSession().invalidate();
		PrintWriter out = response.getWriter();  
        out.println("<html><script>");        
        out.println("window.open ('"+request.getContextPath()+"/index.jsp','_top')");      
        out.println("</script></html>");     
		return null;
	}
	
	//管理员登录注销
	@RequestMapping("checkoutOperator.do")
	public @ResponseBody String checkoutOperator(HttpServletRequest request,@RequestBody String data){
		request.getSession().invalidate();
		return data;
	}
	
	//顾客登录注销
	@RequestMapping("userCheckOut.do")
	public String userCheckOut(HttpServletRequest request, HttpServletResponse response){
		request.getSession().invalidate();
		return "login1";
	}
}
