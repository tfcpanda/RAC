package cn.edu.hzvtc.service;

import java.util.List;

import cn.edu.hzvtc.dao.EmployeeDao;
import cn.edu.hzvtc.entity.Employee;

public interface EmployeeService {
	//业务逻

	public void setEmployeeDao(EmployeeDao employeeDao) ;
	public List<Employee> getAll() ;
	//分页
	public List<Employee> getEmployeeByPage(int page, int pagesize) ;
	public int getRecordCount() ;
	//按ID删除数据
	public void delete(Integer id);
	//保存
	public void saveOrUpdate(Employee employee) ;
	//判断姓名是否可用
	public boolean employeeNameIsValid(String employeeName) ;
	//按照ID查询员工的方法
	public Employee get(Integer id) ;
	public void batchDeleteAsk(String [] id);
}
