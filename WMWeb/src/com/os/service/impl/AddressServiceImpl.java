package com.os.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.os.dao.AddressMapper;
import com.os.domain.Address;
import com.os.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Resource
	private AddressMapper addressMapper;
	
	@Override
	public void addAdress(Address ad) {
		addressMapper.insert(ad);
	}
	
}
