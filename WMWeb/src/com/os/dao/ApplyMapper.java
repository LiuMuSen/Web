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

    //查找需要审核的商家信息数目
	int countBystatus();

	//获取申请列表
	List<Apply> pageOfApply(PageBean page);

	//根据ID查找申请详情
	Apply findApplyById(Apply apply);


	//更新审核信息
	void updatePassInfo(Apply apply);

	//更新不同过的商家信息
	void updateFailInfo(Apply apply);

	//统计状态为1的总数
	int countBystatus1();

	//状态为1的商家
	List<Apply> pageOfApply1(PageBean page);
}