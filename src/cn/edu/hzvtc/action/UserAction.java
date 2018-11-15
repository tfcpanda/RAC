package cn.edu.hzvtc.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.hzvtc.entity.User;
import cn.edu.hzvtc.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private UserServiceImpl userServic;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserServiceImpl getUserServic() {
		return userServic;
	}
	public String login() {
		try {
			if (userServic.login(user)) {
				return "success";
				
			} else {
				return "input";
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	public void setUserServic(UserServiceImpl userServic) {
		this.userServic = userServic;
	}
	
	
}
