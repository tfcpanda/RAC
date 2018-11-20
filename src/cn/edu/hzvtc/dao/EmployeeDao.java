package cn.edu.hzvtc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cn.edu.hzvtc.entity.Employee;

public interface EmployeeDao extends BaseDao<Employee>{

	public List<Employee> getAll() ;
	
	public List<Employee> getEmployeeByPage(int firstResult, int maxResult) ;
	
	public int getRecordCount() ;
	
	public Employee getEmployeeByEmployeeName(String employeeName) ;
	//按照ID查询
	public Employee get(Integer id) ;
	
	public void batchDelete(String hql,String[] id) ;
}	