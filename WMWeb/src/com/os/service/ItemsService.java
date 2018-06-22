package com.os.service;

import java.util.List;

import com.os.domain.Items;
import com.os.domain.User;

public interface ItemsService {

	/*
	 * �������еĲ�Ʒ
	 */
	List<Items> findAll(User user);

	/*
	 * �����µĲ�Ʒ
	 */
	void insertNewItem(User user,Items item);

	/**
	 * ����ID���Ҳ���
	 * @param id
	 * @return
	 */
	Items findById(int id);

	/**
	 * �����޸ĺ��item
	 * @param items
	 */
	void saveOrUpdate(Items items);


	/**
	 * ɾ����Ϣ
	 * @param id
	 */
	void deleteById(int id);

	/**
	 * @author oy
	 * @param id �̼ҵ�Id
	 * @return �̼ҵ�����Item
	 */
	List<Items> findAllByShopId(Integer id);
	
}
