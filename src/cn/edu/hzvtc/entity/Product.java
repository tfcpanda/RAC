package cn.edu.hzvtc.entity;


/**
 * 报销单实体类
 */
public class Product implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int price; // 产品价格
	private String responseRate; // 产品的回报率
	private String storageTime; // 定期时间
	
	public Product() {
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getResponseRate() {
		return responseRate;
	}
	public void setResponseRate(String responseRate) {
		this.responseRate = responseRate;
	}
	public String getStorageTime() {
		return storageTime;
	}
	public void setStorageTime(String storageTime) {
		this.storageTime = storageTime;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", responseRate=" + responseRate + ", storageTime="
				+ storageTime + "]";
	}
	
	


}