package cn.edu.hzvtc.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.hzvtc.entity.User;
import cn.edu.hzvtc.service.UserService;


public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private UserService userService;
	private User user;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String login() {
		try {
			if (userService.login(user)) {
				return "success";
			} else {
				return "input";
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}
