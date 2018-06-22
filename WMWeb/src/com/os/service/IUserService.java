package com.os.service;

import java.util.List;

import com.os.domain.Address;
import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.User;
import com.os.domain.UserAPower;

public interface IUserService {

	// ��ѯ�û�
	User findUser(User user);

	// �޸��û�����
	void changePWD(User u);

	// ����Ȩ�����û���ϵ���Ϣ
	List<UserAPower> findAllUser();

	// ��ȡ����
	int count();

	// ��ȡ��ҳ�û���
	List<UserAPower> pageOfUser(PageBean page);

	// �����û���Ϣ��������ַ��
	UserAPower findUserAAddress(User user);

	// ɾ���û���Ϣ
	void deleteuserInfo(User user);

	// ����û��������û�Id
	void addUser(UserAPower user);

	// �������ID
	Integer selectMaxId();

	// �����޸ĺ���û���Ϣ
	void saveOrUpdateuserInfo(User user);

	// ����Id��ѯ�û�
	User findUserById(User user);

	// ����Ȩ��
	void updatePower(Apply apply);

	/**
	 * ע��
	 * 
	 * @author oy
	 * @param user
	 */
	void register(User user);

	/**
	 * �޸��û���Ϣ
	 * 
	 * @author oy
	 * @param user
	 */
	void edit(User user);

	/**
	 * ��ӵ�ַ
	 * @author oy
	 * @param record
	 */
	void addAddress(Address record);

	/**
	 * ����userID���ҵ�ַ
	 * @author oy
	 * @param userId
	 * @return
	 */
	List<Address> findAddressByUserId(int userId);

	/**
	 * �����û�ID�ҵ����ж���
	 * 
	 * @param userId
	 * @return
	 * @author oy
	 */
	User findUserAllOrder(int userId);

}
