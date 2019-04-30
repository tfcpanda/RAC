package cn.edu.hzvtc.dao;

import java.util.List;

import cn.edu.hzvtc.entity.Product;

public interface ProductDao {

	public List<Product> findall();

	public Product findById(int id);

}
