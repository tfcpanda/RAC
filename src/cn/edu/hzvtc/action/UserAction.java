package cn.edu.hzvtc.action;

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
		return NONE;
	}
	


	}
