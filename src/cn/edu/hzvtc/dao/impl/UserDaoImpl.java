package cn.edu.hzvtc.dao.impl;
import java.util.List;

import org.hibernate.Query;


import cn.edu.hzvtc.dao.UserDao;

import cn.edu.hzvtc.entity.User;


public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	//登陆方法
	@Override
	public List<User> login(User user) {
			String hql = "FROM User WHERE id=? AND  password=?";
			Query query = getSession().createQuery(hql);
			query.setInteger(0, user.getId());
			query.setString(1, user.getPassWord());
			List<User> list = query.list();
			return  list;
	}
}