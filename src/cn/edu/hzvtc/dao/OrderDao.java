package cn.edu.hzvtc.dao;

import java.util.List;

import cn.edu.hzvtc.entity.Order;

public interface OrderDao {

	public void save(Order order);
	
	public int findCountByUid(Integer uid);

	public List<Order> findPageByUid(Integer id, int begin, int limit);

	public Order findByOid(Integer oid);

	public void update(Order currOrder);

	
	

	
	

}
