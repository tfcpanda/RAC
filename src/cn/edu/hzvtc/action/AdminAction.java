package cn.edu.hzvtc.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import cn.edu.hzvtc.entity.Admin;
import cn.edu.hzvtc.service.AdminService;




public class AdminAction extends ActionSupport implements ModelDriven<Admin>{

	private static final long serialVersionUID = 1L;
	//模型驱动要使用的对象
	private Admin admin = new Admin();
	
	public Admin getModel() {
		return admin;
	}
	/*
	 * 跳转到注册页面的执行方法
	 */
	public String adminPage() {
		return "admin";
	}
	
	//注入userService
	private AdminService adminService;
		
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	/*
	 * 用户登录的方法
	 */
	public String login() {
		Admin existUser= adminService.login(admin);
		if(existUser == null) {
			//登录失败
			this.addActionError("登录失败");
			return LOGIN;
		}else {
			//登录成功
			//将用户的信息存进session中
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			//完成页面的跳转
			return "loginSuccess";
		}
		
	}
	
	/*
	 * 用户退出的方法
	 */
	public String quit() {
		//销毁session
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
}
