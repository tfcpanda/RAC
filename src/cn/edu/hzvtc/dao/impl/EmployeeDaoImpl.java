package cn.edu.hzvtc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.edu.hzvtc.dao.EmployeeDao;
import cn.edu.hzvtc.entity.Employee;


public class EmployeeDaoImpl extends BaseDao<Employee> implements EmployeeDao{

	public List<Employee> getAll() {
		String hql = "From Employee e LEFT OUTER JOIN FETCH e.department";
		return getSession().createQuery(hql).list();
	}
	public List<Employee> getEmployeeByPage(int firstResult, int maxResult) {
		String hql = "From Employee e LEFT OUTER JOIN FETCH e.department ORDER BY e.id DESC";
		return getSession().createQuery(hql).setFirstResult(firstResult)
				.setMaxResults(maxResult).list();
	}

	public int getRecordCount() {
		String hql = "SELECT count(e.id) FROM Employee e";
		return ((Long) getSession().createQuery(hql).uniqueResult()).intValue();
	}
	
	public Employee getEmployeeByEmployeeName(String employeeName) {
		String hql = "FROM Employee e WHERE e.employeeName = ?";
		Query query = getSession().createQuery(hql).setString(0,
				employeeName);
		Employee employee = (Employee) query.uniqueResult();
		return employee;
	}
	//按照ID查询
	public Employee get(Integer id) {
		String hql = "FROM Employee e LEFT OUTER JOIN FETCH e.department WHERE e.id=?";
		return (Employee) getSession().createQuery(hql).setInteger(0, id)
				.uniqueResult();
	}
	
	public void batchDelete(String hql,String[] id) {
		 Query query = getSession().createQuery(hql);
	        query.executeUpdate();
	    }
	
	public boolean login(Employee employee) {
		// 设置一个记号flag;
		boolean flag = false;
		String hql = "FROM Employee e WHERE e.employeeName=? AND  e.employeeEmail=?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, employee.getEmployeeName());
		query.setParameter(1, employee.getEmployeeEmail());
		List list = query.list();
		if (!list.isEmpty()) {
			flag = true;
		}
		
		return flag;
	}
}	
