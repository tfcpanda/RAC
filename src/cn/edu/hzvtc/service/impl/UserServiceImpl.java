package cn.edu.hzvtc.service.impl;


import cn.edu.hzvtc.entity.User;
import cn.edu.hzvtc.service.UserService;


import org.springframework.transaction.annotation.Transactional;

import cn.edu.hzvtc.dao.UserDao;

@Transactional
public class UserServiceImpl implements UserService {
	/*
	 * 注入UserDao
	 */
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//登陆方法
	public boolean login(User user) {
		return false;
		
	}

	@Override
	public User findEntityByname(String name) {
		return userDao.findEntityByname(name);
	}

	/*
	 * 业务层完成用户注册代码
	 */
	public void save (User user) {
		userDao.save(user); 
	}
	
}
