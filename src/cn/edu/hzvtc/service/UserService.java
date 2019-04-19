package cn.edu.hzvtc.service;

import cn.edu.hzvtc.entity.User;

public interface UserService {
	
	public boolean login(User user);
	
	public User findEntityByname(String name);

	public void save(User user);
}
