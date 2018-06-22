package com.os.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.os.domain.Address;
import com.os.domain.Apply;
import com.os.domain.PageBean;
import com.os.domain.Shop;
import com.os.domain.User;
import com.os.domain.UserAPower;
import com.os.service.AddressService;
import com.os.service.ApplyService;
import com.os.service.IUserService;
import com.os.service.IPowerService;
import com.os.service.IShopInfoService;

@Controller
@RequestMapping("/operator")
public class OperatorController {
	
	@Resource 
	private IUserService userService;
	
	@Resource 
	private IPowerService powerService;

	@Resource
	private AddressService addressService;
	
	@Resource
	private ApplyService  applyService;
	
	@Resource
	private IShopInfoService  shopService;
	//------------------用户管理---------------------------
	
	//获取到所有用户
	@RequestMapping("findAllUser")
	public @ResponseBody List<UserAPower> findAllUser(){
		List<UserAPower> list = userService.findAllUser();
		System.out.println(list.size());
		return list;
	}
	
	//用户分页
	@RequestMapping("pageOfUser")
	public String pageOfUser(HttpServletRequest request,Model model,PageBean page){
		int count = userService.count();	//获得总数
		int totalPage = (int)Math.ceil(count*1.0/page.getPageSize()); //求出总页数
		int beginPage = (page.getCurrentPage()-1)*page.getPageSize(); //获得开始的条数
		
		//注入参数
		page.setBeginPage(beginPage);
		page.setCount(count);
		page.setPageSize(page.getPageSize());
		page.setTotalPage(totalPage);
		
		//获取用户数据
		List<UserAPower> pageOfUser= userService.pageOfUser(page);
		//封装用户数据
		page.setUsers(pageOfUser);
		
		//封装model，返回数据
		model.addAttribute("pageUser", page);
		return "operator/operator_userList";
	}
	
	//查看用户详细信息（包含地址、权限）
	@RequestMapping("finduserInfo")
	public String finduserInfo(Model model,User user){
		UserAPower u = userService.findUserAAddress(user);
		model.addAttribute("user", u);
		return "operator/operator_userView";
	}
	
	//删除用户信息
	@RequestMapping("deleteuserInfo")
	public String deleteuserInfo(Model model,User user){
		userService.deleteuserInfo(user);
		return "redirect:pageOfUser.do";
	}
	
	//添加用户
	@RequestMapping("adduserInfo")
	public String adduserInfo(UserAPower user,Address ad){
		Integer powerId = powerService.getId(user);
		user.setPowerId(powerId);;
		userService.addUser(user);
		Integer id = userService.selectMaxId();
		ad.setUserId(id);
		addressService.addAdress(ad);
		return "redirect:pageOfUser.do";
	}
	
	
	//跳转到用户信息页面
	@RequestMapping("edituserInfo")
	public String edituserInfo(Model model,User user){
		User u = userService.findUserById(user);
		model.addAttribute("user", u);
		return "operator/operator_userEdit";
	}
	
	//保存修改后的用户信息
	@RequestMapping("updateUser")
	public String saveOrUpdateuserInfo(User user,Model model){
		userService.saveOrUpdateuserInfo(user);
		return "redirect:pageOfUser.do";
	}
	
	//------------------商家管理---------------------------
	//申请商家分页
	@RequestMapping("pageOfApply")
	public String pageOfApply(HttpServletRequest request,Model model,PageBean page){
			int count = applyService.countBystatus();	//获得总数
			int totalPage = (int)Math.ceil(count*1.0/page.getPageSize()); //求出总页数
			int beginPage = (page.getCurrentPage()-1)*page.getPageSize(); //获得开始的条数
			
			//注入参数
			page.setBeginPage(beginPage);
			page.setCount(count);
			page.setPageSize(page.getPageSize());
			page.setTotalPage(totalPage);
			
			//获取用户数据
			List<Apply> pageOfApplys= applyService.pageOfApply(page);
			//封装用户数据
			page.setApplys(pageOfApplys);
			
			//封装model，返回数据
			model.addAttribute("pageOfApplys", page);
			return "operator/operator_shopList";
		}
	
	//通过Id查找审核信息
	@RequestMapping("findApplyById")
	public String findApplyById(Apply apply,Model model){
		Apply app = applyService.findApplyById(apply);
		model.addAttribute("apply", app);
		return "operator/operator_shopInfo";
	}
	
	//通过审核
	@RequestMapping("passApply")
	public String passApply(Apply apply){
		shopService.addShop(apply);
		int shopId = shopService.findId();
		apply.setShopId(shopId);
		applyService.updatePassInfo(apply);
		userService.updatePower(apply);
		return "redirect:pageOfApply.do";
	}
	
	//审核不通过
	@RequestMapping("failApply")
	public String failApply(Apply apply){
		applyService.updateFailInfo(apply);
		return "redirect:pageOfApply.do";
	}
	
	//商店列表
	@RequestMapping("pageOfshop")
	public String pageOfshop(HttpServletRequest request,Model model,PageBean page){
		int count = applyService.countBystatus1();	//获得总数
		System.out.println(count);
		int totalPage = (int)Math.ceil(count*1.0/page.getPageSize()); //求出总页数
		int beginPage = (page.getCurrentPage()-1)*page.getPageSize(); //获得开始的条数
		
		//注入参数
		page.setBeginPage(beginPage);
		page.setCount(count);
		page.setPageSize(page.getPageSize());
		page.setTotalPage(totalPage);
		
		//获取用户数据
		List<Apply> pageOfApplys= applyService.pageOfApply1(page);
		//封装用户数据
		page.setApplys(pageOfApplys);
		
		//封装model，返回数据
		model.addAttribute("pageOfApplys", page);
		return "operator/operator_shopAllList";
	}
	
	//--------------------修改密码---------------------------
	//保存修改后的修改密码
	@RequestMapping("modifyPwd")
	public String changPWD(HttpServletRequest request, HttpServletResponse response,Model model) throws IOException{
			String userPassword = request.getParameter("userPassword");
			String newPassword = request.getParameter("newPassword");
			String rePassword = request.getParameter("rePassword");
			if(userPassword.equals(newPassword)){
				model.addAttribute("mes", "原密码不能与新密码相同");
				return "operator/operator_changePWD";
			}
			User u = userService.findUser((User) request.getSession().getAttribute("user"));
			//原密码不匹配
			if(!u.getPassword().equals(userPassword)){	
				model.addAttribute("mes", "密码输入错误");
				return "operator/operator_changePWD";
			}
			//新密码重复输入不匹配
			if(newPassword.equals("")){	
				model.addAttribute("mes1", "新密码不能为空");
				return "operator/operator_changePWD";
			}
			//新密码重复输入不匹配
			if(!newPassword.equals(rePassword)){	
				model.addAttribute("mes1", "新密码重复错误");
				return "operator/operator_changePWD";
			}
			u.setPassword(newPassword);
			userService.changePWD(u);
			
			request.getSession().invalidate();
			//跳至登录页面
			PrintWriter out = response.getWriter();  
	        out.println("<html><script>");        
	        out.println("window.open ('"+request.getContextPath()+"/jsp/login1.jsp','_top')");      
	        out.println("</script></html>");    
	        return null;  
	}
	
}
