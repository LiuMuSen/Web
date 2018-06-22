package com.os.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.os.dao.AddressMapper;
import com.os.dao.UserAPowerMapper;
import com.os.dao.UserMapper;
import com.os.domain.Address;
import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.User;
import com.os.domain.UserAPower;
import com.os.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Resource
	private UserMapper userMapper;
	
	@Resource
	private UserAPowerMapper userAPowerMapper;
	
	/**
	 * @author oy
	 */
	@Resource
	private AddressMapper addressMapper;
	
	@Override
	public User findUser(User user) {
		return userMapper.selectByUserPhone(user.getUserPhone());
	}

	@Override
	public void changePWD(User u) {
		userMapper.changePWD(u);
	}

	@Override
	public List<UserAPower> findAllUser() {
		return userAPowerMapper.selectAllUser();
	}

	@Override
	public int count() {
		return userMapper.count();
	}

	@Override
	public List<UserAPower> pageOfUser(PageBean page) {
		return userAPowerMapper.pageOfUser(page);
	}

	@Override
	public UserAPower findUserAAddress(User user) {
		return userAPowerMapper.findUserAAddress(user);
	}

	@Override
	public void deleteuserInfo(User user) {
		userMapper.deleteByPrimaryKey(user.getUserId());
	}

	@Override
	public void addUser(UserAPower user) {
		 userAPowerMapper.insert(user);
	}

	@Override
	public Integer selectMaxId() {
		return userMapper.selectMaxId();
	}

	@Override
	public void saveOrUpdateuserInfo(User user) {
		userMapper.saveOrUpdate(user);
	}

	@Override
	public User findUserById(User user) {
		return userMapper.selectByPrimaryKey(user.getUserId());
	}

	@Override
	public void updatePower(Apply apply) {
		userMapper.updatePower(apply.getUserId());
	}

	/**
	 * 注册
	 * @author oy
	 * @param user
	 */
	@Override
	public void register(User user) {
		userMapper.insert(user);
	}
	
	/**
	 * 修改用户信息
	 * @author oy
	 * @param user
	 */
	@Override
	public void edit(User user) {
		userMapper.updateByPrimaryKey(user);
	}

	/**
	 * 增加地址
	 * @author oy
	 * @param record
	 */
	@Override
	public void addAddress(Address record) {
		addressMapper.insert(record);
	}
	
	/**
	 * 根据用户id找地址
	 * @author oy
	 * @param userId
	 * @return
	 */
	@Override
	public List<Address> findAddressByUserId(int userId) {
		List<Address> list = addressMapper.selectByUserId(userId);
		return list;
	}
	/**
	 * 根据用户id找到所有订单
	 * @author oy
	 * @param userId
	 * @return
	 */
	@Override
	public User findUserAllOrder(int userId) {
		return userMapper.findUserAllOrder(userId);
	}


}
