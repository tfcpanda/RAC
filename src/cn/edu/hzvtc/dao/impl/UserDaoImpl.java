package cn.edu.hzvtc.dao.impl;
import cn.edu.hzvtc.dao.UserDao;

import cn.edu.hzvtc.entity.User;


public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	//登录方法
	@Override
	public User getManager(User user) {
		
		String hql = "FROM User u WHERE u.id = ? and u.password=?";
		
		return null;
	}


}