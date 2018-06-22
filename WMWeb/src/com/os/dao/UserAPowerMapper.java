package com.os.dao;

import java.util.List;

import com.os.domain.PageBean;
import com.os.domain.User;
import com.os.domain.UserAPower;

public interface UserAPowerMapper {
	
	//查找用户信息
	List<UserAPower> selectAllUser();

	//查找分页信息
	List<UserAPower> pageOfUser(PageBean page);

	//查找用户及其地址信息
	UserAPower findUserAAddress(User user);

	//新增用户信息，返回用户Id
	void insert(UserAPower user);

}
