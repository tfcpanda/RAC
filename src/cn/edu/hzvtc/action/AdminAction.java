package cn.edu.hzvtc.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import cn.edu.hzvtc.entity.Admin;
import cn.edu.hzvtc.entity.Product;
import cn.edu.hzvtc.service.AdminService;




public class AdminAction extends ActionSupport implements ModelDriven<Admin>{

	private static final long serialVersionUID = 1L;
	//模型驱动要使用的对象
	private Admin admin = new Admin();

	public Admin getModel() {
		return admin;
	}

	//注入adminService
	private AdminService adminService;

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	/*
	 * 执行页面访问的方法
	 * 
	 */
	public String execute() {
		return "admin";
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
			return "adminSuccess";
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

	/*
	 * 查询全部
	 */
	public String adminAll() {
		List<Admin> clist =  adminService.findAll();
		//将数据放入session的范围
		ActionContext.getContext().getSession().put("clist", clist);
		return "adminAll";
	}
	/*
	 * 跳转到添加管理员信息
	 */
	public String pageAdmin() {
		return "pageAdmin";
	}
	/*
	 * 增加管理员信息
	 */
	public String addAdmin() {
		adminService.save(admin);
		return "addAdmin";
	}
	/*
	 * 跳转更改管理员信息
	 */
	public String pageReAdmin() {
		return "pageReAdmin";
	}
	/*
	 * 更改管理员信息
	 */
	public String reAdmin() {
		adminService.update(admin);
		return "reAdmin";
	}
}
