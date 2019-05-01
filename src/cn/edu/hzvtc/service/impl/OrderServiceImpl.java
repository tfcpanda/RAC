package cn.edu.hzvtc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.edu.hzvtc.dao.OrderDao;
import cn.edu.hzvtc.entity.Order;
import cn.edu.hzvtc.service.OrderSerivce;
import cn.edu.hzvtc.util.PageBean;

@Transactional
public class OrderServiceImpl implements OrderSerivce{
	//注入OrderDao
	private OrderDao orderDao;

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	//保存订单夜幕代码
	public void save(Order order) {
		orderDao.save(order);
	}

	//我的订单 分页
	public PageBean<Order> findByPageUid(Integer id, Integer page) {
		PageBean<Order> pageBean = new PageBean<Order>();
		// 设置当前页数:
		pageBean.setPage(page);
		// 设置每页显示记录数:
		// 显示5个
		int limit = 5;
		pageBean.setLimit(limit);
		// 设置总记录数:
		int totalCount = 0;
		totalCount = orderDao.findCountByUid(id);
		pageBean.setTotalCount(totalCount);
		// 设置总页数
		int totalPage = 0;
		if(totalCount % limit == 0){
			totalPage = totalCount / limit;
		}else{
			totalPage = totalCount / limit + 1;
		}
		pageBean.setTotalPage(totalPage);
		// 设置每页显示数据集合:
		int begin = (page - 1)*limit;
		List<Order> list = orderDao.findPageByUid(id,begin,limit);
		pageBean.setList(list);
		return pageBean;
	}

	//根据订单ID查询ID
	public Order findByOid(Integer oid) {
		return orderDao.findByOid(oid);
	}

	//为订单付款
	public void update(Order currOrder) {
		orderDao.update(currOrder);
		
	}


}
