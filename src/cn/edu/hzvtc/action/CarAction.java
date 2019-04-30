package cn.edu.hzvtc.action;
import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


import cn.edu.hzvtc.entity.Cart;
import cn.edu.hzvtc.entity.CartItem;
import cn.edu.hzvtc.entity.Product;
import cn.edu.hzvtc.service.CarService;
import cn.edu.hzvtc.service.ProductService;
import cn.edu.hzvtc.service.UserService;

public class CarAction  extends ActionSupport{
	//接受商品ID
	private int id;
	//接收数量
	private Integer number;
	//注入商品的Service
	@Resource
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	//提供set方法
	public void setId(int id) {
		this.id = id;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}

	//注入orderService
	private CarService carService;

	public void setCarService(CarService carService) {
		this.carService = carService;
	}
	/*
	 * 跳转到订单页面的执行方法
	 */
	public String orderPage() {
		return "carPage";
	}

	// 将购物项添加到购物车:执行的方法
		public String addCart() {
			// 封装一个CartItem对象.
			CartItem cartItem = new CartItem();
			// 设置数量:
			cartItem.setNumber(number);
			// 根据pid进行查询商品:
			Product product = productService.findById(id);
			// 设置商品:
			cartItem.setProduct(product);
			// 将购物项添加到购物车.
			// 购物车应该存在session中.
			Cart cart = getCart();
			cart.addCart(cartItem);

			return "addCart";
		}

		/**
		 * 获得购物车的方法:从session中获得购物车.
		 * @return
		 */
		private Cart getCart() {
			Cart cart = (Cart) ServletActionContext.getRequest().getSession()
					.getAttribute("cart");
			if (cart == null) {
				cart = new Cart();
				ServletActionContext.getRequest().getSession()
						.setAttribute("cart", cart);
			}
			return cart;
		}




}
