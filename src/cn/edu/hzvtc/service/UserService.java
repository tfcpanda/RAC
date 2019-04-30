package cn.edu.hzvtc.service;

import cn.edu.hzvtc.entity.User;

public interface UserService {
	
	public User login(User user);
	
	public void save(User user);
}
