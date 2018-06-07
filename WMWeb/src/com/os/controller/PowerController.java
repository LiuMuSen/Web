package com.os.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.Power;
import com.os.service.IPowerService;


/**
 * 用于权限的控制	
 * @author LMS
 *
 */

@Controller
public class PowerController {
	
	@Resource
	private IPowerService iPowerSerivice;
	
	//查询所有的权限信息
	@RequestMapping("list")
	public String findAll(Model model){
		List<Power> list = iPowerSerivice.findAllPower();
		model.addAttribute("itemsList",list);
		return "powerList";
	}
	
}
