package com.os.dao;

import java.util.List;

import com.os.domain.Power;
import com.os.domain.UserAPower;

public interface PowerMapper {
	 List<Power> findAllPower();
	 
	 //��ȡId
	Integer getId(UserAPower user);
}
