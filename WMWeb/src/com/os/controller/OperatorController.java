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
	//------------------�û�����---------------------------
	
	//��ȡ�������û�
	@RequestMapping("findAllUser")
	public @ResponseBody List<UserAPower> findAllUser(){
		List<UserAPower> list = userService.findAllUser();
		System.out.println(list.size());
		return list;
	}
	
	//�û���ҳ
	@RequestMapping("pageOfUser")
	public String pageOfUser(HttpServletRequest request,Model model,PageBean page){
		int count = userService.count();	//�������
		int totalPage = (int)Math.ceil(count*1.0/page.getPageSize()); //�����ҳ��
		int beginPage = (page.getCurrentPage()-1)*page.getPageSize(); //��ÿ�ʼ������
		
		//ע�����
		page.setBeginPage(beginPage);
		page.setCount(count);
		page.setPageSize(page.getPageSize());
		page.setTotalPage(totalPage);
		
		//��ȡ�û�����
		List<UserAPower> pageOfUser= userService.pageOfUser(page);
		//��װ�û�����
		page.setUsers(pageOfUser);
		
		//��װmodel����������
		model.addAttribute("pageUser", page);
		return "operator/operator_userList";
	}
	
	//�鿴�û���ϸ��Ϣ��������ַ��Ȩ�ޣ�
	@RequestMapping("finduserInfo")
	public String finduserInfo(Model model,User user){
		UserAPower u = userService.findUserAAddress(user);
		model.addAttribute("user", u);
		return "operator/operator_userView";
	}
	
	//ɾ���û���Ϣ
	@RequestMapping("deleteuserInfo")
	public String deleteuserInfo(Model model,User user){
		userService.deleteuserInfo(user);
		return "redirect:pageOfUser.do";
	}
	
	//����û�
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
	
	
	//��ת���û���Ϣҳ��
	@RequestMapping("edituserInfo")
	public String edituserInfo(Model model,User user){
		User u = userService.findUserById(user);
		model.addAttribute("user", u);
		return "operator/operator_userEdit";
	}
	
	//�����޸ĺ���û���Ϣ
	@RequestMapping("updateUser")
	public String saveOrUpdateuserInfo(User user,Model model){
		userService.saveOrUpdateuserInfo(user);
		return "redirect:pageOfUser.do";
	}
	
	//------------------�̼ҹ���---------------------------
	//�����̼ҷ�ҳ
	@RequestMapping("pageOfApply")
	public String pageOfApply(HttpServletRequest request,Model model,PageBean page){
			int count = applyService.countBystatus();	//�������
			int totalPage = (int)Math.ceil(count*1.0/page.getPageSize()); //�����ҳ��
			int beginPage = (page.getCurrentPage()-1)*page.getPageSize(); //��ÿ�ʼ������
			
			//ע�����
			page.setBeginPage(beginPage);
			page.setCount(count);
			page.setPageSize(page.getPageSize());
			page.setTotalPage(totalPage);
			
			//��ȡ�û�����
			List<Apply> pageOfApplys= applyService.pageOfApply(page);
			//��װ�û�����
			page.setApplys(pageOfApplys);
			
			//��װmodel����������
			model.addAttribute("pageOfApplys", page);
			return "operator/operator_shopList";
		}
	
	//ͨ��Id���������Ϣ
	@RequestMapping("findApplyById")
	public String findApplyById(Apply apply,Model model){
		Apply app = applyService.findApplyById(apply);
		model.addAttribute("apply", app);
		return "operator/operator_shopInfo";
	}
	
	//ͨ�����
	@RequestMapping("passApply")
	public String passApply(Apply apply){
		shopService.addShop(apply);
		int shopId = shopService.findId();
		apply.setShopId(shopId);
		applyService.updatePassInfo(apply);
		userService.updatePower(apply);
		return "redirect:pageOfApply.do";
	}
	
	//��˲�ͨ��
	@RequestMapping("failApply")
	public String failApply(Apply apply){
		applyService.updateFailInfo(apply);
		return "redirect:pageOfApply.do";
	}
	
	//�̵��б�
	@RequestMapping("pageOfshop")
	public String pageOfshop(HttpServletRequest request,Model model,PageBean page){
		int count = applyService.countBystatus1();	//�������
		System.out.println(count);
		int totalPage = (int)Math.ceil(count*1.0/page.getPageSize()); //�����ҳ��
		int beginPage = (page.getCurrentPage()-1)*page.getPageSize(); //��ÿ�ʼ������
		
		//ע�����
		page.setBeginPage(beginPage);
		page.setCount(count);
		page.setPageSize(page.getPageSize());
		page.setTotalPage(totalPage);
		
		//��ȡ�û�����
		List<Apply> pageOfApplys= applyService.pageOfApply1(page);
		//��װ�û�����
		page.setApplys(pageOfApplys);
		
		//��װmodel����������
		model.addAttribute("pageOfApplys", page);
		return "operator/operator_shopAllList";
	}
	
	//--------------------�޸�����---------------------------
	//�����޸ĺ���޸�����
	@RequestMapping("modifyPwd")
	public String changPWD(HttpServletRequest request, HttpServletResponse response,Model model) throws IOException{
			String userPassword = request.getParameter("userPassword");
			String newPassword = request.getParameter("newPassword");
			String rePassword = request.getParameter("rePassword");
			if(userPassword.equals(newPassword)){
				model.addAttribute("mes", "ԭ���벻������������ͬ");
				return "operator/operator_changePWD";
			}
			User u = userService.findUser((User) request.getSession().getAttribute("user"));
			//ԭ���벻ƥ��
			if(!u.getPassword().equals(userPassword)){	
				model.addAttribute("mes", "�����������");
				return "operator/operator_changePWD";
			}
			//�������ظ����벻ƥ��
			if(newPassword.equals("")){	
				model.addAttribute("mes1", "�����벻��Ϊ��");
				return "operator/operator_changePWD";
			}
			//�������ظ����벻ƥ��
			if(!newPassword.equals(rePassword)){	
				model.addAttribute("mes1", "�������ظ�����");
				return "operator/operator_changePWD";
			}
			u.setPassword(newPassword);
			userService.changePWD(u);
			
			request.getSession().invalidate();
			//������¼ҳ��
			PrintWriter out = response.getWriter();  
	        out.println("<html><script>");        
	        out.println("window.open ('"+request.getContextPath()+"/jsp/login1.jsp','_top')");      
	        out.println("</script></html>");    
	        return null;  
	}
	
}
