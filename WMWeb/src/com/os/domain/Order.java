package com.os.domain;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer orderId;

    private Integer userId;

    private Integer shopId;

    private Integer addressId;

    private Double orderTotalprice;

    private String orderAssess;

    private Integer orderStatus;

    private Date orderCreatetime;

    //----------------------加入订单详情与地址------------------

    private Address address;
    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
    
    private List<Orderdetail> detailList;
    
	public List<Orderdetail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<Orderdetail> detailList) {
		this.detailList = detailList;
	}
	//-----------------------------
	
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Double getOrderTotalprice() {
        return orderTotalprice;
    }

    public void setOrderTotalprice(Double orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    public String getOrderAssess() {
        return orderAssess;
    }

    public void setOrderAssess(String orderAssess) {
        this.orderAssess = orderAssess == null ? null : orderAssess.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

  //-----------------------------
  	//-----------oy----------------
  	private Shop shop;
  	
      public Shop getShop() {
  		return shop;
  	}

  	public void setShop(Shop shop) {
  		this.shop = shop;
  	}
  	
  	//-----------------------------

}