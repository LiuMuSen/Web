package com.os.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.os.dao.ApplyMapper;
import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.service.ApplyService;

@Service
public class applyServiceImpl implements ApplyService{

	@Resource
	private ApplyMapper applyMapper;
	
	@Override
	public void addApply(Apply apply) {
		applyMapper.insert(apply);
	}

	@Override
	public int countBystatus() {
		return applyMapper.countBystatus();
	}

	@Override
	public List<Apply> pageOfApply(PageBean page) {
		return applyMapper.pageOfApply(page);
	}

	@Override
	public Apply findApplyById(Apply apply) {
		return applyMapper.findApplyById(apply);
	}


	@Override
	public void updatePassInfo(Apply apply) {
		 applyMapper.updatePassInfo(apply);
	}

	@Override
	public void updateFailInfo(Apply apply) {
		 applyMapper.updateFailInfo(apply);
	}

	@Override
	public int countBystatus1() {
		return applyMapper.countBystatus1();
	}

	@Override
	public List<Apply> pageOfApply1(PageBean page) {
		return applyMapper.pageOfApply1(page);
	}

}
