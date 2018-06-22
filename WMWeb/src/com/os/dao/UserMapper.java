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
    
    //通过电话号码查询对应的用户
    User selectByUserPhone(String userPhone);

    //修改用户密码
	void changePWD(User u);

	//获取用户总数
	int count();

	//查找最大的ID
	Integer selectMaxId();

	//保存修改后的用户信息
	void saveOrUpdate(User user);

	//更新权限
	void updatePower(Integer userId);
	
	/**
	 * 根据UserId找到用户所有订单
	 * @param userid
	 * @return
	 * @author oy
	 */
	User findUserAllOrder(int userid);

}