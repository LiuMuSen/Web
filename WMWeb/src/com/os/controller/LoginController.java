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
 * ���ڵ�¼���ж��Լ��ַ�ת��
 * @author ��ľɭ
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
		
		if(!checkcode.equalsIgnoreCase(scode)){ 	//��֤�����
			return "login1";
		}
		
		User u = iUserService.findUser(user);

		if(u == null){		//��ѯ�޸��û�
			return "login1";
		}
		
		if(u.getPassword().equals(user.getPassword())){	//ƥ������
			request.getSession().setAttribute("userName", u.getUserName());
			//-------oy----------
			request.getSession().setAttribute("userPhone", u.getUserPhone());
			
			request.getSession().setAttribute("user", u);
			if(u.getPowerId()==2){	//�̼�
				return "shop_home";
			}else if(u.getPowerId()==1){ //����Ա
				return "operator/operator_home";
			}else{			//���
				return "forward:/shop/findAllShop.do";
			}
		}else{	//�������
			return "login1";
		}
	
	}
	
	
	//�̼ҵ�¼ע��
	@RequestMapping("checkout.do")
	public String checkout(HttpServletRequest request, HttpServletResponse response) throws IOException{
		request.getSession().invalidate();
		PrintWriter out = response.getWriter();  
        out.println("<html><script>");        
        out.println("window.open ('"+request.getContextPath()+"/index.jsp','_top')");      
        out.println("</script></html>");     
		return null;
	}
	
	//����Ա��¼ע��
	@RequestMapping("checkoutOperator.do")
	public @ResponseBody String checkoutOperator(HttpServletRequest request,@RequestBody String data){
		request.getSession().invalidate();
		return data;
	}
	
	//�˿͵�¼ע��
	@RequestMapping("userCheckOut.do")
	public String userCheckOut(HttpServletRequest request, HttpServletResponse response){
		request.getSession().invalidate();
		return "login1";
	}
}
