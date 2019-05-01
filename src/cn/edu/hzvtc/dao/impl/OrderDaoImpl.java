package cn.edu.hzvtc.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.orm.hibernate4.HibernateCallback;

import cn.edu.hzvtc.dao.OrderDao;
import cn.edu.hzvtc.dao.ProductDao;
import cn.edu.hzvtc.entity.Order;
import cn.edu.hzvtc.entity.Product;
import cn.edu.hzvtc.util.PageHibernateCallback;


public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao{

	//保存订单的方法
	public void save(Order order) {
		this.getHibernateTemplate().save(order);

	}
	//根据用户Id查询
	@Override
	public int findCountByUid(Integer uid) {
		String hql = "select count(*) from Order o where o.user.id = ?";
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql, uid);
		if (list != null && list.size() > 0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	//Dao层查询我的订单分页查询:查询数据
	public List<Order> findPageByUid(Integer uid, int begin, int limit) {
		String hql = "from Order o where o.user.id = ? order by o.ordertime desc";
		List<Order> list = this.getHibernateTemplate().execute(
				new PageHibernateCallback<Order>(hql, new Object[] { uid },
						begin, limit));
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	//根据ID查询订单
	public Order findByOid(Integer oid) {
		return this.getHibernateTemplate().get(Order.class,oid);
	}

	//修改订单
	public void update(Order currOrder) {
		this.getHibernateTemplate().update(currOrder);

	}



}
