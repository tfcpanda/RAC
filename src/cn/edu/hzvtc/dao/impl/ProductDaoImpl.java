package cn.edu.hzvtc.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.edu.hzvtc.dao.ProductDao;
import cn.edu.hzvtc.entity.Product;

/*
 * 持久化层
 */
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{
	//查询全部商品
	public List<Product> findall(){
		String hql = "from Product p where p.status=1";
		List<Product> list =  (List<Product>) this.getHibernateTemplate().find(hql);
		return list;
	}

	//根据ID查询商品
	public Product findById(int id) {
		return this.getHibernateTemplate().get(Product.class, id);
	}



	//下架操作
	public void outStock(Product outProduct) {
		getHibernateTemplate().update(outProduct);

	}

	@Override
	public List<Product> backFindAll() {
		String hql = "from Product ";
		List<Product> list =  (List<Product>) this.getHibernateTemplate().find(hql);
		return list;
	}



}
