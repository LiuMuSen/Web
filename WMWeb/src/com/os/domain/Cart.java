package com.os.domain;

import java.io.Serializable;

/**
 * ���ﳵ��
 * �Ž�ҳ�淽��
 * ��Ҫ����Ʒ��+��Ʒ����
 * @author oy
 *
 */
public class Cart implements Serializable{
	//==========
	private Integer itemsId;
	
	private String itemsName;

    private String itemsImagespic;

    private Integer itemsPrice;

    private Integer shopId;

    private String itemsContent;
    //===========����Ʒ��

    private Integer number; //��Ʒ����
    
    private Integer totalPrice;//������Ʒ�ܼ�

	public Integer getItemsId() {
		return itemsId;
	}

	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public String getItemsImagespic() {
		return itemsImagespic;
	}

	public void setItemsImagespic(String itemsImagespic) {
		this.itemsImagespic = itemsImagespic;
	}

	public Integer getItemsPrice() {
		return itemsPrice;
	}

	public void setItemsPrice(Integer itemsPrice) {
		this.itemsPrice = itemsPrice;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getItemsContent() {
		return itemsContent;
	}

	public void setItemsContent(String itemsContent) {
		this.itemsContent = itemsContent;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
    
    
}
