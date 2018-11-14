package cn.edu.hzvtc.dao;

import cn.edu.hzvtc.entity.User;

public interface UserDao extends BaseDao<User>{
	public User getManager(User employee);
}
