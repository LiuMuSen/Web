package com.os.dao;

import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.User;
import com.os.domain.UserAPower;
import com.os.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    //ͨ���绰�����ѯ��Ӧ���û�
    User selectByUserPhone(String userPhone);

    //�޸��û�����
	void changePWD(User u);

	//��ȡ�û�����
	int count();

	//��������ID
	Integer selectMaxId();

	//�����޸ĺ���û���Ϣ
	void saveOrUpdate(User user);

	//����Ȩ��
	void updatePower(Integer userId);
	
	/**
	 * ����UserId�ҵ��û����ж���
	 * @param userid
	 * @return
	 * @author oy
	 */
	User findUserAllOrder(int userid);

}