package cn.edu.hzvtc.entity;


/**
 * 审核结果实体类
 */
public class User implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int id;  	  		 //主键
	private String passWord; 	// 密码
	private String name; 	   // 用户名
	private int phone; 			// 手机号
	private String email; 		// 用户邮箱
	private int money;      // 资金
	private String actualName;  //真实姓名
	private int idCard;		//身份证号

	public User() {
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public int getIdCard() {
		return idCard;
	}

	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", passWord=" + passWord + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", money=" + money + ", actualName=" + actualName + ", idCard=" + idCard + "]";
	}


	

	

}