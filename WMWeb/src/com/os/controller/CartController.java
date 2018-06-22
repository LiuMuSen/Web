package com.os.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.Address;
import com.os.domain.Cart;
import com.os.domain.Items;
import com.os.domain.Order;
import com.os.domain.Orderdetail;
import com.os.domain.User;
import com.os.service.IOrderService;
import com.os.service.IUserService;
import com.os.service.ItemsService;
/**
 * 购物车
 * @author oy
 *
 */
@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Resource
	private ItemsService ItemsService;
	@Resource
	private IUserService IUserService;
	@Resource
	private IOrderService IOrderService;
	
	//加一个物品进入购物车
	@RequestMapping("addItems.do")
	public void addItems(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		System.out.println("当前用户ID"+user.getUserId());
		String iId = request.getParameter("itemsId");
		System.out.println("字符串"+ iId);
		int itemsId = java.lang.Integer.parseInt(iId);
		System.out.println("物品ID"+itemsId);
		
		//在session里面取cart
		Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
		if(cart == null) {
			cart = new HashMap<Integer,Integer>();
			System.out.println("生成cart");
		}
		System.out.println("获得购物车后的size->"+cart.size());
		//购物车中有没有这个物品
		System.out.println(cart.containsKey(itemsId));
		if(cart.containsKey(itemsId)) {
			Integer num = cart.get(itemsId);
			num++;
			System.out.println("当前物品数量" + num);
			cart.put(itemsId, num);
			System.out.println("加入已有物品后的size->"+cart.size());
		}else {
			cart.put(itemsId, 1);
			System.out.println("加入新物品后的size->"+cart.size());
		}
		
		session.setAttribute("cart", cart);
		System.out.println("sessionID"+session);
		System.out.println("=========end=================");
		
	}
	
	//下单
	@RequestMapping("downOrder")
	public String downOrder(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		//取用户
		User user = (User) session.getAttribute("user");
		System.out.println("当前用户ID"+user.getUserId());
		System.out.println("sessionID"+session);
		
		//所有商品总价格
		int totalPrice = 0;
		
		//取出该用户所有地址
		List<Address> addressList = new ArrayList<Address>();
		addressList = IUserService.findAddressByUserId(user.getUserId());
		System.out.println("地址List的size"+addressList.size());
		
		
		List<Cart> cartList = new ArrayList<Cart>();
		Map<Integer,Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
		System.out.println("cart的size->" + cart.size());
		
		//取商品个数 和信息 计算单个总价
		for(Map.Entry<Integer, Integer> entry : cart.entrySet()) {
			Items itemsTemp = ItemsService.findById(entry.getKey());
			Cart cartTemp = new Cart();
			cartTemp.setItemsImagespic(itemsTemp.getItemsImagespic());
			cartTemp.setItemsId(itemsTemp.getItemsId());
			cartTemp.setItemsName(itemsTemp.getItemsName());
			cartTemp.setItemsPrice(itemsTemp.getItemsPrice());
			cartTemp.setShopId(itemsTemp.getShopId());
			cartTemp.setNumber(entry.getValue());
			int soloTotalPrice = cartTemp.getItemsPrice() * cartTemp.getNumber();
			cartTemp.setTotalPrice(soloTotalPrice);
			totalPrice += cartTemp.getTotalPrice();
			cartList.add(cartTemp);
			
		}
		
		System.out.println(totalPrice);
		System.out.println("===========downorder end======");
		
		session.setAttribute("addressList", addressList);
		session.setAttribute("cartList", cartList);
		session.setAttribute("totalPrice", totalPrice);
		
		return "order";
	}
	
	@RequestMapping("pay")
	public String pay(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		System.out.println(session);
		System.out.println("用户ID"+user.getUserId());
		Object orderTotalprice = session.getAttribute("totalPrice");
		Integer totalPrice = new Integer(orderTotalprice.toString());
		System.out.println("object:"+orderTotalprice);
		System.out.println("Integer:"+orderTotalprice);
		
		int shopId = 0;
		List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");
		for(Cart temp : cartList) {
			shopId = temp.getShopId();
			System.out.println(temp.getItemsId() +"-->" + temp.getNumber() + "->" + shopId);
		}
		String addressIdS =  request.getParameter("addressId");
		int addressId = java.lang.Integer.parseInt(addressIdS);
		System.out.println(addressId);
		
		//订单存入数据库
		Order order = new Order();
		order.setUserId(user.getUserId());
		order.setShopId(shopId);
		order.setAddressId(addressId);
		order.setOrderTotalprice((double) totalPrice);
		order.setOrderStatus(0);
		IOrderService.insertOrder(order);
		order.setOrderId(IOrderService.getMaxOrder());
		
		//订单详情
		for(Cart temp : cartList) {
			Orderdetail oD = new Orderdetail();
			oD.setItemsId(temp.getItemsId());
			oD.setOrderId(order.getOrderId());
			oD.setNumber(temp.getNumber());
			IOrderService.insertOrderDetail(oD);
		}
		System.out.println("======pay end=====");
		
		return "forward:/user/findAllOrderByUserId.do";
		
	}
	
}
