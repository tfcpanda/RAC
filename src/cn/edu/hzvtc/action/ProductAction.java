package cn.edu.hzvtc.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.edu.hzvtc.entity.Product;
import cn.edu.hzvtc.service.ProductService;


/*
 * 产品的Actioon
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	//用于接受数据的模型驱动
	private Product product = new Product();

	public Product getModel() {
		return product;
	}
	//注入商品的Service
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	//根据商品的ID执行商品的查询
	public String findById() {
		product = productService.findById(product.getId());
		return "findById";
	}

	public String backProduct() {
		List<Product> clist =  productService.findAll();
		//将数据放入session的范围
		ActionContext.getContext().getSession().put("clist", clist);
		return "backProduct";
	}
}
