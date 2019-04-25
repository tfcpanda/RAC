package cn.edu.hzvtc.service.impl;

import java.util.List;

import cn.edu.hzvtc.dao.DepartmentDao;
import cn.edu.hzvtc.entity.Department;
import cn.edu.hzvtc.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService{
	//创建department类
	private DepartmentDao departmentDao;
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	//编写list方法
	public List<Department> getAll() {
		return departmentDao.getAll();
	}
}
