package cn.edu.hzvtc.service;

import cn.edu.hzvtc.entity.Admin;

public interface AdminService {
	
	public Admin login(Admin admin);
	
	public void save(Admin admin);
}
