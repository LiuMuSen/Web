package com.os.dao;

import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.Shop;
import com.os.domain.ShopAType;
import com.os.domain.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExampleWithBLOBs(ShopExample example);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExampleWithBLOBs(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKeyWithBLOBs(Shop record);

    int updateByPrimaryKey(Shop record);

    //根据用户ID查找商家ID
	Integer findShopIdByUseId(Integer userId);

	//保存修改后的部分信息
	void saveOrUpdate(Shop shop);

	//查找所有商家订单
	void findAllShopAndOrder();

	//获取所有的历史订单
	List<Shop> findAllShopAndOrder(Integer shopId);

	//获取的退单信息
	List<Shop> findOutShopAndOrder(Integer shopId);

	//获取今日订单
	Shop findTodayOrder(Integer shopId);

	//添加新的商家
	void insertNewShop(Apply apply);

	//获取最大的Id(新插入）
	int findMaxId();

	//获取到总数
	int count();
	
	/**
	 * 查找所有商店
	 * @return
	 * @author oy
	 */
	List<Shop> findAllShop();
	
}