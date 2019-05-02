package cn.edu.hzvtc.service.impl;

import java.util.List;

import cn.edu.hzvtc.dao.ProductDao;
import cn.edu.hzvtc.entity.Product;
import cn.edu.hzvtc.service.ProductService;

public class ProductServiceImpl implements ProductService{
	//注入ProductDao
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	//查询全部方法
	public List<Product> findAll(){
		return productDao.findall();

	}

	//根据ID查询商品
	public Product findById(int id) {
		return productDao.findById(id);
	}

	/*
	 * 下架操作
	 */
	@Override
	public void outStock(Product outProduct) {
		productDao.outStock(outProduct);
	}
	@Override
	public List<Product> backFindAll() {
		return productDao.backFindAll();
	}
	
	/*
	 * 添加操作
	 */
	public void save(Product product) {
		productDao.save(product);
	}
}
