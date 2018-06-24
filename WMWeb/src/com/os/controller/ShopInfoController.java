package com.os.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.Items;
import com.os.domain.Order;
import com.os.domain.Orderdetail;
import com.os.domain.Shop;
import com.os.domain.ShopAType;
import com.os.domain.User;
import com.os.service.IOrderService;
import com.os.service.IShopInfoService;
import com.os.service.IUserService;
import com.os.service.ItemsService;

@Controller
@RequestMapping("/shopInfo")
public class ShopInfoController {

	@Resource
	private IShopInfoService iShopInfoService;
	
	@Resource
	private IUserService iUserService;
	
	@Resource
	private ItemsService itemsService;
	
	//------oy----------
	@Resource
	private IOrderService iOrdeService;
	
	//查看商家首页信息
	@RequestMapping("findshopItems")
	public String findshopItems(HttpServletRequest request, Model model){
		Shop shop = iShopInfoService.findShopInfo((User) request.getSession().getAttribute("user"));
		List<Items> list = itemsService.findAllByShopId(shop.getShopId());
		model.addAttribute("itemList", list);
		model.addAttribute("shop", shop);
		return "shop_fooditem";
	}
	
	//查询商家信息
	@RequestMapping("findShopInfo")
	public String findShopInfo(HttpServletRequest request, Model model){
		ShopAType sAt = iShopInfoService.findShopInfo((User) request.getSession().getAttribute("user"));
		model.addAttribute("Info",sAt);
		return "shopInfo_view";
	}
	
	//查询商家信息
	@RequestMapping("editShopInfo")
	public String editShopInfo(HttpServletRequest request, Model model){
		ShopAType sAt = iShopInfoService.findShopInfo((User) request.getSession().getAttribute("user"));
		model.addAttribute("Info",sAt);
		return "shopInfo_edit";
	}
	
	//保存修改后的商家信息
	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(Shop shop){
		iShopInfoService.saveOrUpdate(shop);
		return "redirect:findShopInfo.do";
	}
	
	
	//保存修改后的修改密码
	@RequestMapping("modifyPwd")
	public String changPWD(HttpServletRequest request, HttpServletResponse response,Model model) throws IOException{
		String userPassword = request.getParameter("userPassword");
		String newPassword = request.getParameter("newPassword");
		String rePassword = request.getParameter("rePassword");
		if(userPassword.equals(newPassword)){
			model.addAttribute("mes", "原密码不能与新密码相同");
			return "shopInfo_changePWD";
		}
		User u = iUserService.findUser((User) request.getSession().getAttribute("user"));
		//原密码不匹配
		if(!u.getPassword().equals(userPassword)){	
			model.addAttribute("mes", "密码输入错误");
			return "shopInfo_changePWD";
		}
		//新密码重复输入不匹配
		if(newPassword.equals("")){	
			model.addAttribute("mes1", "新密码不能为空");
			return "shopInfo_changePWD";
		}
		//新密码重复输入不匹配
		if(!newPassword.equals(rePassword)){	
			model.addAttribute("mes1", "新密码重复错误");
			return "shopInfo_changePWD";
		}
		u.setPassword(newPassword);
		iUserService.changePWD(u);
		request.getSession().invalidate();
		//跳至登录页面
		PrintWriter out = response.getWriter();  
        out.println("<html><script>");        
        out.println("window.open ('"+request.getContextPath()+"/jsp/login1.jsp','_top')");      
        out.println("</script></html>");    
        return null;  
	}
	
	//查询所有的商家订单信息
	@RequestMapping("findAllOrder")
	public String findAllOrder(HttpServletRequest request,Model model ){
		Shop shop = iShopInfoService.findShopInfo((User) request.getSession().getAttribute("user"));
		List<Shop> shopOrder = iShopInfoService.findAllOrder(shop);
		for(Shop s:shopOrder){
			System.out.println(s.getOrder());
		}
		model.addAttribute("shopOrder",shopOrder);
		return "order_history";
	}
	
	//查询所有的退单信息
	@RequestMapping("findOutAllOrder")
	public String findOutShopAndOrder(HttpServletRequest request,Model model ){
		Shop shop = iShopInfoService.findShopInfo((User) request.getSession().getAttribute("user"));
		List<Shop> shopOrder = iShopInfoService.findOutShopAndOrder(shop);
		model.addAttribute("shopOrder",shopOrder);
		return "order_back";
	}
	
	//退单修改订单状态
	@RequestMapping("changeOrderSta")
	public String changeOrderSta(HttpServletRequest request,Model model ){
		iOrdeService.changeOrderSta(request.getParameter("orderId"));
		return "redirect:findOutAllOrder.do";
	}	
	
	//查询所有今日订单
	@RequestMapping("findTodayOrder")
	public String findTodayOrd(HttpServletRequest request,Model model ){
		Shop shop = iShopInfoService.findShopInfo((User) request.getSession().getAttribute("user"));
		Shop shopOrder = iShopInfoService.findTodayOrder(shop);
		model.addAttribute("shopOrder",shopOrder);
		return "order_new";
	}
	
	//接受订单
	@RequestMapping("dealOrder")
	public String dealOrder(HttpServletRequest request,Order order){
		/*iShopInfoService.dealOrder(order.getOrderId());*/
		iShopInfoService.dealOrderTo3(order.getOrderId());
		return "redirect:findTodayOrder.do";
	}
	
}
