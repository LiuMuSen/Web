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
 * ���ﳵ
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
	
	//��һ����Ʒ���빺�ﳵ
	@RequestMapping("addItems.do")
	public void addItems(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		System.out.println("��ǰ�û�ID"+user.getUserId());
		String iId = request.getParameter("itemsId");
		System.out.println("�ַ���"+ iId);
		int itemsId = java.lang.Integer.parseInt(iId);
		System.out.println("��ƷID"+itemsId);
		
		//��session����ȡcart
		Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
		if(cart == null) {
			cart = new HashMap<Integer,Integer>();
			System.out.println("����cart");
		}
		System.out.println("��ù��ﳵ���size->"+cart.size());
		//���ﳵ����û�������Ʒ
		System.out.println(cart.containsKey(itemsId));
		if(cart.containsKey(itemsId)) {
			Integer num = cart.get(itemsId);
			num++;
			System.out.println("��ǰ��Ʒ����" + num);
			cart.put(itemsId, num);
			System.out.println("����������Ʒ���size->"+cart.size());
		}else {
			cart.put(itemsId, 1);
			System.out.println("��������Ʒ���size->"+cart.size());
		}
		
		session.setAttribute("cart", cart);
		System.out.println("sessionID"+session);
		System.out.println("=========end=================");
		
	}
	
	//�µ�
	@RequestMapping("downOrder")
	public String downOrder(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		//ȡ�û�
		User user = (User) session.getAttribute("user");
		System.out.println("��ǰ�û�ID"+user.getUserId());
		System.out.println("sessionID"+session);
		
		//������Ʒ�ܼ۸�
		int totalPrice = 0;
		
		//ȡ�����û����е�ַ
		List<Address> addressList = new ArrayList<Address>();
		addressList = IUserService.findAddressByUserId(user.getUserId());
		System.out.println("��ַList��size"+addressList.size());
		
		
		List<Cart> cartList = new ArrayList<Cart>();
		Map<Integer,Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
		System.out.println("cart��size->" + cart.size());
		
		//ȡ��Ʒ���� ����Ϣ ���㵥���ܼ�
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
		System.out.println("�û�ID"+user.getUserId());
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
		
		//�����������ݿ�
		Order order = new Order();
		order.setUserId(user.getUserId());
		order.setShopId(shopId);
		order.setAddressId(addressId);
		order.setOrderTotalprice((double) totalPrice);
		order.setOrderStatus(0);
		IOrderService.insertOrder(order);
		order.setOrderId(IOrderService.getMaxOrder());
		
		//��������
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
