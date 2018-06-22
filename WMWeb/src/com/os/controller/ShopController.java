package com.os.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.Shop;
import com.os.service.IShopInfoService;
/**
 * 商店
 * @author oy
 *
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
	@Resource
	private IShopInfoService iShopInfoService;
	
	/**
	 * 找到所有商店
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("findAllShop")
	public String findAllShop(HttpServletRequest request, Model model) {
		List<Shop> list = iShopInfoService.findAllShop();
		/*System.out.println(list.size());*/
		model.addAttribute("shopList", list);
		return "home";
	}
}
