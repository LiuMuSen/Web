package com.os.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.os.dao.OrderMapper;
import com.os.dao.OrderdetailMapper;
import com.os.domain.Order;
import com.os.domain.Orderdetail;
import com.os.service.IOrderService;

@Service
public class OrderSerivceImpl implements IOrderService {

	@Resource
	private OrderMapper orderMaper;
	
	@Resource
	private OrderdetailMapper orderDetailMapper;
	
	@Override
	public void changeOrderSta(String orderId) {
		Integer Id = Integer.parseInt(orderId);
		orderMaper.upadteOrderSta(Id);
	}
	
	/**
	 * 获取订单号
	 * 获取当前最大的订单号
	 * @author oy
	 */
	@Override
	public int getMaxOrder() {
		return orderMaper.getMaxOrderId();
	}
	
	/**
	 * 下单时，在订单详情表加入对应信息
	 * @author oy
	 */
	@Override
	public void insertOrderDetail(Orderdetail od) {
		orderDetailMapper.insert(od);
	}
	/**
	 * 插入新订单
	 * @author oy
	 */
	@Override
	public void insertOrder(Order order) {
		orderMaper.insertOrder(order);		
	}
	
	/**
	 * 根据订单id更新订单评价
	 */
	@Override
	public void updateOrderAssessById(Order order) {
		orderMaper.updateAssessById(order);
	}

}
