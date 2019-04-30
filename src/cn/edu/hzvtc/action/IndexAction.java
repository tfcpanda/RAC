package cn.edu.hzvtc.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.hzvtc.entity.Product;
import cn.edu.hzvtc.service.ProductService;

public class IndexAction extends ActionSupport{
	//注入查询产品的Service
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	/*
	 * 执行页面访问的方法
	 * 查询页面
	 */
	public String execute() {
		List<Product> clist =  productService.findAll();
		//将数据放入session的范围
		ActionContext.getContext().getSession().put("clist", clist);
		return "index";
	}
}
