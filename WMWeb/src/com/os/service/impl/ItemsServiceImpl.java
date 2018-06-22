package com.os.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.os.dao.ItemsMapper;
import com.os.dao.ShopMapper;
import com.os.domain.Items;
import com.os.domain.User;
import com.os.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService{

	@Resource
	private ItemsMapper itemsMapper;
	
	@Resource
	private ShopMapper shopMapper;
	
	public List<Items> findAll(User user) {
		Integer id = shopMapper.findShopIdByUseId(user.getUserId());
		return itemsMapper.findAllByShopId(id);
	}

	@Override
	public void insertNewItem(User user, Items item) {
		Integer shop_Id = shopMapper.findShopIdByUseId(user.getUserId());
		item.setShopId(shop_Id);
		itemsMapper.insertSelective(item);
	}

	@Override
	public Items findById(int id) {
		return itemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveOrUpdate(Items items) {
		itemsMapper.updateByPrimaryKey(items);
	}

	@Override
	public void deleteById(int id) {
		itemsMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 根据shopId找到该商店所有商品
	 * @author oy
	 */
	@Override
	public List<Items> findAllByShopId(Integer id) {
		return itemsMapper.findAllByShopId(id);
	}
}
