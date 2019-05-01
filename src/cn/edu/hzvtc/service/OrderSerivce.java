package cn.edu.hzvtc.service;


import cn.edu.hzvtc.entity.Order;
import cn.edu.hzvtc.util.PageBean;

public interface OrderSerivce {

	public void save(Order order);

	public PageBean<Order> findByPageUid(Integer id, Integer page);

	public Order findByOid(Integer oid);

	public void update(Order currOrder);

}
