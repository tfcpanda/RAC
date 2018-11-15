package cn.edu.hzvtc.dao;

import java.util.List;

import cn.edu.hzvtc.entity.User;

public interface UserDao extends BaseDao<User>{
	
	public List<User> login(User user);
}
