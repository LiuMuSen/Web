package com.os.domain;

import java.util.List;

public class Shop {
    private Integer shopId;

    private String shopName;

    private String shopAddress;

    private String shopActivity;

    private String shopLogon;

    private Integer userId;

    private Integer typeId;

    private Double shopTransfercost;

    private Double shopBegincost;

    private String shopDescription;

    //---------------------增加订单--------
    private List<Order> order;
    
	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}
    
	//-----------------------商家申请时的资料信息--------------------
	private Apply apply;
	
	
	
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopActivity() {
        return shopActivity;
    }

    public void setShopActivity(String shopActivity) {
        this.shopActivity = shopActivity == null ? null : shopActivity.trim();
    }

    public String getShopLogon() {
        return shopLogon;
    }

    public void setShopLogon(String shopLogon) {
        this.shopLogon = shopLogon == null ? null : shopLogon.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getShopTransfercost() {
        return shopTransfercost;
    }

    public void setShopTransfercost(Double shopTransfercost) {
        this.shopTransfercost = shopTransfercost;
    }

    public Double getShopBegincost() {
        return shopBegincost;
    }

    public void setShopBegincost(Double shopBegincost) {
        this.shopBegincost = shopBegincost;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription == null ? null : shopDescription.trim();
    }

	public Apply getApply() {
		return apply;
	}

	public void setApply(Apply apply) {
		this.apply = apply;
	}


}