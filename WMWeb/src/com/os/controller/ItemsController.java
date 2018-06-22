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
 * ��ƷController
 * @author ��ľɭ
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
	
	//�����µĲ�
	@RequestMapping("insertItem")
	public String insertItem(HttpServletRequest request,Model model,Items item){
		ItemsService.insertNewItem((User) request.getSession().getAttribute("user"),item);
		return "forward:findAllItems.do";
	}
	
	
	//��ת���޸�ҳ��
	@RequestMapping("edit")
	public String edit(int id,Model model){
		Items item = ItemsService.findById(id);
		model.addAttribute("item",item);
		return "food_edit";
	}
	
	//�޸ı�����Ϣ
	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(Items items){
		ItemsService.saveOrUpdate(items);
		return "redirect:findAllItems.do";
	}
	
	//ɾ����Ϣ
	@RequestMapping("deleteByID")
	public String deleteByID(int id){
		ItemsService.deleteById(id);
		return "redirect:findAllItems.do";
	}
	
	/**
	 * �����̼�Id�ҵ�������Ʒ
	 * @author oy
	 * @param id �̼�Id
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
