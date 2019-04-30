package cn.edu.hzvtc.dao;


import cn.edu.hzvtc.entity.User;

public interface UserDao extends BaseDao<User>{
	
	public void save(User user);

	public User login(User user);
	
}
