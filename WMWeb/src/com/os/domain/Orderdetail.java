package com.os.domain;

public class Orderdetail {
    private Integer orderdetailId;

    private Integer itemsId;

    private Integer orderId;

    private Integer number;

    //-------------------------Ìí¼Ó¶©µ¥----------------
    private Items items;
    
	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}
    //-------------------------------------------------
    
    public Integer getOrderdetailId() {
        return orderdetailId;
    }

    public void setOrderdetailId(Integer orderdetailId) {
        this.orderdetailId = orderdetailId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


}