package cn.edu.hzvtc.entity;
// Generated Apr 19, 2019 9:57:07 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "rac")
public class User implements java.io.Serializable {

	private Integer id;
	private String password;
	private String name;
	private Integer phone;
	private String email;
	private Integer money;
	private String actualname;
	private Integer idcard;
	private Set<Order> orders = new HashSet<Order>(0);

	public User() {
	}

	public User(String password, String name) {
		this.password = password;
		this.name = name;
	}

	public User(String password, String name, Integer phone, String email, Integer money, String actualname,
			Integer idcard, Set<Order> orders) {
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.money = money;
		this.actualname = actualname;
		this.idcard = idcard;
		this.orders = orders;
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

	@Column(name = "PASSWORD", nullable = false, length = 19)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "NAME", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PHONE")
	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "MONEY")
	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	@Column(name = "ACTUALNAME")
	public String getActualname() {
		return this.actualname;
	}

	public void setActualname(String actualname) {
		this.actualname = actualname;
	}

	@Column(name = "IDCARD")
	public Integer getIdcard() {
		return this.idcard;
	}

	public void setIdcard(Integer idcard) {
		this.idcard = idcard;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}
