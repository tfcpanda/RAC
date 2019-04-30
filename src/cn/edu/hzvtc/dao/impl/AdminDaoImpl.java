package cn.edu.hzvtc.dao.impl;
import java.util.List;


import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.edu.hzvtc.dao.AdminDao;
import cn.edu.hzvtc.entity.Admin;


public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	//使用hibernate模板注册账号。
	@Override
	public void save(Admin admin) {
		this.getHibernateTemplate().save(admin);

	}


	//用户登录的方法
	@Override
	public Admin login(Admin admin) {
		String hql = "from Admin where name = ? and password = ?";
		List<Admin> list = (List<Admin>) this.getHibernateTemplate().find(hql, admin.getName(),admin.getPassword());
		if(list != null && list.size() >0) {
			return list.get(0);
		}
		return null;

	}


}