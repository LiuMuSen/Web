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
	 * ��ȡ������
	 * ��ȡ��ǰ���Ķ�����
	 * @author oy
	 */
	@Override
	public int getMaxOrder() {
		return orderMaper.getMaxOrderId();
	}
	
	/**
	 * �µ�ʱ���ڶ������������Ӧ��Ϣ
	 * @author oy
	 */
	@Override
	public void insertOrderDetail(Orderdetail od) {
		orderDetailMapper.insert(od);
	}
	/**
	 * �����¶���
	 * @author oy
	 */
	@Override
	public void insertOrder(Order order) {
		orderMaper.insertOrder(order);		
	}
	
	/**
	 * ���ݶ���id���¶�������
	 */
	@Override
	public void updateOrderAssessById(Order order) {
		orderMaper.updateAssessById(order);
	}

}
