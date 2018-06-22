package com.os.service;

import com.os.domain.Order;
import com.os.domain.Orderdetail;

public interface IOrderService {

	//改变订单状态
	public void changeOrderSta(String orderId);
	
	/**
	 * 插入新订单
	 * @param order
	 * @author oy
	 */
	void insertOrder(Order order);
	
	/**
	 * 获取当前插入的订单号
	 * @return 最大的订单号
	 * @author oy
	 */
	int  getMaxOrder();
	
	/**
	 * 插入订单详情
	 * @param od 订单详情
	 * @author oy
	 */
	void insertOrderDetail(Orderdetail od);
}
