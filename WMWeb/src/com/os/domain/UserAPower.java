package com.os.domain;

import java.util.List;

public class UserAPower extends User{
	private String powerName;

	private List<Address> addressList;
	
	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	
	
}
