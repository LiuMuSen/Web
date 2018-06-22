package com.os.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.Address;
import com.os.domain.Order;
import com.os.domain.User;
import com.os.service.IOrderService;
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
		System.out.println(adress.getAddressContent()+"..."+adress.getUserId());
		
		/*
		//��ȡ����
		String newAddress = request.getParameter("newAddress");
		User u = (User) request.getSession().getAttribute("user");
		int userId = u.getUserId();
		
		//�������
		Address address = new Address();
		address.setAddressContent(newAddress);
		address.setUserId(userId);
		*/
		//iUserService.addAddress(address);
		//return "myinfo";
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
		System.out.println(list.size());
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
		System.out.println(user.getUserId());
		/*List<Order> orderList = IOrderService.findAllOrderByUserId(user.getUserId());*/
		User t = iUserService.findUserAllOrder(user.getUserId());
		model.addAttribute("user", t);
		System.out.println(t.getUserId() + t.getOrder().size());
		return "myorder";
	}
}
