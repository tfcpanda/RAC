package cn.edu.hzvtc.dao.impl;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.edu.hzvtc.dao.UserDao;

import cn.edu.hzvtc.entity.User;


public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	//按名字查询    没有做
	public User findEntityByname(String name) {
		String hql = "from User where name = ?";
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, name);
		if(list != null && list.size() > 0  ) {
			return list.get(0);
		}
		return null;
	}

	//使用hibernate模板注册账号。
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}
	
	
	
	
	
	
	
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findEntityById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void saveOrUpdate(User t) {
		// TODO Auto-generated method stub
		
	}

}