package com.os.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.os.dao.OrderMapper;
import com.os.dao.ShopATypeMapper;
import com.os.dao.ShopMapper;
import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.Shop;
import com.os.domain.ShopAType;
import com.os.domain.User;
import com.os.service.IShopInfoService;

@Service
public class ShopServiceImpl implements IShopInfoService {

	@Resource
	private ShopATypeMapper shopATypeMapper;
	
	@Resource
	private ShopMapper shopMapper;

	@Resource
	private OrderMapper orderMapper;
	
	@Override
	public ShopAType findShopInfo(User user) {
		Integer id = user.getUserId();
		ShopAType sAt = shopATypeMapper.findShopInfo(id);
		return sAt;
	}

	@Override
	public void saveOrUpdate(Shop shop) {
		shopMapper.saveOrUpdate(shop);
	}

	@Override
	public List<Shop> findAllOrder(Shop shop) {
		return shopMapper.findAllShopAndOrder(shop.getShopId());
	}

	@Override
	public List<Shop> findOutShopAndOrder(Shop shop) {
		return shopMapper.findOutShopAndOrder(shop.getShopId());
	}

	@Override
	public Shop findTodayOrder(Shop shop) {
		return shopMapper.findTodayOrder(shop.getShopId());
	}

	@Override
	public void dealOrder(Integer orderId) {
		orderMapper.updateStatus(orderId);
	}

	@Override
	public void addShop(Apply apply) {
		shopMapper.insertNewShop(apply);
	}

	@Override
	public int findId() {
		return shopMapper.findMaxId();
	}

	@Override
	public int count() {
		return shopMapper.count();
	}
	
	/**
	 * 找到所有商店
	 * @author oy
	 */
	@Override
	public List<Shop> findAllShop() {
		return shopMapper.findAllShop();
	}
	
	/**
	 * 根据商店ID找到商店各种信息
	 * @author oy
	 */
	@Override
	public Shop findShopByShopId(Integer shopId) {
		return shopMapper.selectByPrimaryKey(shopId);
	}
	
	
}
