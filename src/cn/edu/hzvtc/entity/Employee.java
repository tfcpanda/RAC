package cn.edu.hzvtc.entity;
// Generated Apr 23, 2019 9:45:27 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "employee", catalog = "rac")
public class Employee implements java.io.Serializable {

	private Integer id;
	private Department department;
	private String employeeName;
	private String employeeEmail;
	private Date employeeBirthday;
	private Date createTime;

	public Employee() {
	}

	public Employee(Department department, String employeeName, String employeeEmail, Date employeeBirthday,
			Date createTime) {
		this.department = department;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeBirthday = employeeBirthday;
		this.createTime = createTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPARTMENT_ID")
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Column(name = "EMPLOYEE_NAME")
	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Column(name = "EMPLOYEE_EMAIL")
	public String getEmployeeEmail() {
		return this.employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EMPLOYEE_BIRTHDAY", length = 19)
	public Date getEmployeeBirthday() {
		return this.employeeBirthday;
	}

	public void setEmployeeBirthday(Date employeeBirthday) {
		this.employeeBirthday = employeeBirthday;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
