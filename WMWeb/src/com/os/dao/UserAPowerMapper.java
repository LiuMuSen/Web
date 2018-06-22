package com.os.dao;

import java.util.List;

import com.os.domain.PageBean;
import com.os.domain.User;
import com.os.domain.UserAPower;

public interface UserAPowerMapper {
	
	//�����û���Ϣ
	List<UserAPower> selectAllUser();

	//���ҷ�ҳ��Ϣ
	List<UserAPower> pageOfUser(PageBean page);

	//�����û������ַ��Ϣ
	UserAPower findUserAAddress(User user);

	//�����û���Ϣ�������û�Id
	void insert(UserAPower user);

}
