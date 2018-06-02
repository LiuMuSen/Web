package com.os.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.os.dao.PowerMapper;
import com.os.domain.Power;
import com.os.service.IPowerService;

@Service
public class PowerService implements IPowerService {

	@Resource
	private PowerMapper powerMapper;
	

	@Override
	public List<Power> findAllPower() {
		List<Power> list = powerMapper.findAllPower();
		return list;
	}

}
