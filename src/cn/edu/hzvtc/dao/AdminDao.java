package cn.edu.hzvtc.dao;


import java.util.List;

import cn.edu.hzvtc.entity.Admin;
import cn.edu.hzvtc.entity.Product;

public interface AdminDao {
	
	public void save(Admin admin);

	public Admin login(Admin admin);
	
	public List<Admin> findall();
	
	

}
