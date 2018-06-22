package com.os.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.Apply;
import com.os.domain.User;
import com.os.service.ApplyService;
import com.os.service.TypeService;

@Controller
@RequestMapping("apply")
public class ApplyController {
	
	@Resource
	private ApplyService applyService;
	
	@Resource
	private TypeService typeSerive;
	
	//------------------------用户申请开店-----------------------------
	//申请开店
	@RequestMapping("applyShop")
	public String insertItem(HttpServletRequest request,Model model,Apply apply){
		User user = (User) request.getSession().getAttribute("user");
		apply.setUserId(user.getUserId());
		Integer typeId = typeSerive.findIdByName((String)request.getParameter("typeName"));
		apply.setTypeId(typeId);
		apply.setApplyStatus(0);
		applyService.addApply(apply);
		return "forward:/shop/findAllShop.do";
	}
	
	
}
