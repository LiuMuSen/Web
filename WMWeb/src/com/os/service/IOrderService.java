package com.os.service;

import com.os.domain.Order;
import com.os.domain.Orderdetail;

public interface IOrderService {

	//�ı䶩��״̬
	public void changeOrderSta(String orderId);
	
	/**
	 * �����¶���
	 * @param order
	 * @author oy
	 */
	void insertOrder(Order order);
	
	/**
	 * ��ȡ��ǰ����Ķ�����
	 * @return ���Ķ�����
	 * @author oy
	 */
	int  getMaxOrder();
	
	/**
	 * ���붩������
	 * @param od ��������
	 * @author oy
	 */
	void insertOrderDetail(Orderdetail od);
}
