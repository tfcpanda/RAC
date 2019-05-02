package cn.edu.hzvtc.service;

import java.util.List;

import cn.edu.hzvtc.entity.Admin;
import cn.edu.hzvtc.entity.Product;

public interface AdminService {
	
	public Admin login(Admin admin);
	
	public void save(Admin admin);
	
	public List<Admin> findAll();

	public void update(Admin admin);
}
