package cn.edu.hzvtc.service.impl;


import cn.edu.hzvtc.entity.Admin;
import cn.edu.hzvtc.service.AdminService;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.edu.hzvtc.dao.AdminDao;


@Transactional
public class AdminServiceImpl implements AdminService {
	/*
	 * 注入UserDao
	 */
	private AdminDao adminDao;
	
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	//登录方法
	@Override
	public Admin login(Admin admin) {
		return adminDao.login(admin);
	}
	
	//注册
	@Override
	public void save(Admin admin) {
		adminDao.save(admin); 
		
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.findall();
	}
	
}
