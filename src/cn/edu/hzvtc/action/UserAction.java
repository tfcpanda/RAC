package cn.edu.hzvtc.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.edu.hzvtc.entity.User;
import cn.edu.hzvtc.service.UserService;
/*
 * 用户模块的Action类
 */

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private static final long serialVersionUID = 1L;
	//模型驱动要使用的对象
	private User user = new User();
	
	public User getModel() {
		return user;
	}
	/*
	 * 跳转到注册页面的执行方法
	 */
	public String registPage() {
		return "registPage";
	}
	
	//注入userService
	private UserService userService;
		
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/*
	 * 用户注册方法
	 */
	public String regist() {
		userService.save(user);
		return "regist";
	}
	
	/*
	 * 跳转到登录页面的执行方法
	 */
	public String loginPage() {
		return "loginPage";
	}
	
	/*
	 * 用户登录的方法
	 */
	public String login() {
		User existUser= userService.login(user);
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
