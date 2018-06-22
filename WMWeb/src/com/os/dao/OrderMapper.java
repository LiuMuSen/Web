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

    //退单处理
	void upadteOrderSta(Integer id);

	//接单处理
	void updateStatus(Integer orderId);
	
	/**
	 * 获取当前订单号的最大值，即获取新插入的订单的订单号
	 * @return
	 * @author oy
	 */
	int getMaxOrderId();
	
	/**
	 * 插入新订单
	 * @param order
	 * @author oy
	 */
	void insertOrder(Order order);
}