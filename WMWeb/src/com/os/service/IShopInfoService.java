package com.os.service;

import java.util.List;

import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.Shop;
import com.os.domain.ShopAType;
import com.os.domain.User;

public interface IShopInfoService {

	/**
	 * �����̼���Ϣ
	 * @param user
	 * @return
	 */
	ShopAType findShopInfo(User user);

	/**
	 * �����޸ĺ���̼���Ϣ
	 * @param shop
	 */
	void saveOrUpdate(Shop shop);

	/**
	 * ��ȡ�����е���ʷ����
	 * @param shop
	 * @return
	 */
	List<Shop> findAllOrder(Shop shop);

	/**
	 * ��ȡ�����е��˵�
	 * @param shop
	 * @return
	 */
	List<Shop> findOutShopAndOrder(Shop shop);

	/**
	 * ��ȡ�����ն���
	 * @param shop
	 * @return
	 */
	Shop findTodayOrder(Shop shop);

	/**
	 * ���ܴ�����
	 * @param attribute
	 */
	void dealOrder(Integer orderId);

	/**
	 * ����̵�
	 * @param apply
	 */
	void addShop(Apply apply);

	/**
	 * ��ȡ����ID�������ID��
	 * @return
	 */
	int findId();

	/**
	 * ��ȡ���̵�����
	 * @return
	 */
	int count();
	
	/**
	 * ���������̼�
	 * @author oy
	 * @return
	 */
	List<Shop> findAllShop();
	/**
	 * ����shopId�ҵ��̵�
	 * @param shopId
	 * @return
	 * @author oy
	 */
	Shop findShopByShopId(Integer shopId);

}
