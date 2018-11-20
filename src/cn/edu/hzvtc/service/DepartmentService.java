package cn.edu.hzvtc.service;

import java.util.List;

import cn.edu.hzvtc.dao.DepartmentDao;
import cn.edu.hzvtc.entity.Department;

public interface DepartmentService {
	//创建department类
	
	public void setDepartmentDao(DepartmentDao departmentDao) ;
	//编写list方法
	public List<Department> getAll();
}
