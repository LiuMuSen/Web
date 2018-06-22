package com.os.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.os.domain.Items;
import com.os.domain.Shop;
import com.os.domain.User;
import com.os.service.IShopInfoService;
import com.os.service.ItemsService;

/**
 * 菜品Controller
 * @author 刘木森
 *
 */

@Controller
@RequestMapping("/items")
public class ItemsController {
	
	@Resource
	private ItemsService ItemsService;
	//----------oy-----------
	@Resource
	private IShopInfoService IShopInfoService;
	
	@RequestMapping("findAllItems")
	public String findAllItems(HttpServletRequest request,Model model){
		List<Items> list = ItemsService.findAll((User) request.getSession().getAttribute("user"));
		model.addAttribute("itemsList", list);
		return "food_all";
	}
	
	//插入新的菜
	@RequestMapping("insertItem")
	public String insertItem(HttpServletRequest request,Model model,Items item){
		ItemsService.insertNewItem((User) request.getSession().getAttribute("user"),item);
		return "forward:findAllItems.do";
	}
	
	
	//跳转到修改页面
	@RequestMapping("edit")
	public String edit(int id,Model model){
		Items item = ItemsService.findById(id);
		model.addAttribute("item",item);
		return "food_edit";
	}
	
	//修改保存信息
	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(Items items){
		ItemsService.saveOrUpdate(items);
		return "redirect:findAllItems.do";
	}
	
	//删除信息
	@RequestMapping("deleteByID")
	public String deleteByID(int id){
		ItemsService.deleteById(id);
		return "redirect:findAllItems.do";
	}
	
	/**
	 * 根据商家Id找到所有商品
	 * @author oy
	 * @param id 商家Id
	 * @return 
	 */
	@RequestMapping("findAllByShopId.do")
	public String findAllByShopId(HttpServletRequest request, Model model, Shop shop) {
		int id = shop.getShopId();
		shop = IShopInfoService.findShopByShopId(shop.getShopId());
		List<Items> list = ItemsService.findAllByShopId(id);
		model.addAttribute("shop", shop);
		request.getSession().setAttribute("shop", shop);
		model.addAttribute("itemList", list);
		return "fooditems";
	}
}
