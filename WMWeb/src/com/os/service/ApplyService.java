package com.os.service;

import java.util.List;

import com.os.domain.Apply;
import com.os.domain.PageBean;

public interface ApplyService {

	//申请门店
	void addApply(Apply apply);

	//统计申请总数
	int countBystatus();

	//获取申请列表
	List<Apply> pageOfApply(PageBean page);

	//根据ID查找申请详情
	Apply findApplyById(Apply apply);


	//更新审核的商家信息
	void updatePassInfo(Apply apply);

	//更新审核不通过的商家信息
	void updateFailInfo(Apply apply);

	//统计所有活跃商家总数(status为1）
	int countBystatus1();

	//统计状态为1的商家
	List<Apply> pageOfApply1(PageBean page);


}
