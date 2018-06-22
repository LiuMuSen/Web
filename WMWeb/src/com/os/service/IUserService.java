package com.os.service;

import java.util.List;

import com.os.domain.Address;
import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.User;
import com.os.domain.UserAPower;

public interface IUserService {

	// 查询用户
	User findUser(User user);

	// 修改用户密码
	void changePWD(User u);

	// 所有权限与用户结合的信息
	List<UserAPower> findAllUser();

	// 获取总数
	int count();

	// 获取分页用户数
	List<UserAPower> pageOfUser(PageBean page);

	// 查找用户信息（包含地址）
	UserAPower findUserAAddress(User user);

	// 删除用户信息
	void deleteuserInfo(User user);

	// 添加用户并返回用户Id
	void addUser(UserAPower user);

	// 查找最大ID
	Integer selectMaxId();

	// 保存修改后的用户信息
	void saveOrUpdateuserInfo(User user);

	// 根据Id查询用户
	User findUserById(User user);

	// 更新权限
	void updatePower(Apply apply);

	/**
	 * 注册
	 * 
	 * @author oy
	 * @param user
	 */
	void register(User user);

	/**
	 * 修改用户信息
	 * 
	 * @author oy
	 * @param user
	 */
	void edit(User user);

	/**
	 * 添加地址
	 * @author oy
	 * @param record
	 */
	void addAddress(Address record);

	/**
	 * 根据userID查找地址
	 * @author oy
	 * @param userId
	 * @return
	 */
	List<Address> findAddressByUserId(int userId);

	/**
	 * 根据用户ID找到所有订单
	 * 
	 * @param userId
	 * @return
	 * @author oy
	 */
	User findUserAllOrder(int userId);

}
