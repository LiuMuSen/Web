package com.os.dao;

import com.os.domain.Apply;
import com.os.domain.ApplyExample;
import com.os.domain.PageBean;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    int countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExample(ApplyExample example);

    Apply selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);

    //������Ҫ��˵��̼���Ϣ��Ŀ
	int countBystatus();

	//��ȡ�����б�
	List<Apply> pageOfApply(PageBean page);

	//����ID������������
	Apply findApplyById(Apply apply);


	//���������Ϣ
	void updatePassInfo(Apply apply);

	//���²�ͬ�����̼���Ϣ
	void updateFailInfo(Apply apply);

	//ͳ��״̬Ϊ1������
	int countBystatus1();

	//״̬Ϊ1���̼�
	List<Apply> pageOfApply1(PageBean page);
}