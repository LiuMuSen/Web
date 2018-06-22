package com.os.dao;

import com.os.domain.Order;
import com.os.domain.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //�˵�����
	void upadteOrderSta(Integer id);

	//�ӵ�����
	void updateStatus(Integer orderId);
	
	/**
	 * ��ȡ��ǰ�����ŵ����ֵ������ȡ�²���Ķ����Ķ�����
	 * @return
	 * @author oy
	 */
	int getMaxOrderId();
	
	/**
	 * �����¶���
	 * @param order
	 * @author oy
	 */
	void insertOrder(Order order);
}