package cn.edu.hzvtc.entity;

/**
 * 员工实体类
 */
public class Pm implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int id; // 员工编号
	private String password;// 密码
	private String name;// 姓名
	


	private Position position;// 职务编号

	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Pm [id=" + id + ", password=" + password + ", name=" + name + ", position=" + position + "]";
	}

	

	
}
