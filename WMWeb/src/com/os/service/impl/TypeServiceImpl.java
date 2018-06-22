package com.os.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.os.dao.TypeMapper;
import com.os.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService{
	
	@Resource
	private TypeMapper typeMapper;

	//�������Ʋ���id
	@Override
	public Integer findIdByName(String typeName) {
		return typeMapper.findIdByName(typeName);
	}
}
