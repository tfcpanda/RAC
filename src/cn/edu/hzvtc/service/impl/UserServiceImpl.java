package cn.edu.hzvtc.service.impl;


import cn.edu.hzvtc.entity.User;
import cn.edu.hzvtc.service.UserService;

import java.util.List;


import cn.edu.hzvtc.dao.UserDao;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//登陆方法
	public boolean login(User user) {
		List<User> list = userDao.login(user);
		boolean flag = false;
		if (!list.isEmpty()) {
			flag = true;
		}
		return flag;
	}

	
}
