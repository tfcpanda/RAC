package cn.edu.hzvtc.dao;


import cn.edu.hzvtc.entity.Admin;

public interface AdminDao {
	
	public void save(Admin admin);

	public Admin login(Admin admin);
	
}
