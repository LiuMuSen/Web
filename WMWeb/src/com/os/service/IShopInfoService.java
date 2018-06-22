package com.os.service;

import java.util.List;

import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.Shop;
import com.os.domain.ShopAType;
import com.os.domain.User;

public interface IShopInfoService {

	/**
	 * 查找商家信息
	 * @param user
	 * @return
	 */
	ShopAType findShopInfo(User user);

	/**
	 * 保存修改后的商家信息
	 * @param shop
	 */
	void saveOrUpdate(Shop shop);

	/**
	 * 获取到所有的历史订单
	 * @param shop
	 * @return
	 */
	List<Shop> findAllOrder(Shop shop);

	/**
	 * 获取到所有的退单
	 * @param shop
	 * @return
	 */
	List<Shop> findOutShopAndOrder(Shop shop);

	/**
	 * 获取到今日订单
	 * @param shop
	 * @return
	 */
	Shop findTodayOrder(Shop shop);

	/**
	 * 接受处理订单
	 * @param attribute
	 */
	void dealOrder(Integer orderId);

	/**
	 * 添加商店
	 * @param apply
	 */
	void addShop(Apply apply);

	/**
	 * 获取最大的ID（插入的ID）
	 * @return
	 */
	int findId();

	/**
	 * 获取到商店总数
	 * @return
	 */
	int count();
	
	/**
	 * 查找所有商家
	 * @author oy
	 * @return
	 */
	List<Shop> findAllShop();
	/**
	 * 根据shopId找到商店
	 * @param shopId
	 * @return
	 * @author oy
	 */
	Shop findShopByShopId(Integer shopId);

}
