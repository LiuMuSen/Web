package com.os.service;

import java.util.List;

import com.os.domain.Items;
import com.os.domain.User;

public interface ItemsService {

	/*
	 * 查找所有的菜品
	 */
	List<Items> findAll(User user);

	/*
	 * 插入新的菜品
	 */
	void insertNewItem(User user,Items item);

	/**
	 * 根据ID查找菜名
	 * @param id
	 * @return
	 */
	Items findById(int id);

	/**
	 * 保存修改后的item
	 * @param items
	 */
	void saveOrUpdate(Items items);


	/**
	 * 删除信息
	 * @param id
	 */
	void deleteById(int id);

	/**
	 * @author oy
	 * @param id 商家的Id
	 * @return 商家的所有Item
	 */
	List<Items> findAllByShopId(Integer id);
	
}
