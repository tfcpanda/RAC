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

	/*
	 * 查询全部
	 */
	public String backProduct(){
		List<Product> clist =  productService.backFindAll();
		//将数据放入session的范围
		ActionContext.getContext().getSession().put("clist", clist);
		return "backProduct";
	}

	/*
	 * 商品下架
	 */
	public String outStock() {
		Product outProduct = productService.findById(product.getId());
		outProduct.setStatus(2);
		productService.outStock(outProduct);
		return "OutStockSuccess";
	}

	/*
	 * 商品上架
	 */
	public String putStock() {
		Product outProduct = productService.findById(product.getId());
		outProduct.setStatus(1);
		productService.outStock(outProduct);
		return "PutStockSuccess";
	}


	/*
	 * 增加新商品
	 */
	public String addProduct() {
		return "addProduct";
	}
}
