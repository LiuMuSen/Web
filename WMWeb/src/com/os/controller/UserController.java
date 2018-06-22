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
 * 修改个人信息
 * 添加收货地址
 * 查询地址
 * 查询订单
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
	 * 修改个人信息
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
		//把session里面的userName改成新的userName
		request.getSession().setAttribute("userName", user.getUserName());
		return "edit_myinfo";
	}
	/**
	 * 
	 * 添加地址
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
		//获取数据
		String newAddress = request.getParameter("newAddress");
		User u = (User) request.getSession().getAttribute("user");
		int userId = u.getUserId();
		
		//打包数据
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
	 * 根据UserId找到该用户所有地址
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
	 * 根据UserId找到该用户所有订单
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
