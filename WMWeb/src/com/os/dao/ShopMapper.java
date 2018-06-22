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

    //�����û�ID�����̼�ID
	Integer findShopIdByUseId(Integer userId);

	//�����޸ĺ�Ĳ�����Ϣ
	void saveOrUpdate(Shop shop);

	//���������̼Ҷ���
	void findAllShopAndOrder();

	//��ȡ���е���ʷ����
	List<Shop> findAllShopAndOrder(Integer shopId);

	//��ȡ���˵���Ϣ
	List<Shop> findOutShopAndOrder(Integer shopId);

	//��ȡ���ն���
	Shop findTodayOrder(Integer shopId);

	//����µ��̼�
	void insertNewShop(Apply apply);

	//��ȡ����Id(�²��룩
	int findMaxId();

	//��ȡ������
	int count();
	
	/**
	 * ���������̵�
	 * @return
	 * @author oy
	 */
	List<Shop> findAllShop();
	
}