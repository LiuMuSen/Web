package com.os.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.Address;
import com.os.domain.Order;
import com.os.domain.User;
import com.os.service.IOrderService;
import com.os.service.IShopInfoService;
import com.os.service.IUserService;
import com.os.service.impl.UserServiceImpl;
/**
 * UserController
 * �޸ĸ�����Ϣ
 * ����ջ���ַ
 * ��ѯ��ַ
 * ��ѯ����
 * @author oy
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService iUserService;
	@Resource
	private IOrderService IOrderService;
	@Resource
	private IShopInfoService IShopInfoService;
	
	/**
	 * �޸ĸ�����Ϣ
	 * @param request
	 * @param user
	 * @return
	 * @author oy
	 */
	@RequestMapping("EditMyinfo")
	public String edit(HttpServletRequest request, User user) {
		User u = (User) request.getSession().getAttribute("user");
		u.setUserName(user.getUserName());
		u.setUserSex(user.getUserSex());
		iUserService.edit(u);
		//��session�����userName�ĳ��µ�userName
		request.getSession().setAttribute("userName", user.getUserName());
		return "edit_myinfo";
	}
	/**
	 * 
	 * ��ӵ�ַ
	 * @param request
	 * @param adress
	 * @return
	 * @author oy
	 */
	@RequestMapping("AddAddress")
	public String addAddress(HttpServletRequest request,Address adress) {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		adress.setUserId(u.getUserId());
		iUserService.addAddress(adress);
		return "myinfo";
	}
	
	/**
	 * ����UserId�ҵ����û����е�ַ
	 * @param request
	 * @param model
	 * @return
	 * @author oy
	 */
	@RequestMapping("FindAddressByUserId")
	public String findAddressByUserId(HttpServletRequest request,Model model) {
		User u = (User) request.getSession().getAttribute("user");
		int userId = u.getUserId(); 
		List<Address> list = iUserService.findAddressByUserId(userId);
		model.addAttribute("addressList", list);
		return "mana_myadd";
	}
	
	/**
	 * ����UserId�ҵ����û����ж���
	 * @param request
	 * @param model
	 * @return
	 * @author oy
	 */
	@RequestMapping("findAllOrderByUserId")
	public String findALLOrderByUserId(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		User t = iUserService.findUserAllOrder(user.getUserId());
		model.addAttribute("user", t);
		return "myorder";
	}
	
	/**
	 * ȷ���ջ�
	 * @param request
	 * @param order
	 * @return
	 * @author oy
	 */
	@RequestMapping("confirm")
	public String dealOrderTo2(HttpServletRequest request,Order order) {
		String oid =  request.getParameter("orderId");
		int id = java.lang.Integer.parseInt(oid);
		IShopInfoService.dealOrder(id);
		return "redirect:findAllOrderByUserId.do";
	}
	
	/**
	 * �ύ����
	 * @param request
	 * @return
	 * @author oy
	 */
	@RequestMapping("pingjia")
	public void pingjia(HttpServletRequest request) {
		String sId = request.getParameter("orderId");
		Integer orderId = java.lang.Integer.parseInt(sId);
		String content = request.getParameter("content");
		Order temp = new Order();
		temp.setOrderId(orderId);
		temp.setOrderAssess(content);
		IOrderService.updateOrderAssessById(temp);
	}
	
	/**
	 * �û��޸�����
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * @throws IOException
	 * @author oy
	 */
	@RequestMapping("modifyPwd")
	public String changPWD(HttpServletRequest request, HttpServletResponse response,Model model) throws IOException {
		String userPassword = request.getParameter("userPassword");
		String newPassword = request.getParameter("newPassword");
		String rePassword = request.getParameter("rePassword");
		if(userPassword.equals(newPassword)){
			model.addAttribute("mes", "ԭ���벻������������ͬ");
			return "shopInfo_changePWD";
		}
		User u = iUserService.findUser((User) request.getSession().getAttribute("user"));
		//ԭ���벻ƥ��
		if(!u.getPassword().equals(userPassword)){	
			model.addAttribute("mes", "�����������");
			return "myinfo_changepw";
		}
		//�������ظ����벻ƥ��
		if(newPassword.equals("")){	
			model.addAttribute("mes1", "�����벻��Ϊ��");
			return "myinfo_changepw";
		}
		//�������ظ����벻ƥ��
		if(!newPassword.equals(rePassword)){	
			model.addAttribute("mes1", "�������ظ�����");
			return "myinfo_changepw";
		}
		u.setPassword(newPassword);
		iUserService.changePWD(u);
		request.getSession().invalidate();
		//������¼ҳ��
		PrintWriter out = response.getWriter();  
        out.println("<html><script>");        
        out.println("window.open ('"+request.getContextPath()+"/jsp/login1.jsp','_top')");      
        out.println("</script></html>");    
        return null;  
		
	}
}
