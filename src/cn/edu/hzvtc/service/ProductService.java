package cn.edu.hzvtc.service;

import java.util.List;

import cn.edu.hzvtc.entity.Product;

public interface ProductService {

	public List<Product> findAll();

	public Product findById(int id);

	public void outStock(Product outProduct);

	public List<Product> backFindAll();

	public void save(Product product) ;

}
