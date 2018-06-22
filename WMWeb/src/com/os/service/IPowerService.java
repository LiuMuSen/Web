package com.os.service;

import java.util.List;

import com.os.domain.Power;
import com.os.domain.UserAPower;

public interface IPowerService {
	
	List<Power> findAllPower();
	
	public Integer getId(UserAPower user);
}
