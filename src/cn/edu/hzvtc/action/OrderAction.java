package cn.edu.hzvtc.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.edu.hzvtc.entity.Order;
import cn.edu.hzvtc.entity.OrderItem;
import cn.edu.hzvtc.entity.Product;
import cn.edu.hzvtc.entity.User;
import cn.edu.hzvtc.service.OrderSerivce;
import cn.edu.hzvtc.util.PageBean;
import cn.edu.hzvtc.entity.Cart;
import cn.edu.hzvtc.entity.CartItem;




public class OrderAction extends ActionSupport implements ModelDriven<Order>{
	//注入Service
	private OrderSerivce orderService;

	public void setOrderService(OrderSerivce orderService) {
		this.orderService = orderService;
	}
	/*
	 * 接受page参数
	 */
	private Integer page;

	public void setPage(Integer page) {
		this.page = page;
	}
	//模型驱动对象
	private Order order = new Order();
	@Override
	public Order getModel() {
		return order;
	}
	//生成订单的方法
	public String save() {
		//1.保存数据到数据库
		order.setOrdertime(new Date());
		order.setState(1);  //1:未付款   2 已经付款    3 没有发货  4 交易完成
		Cart cart = (Cart) ServletActionContext.getRequest().getSession().getAttribute("cart");
		if(cart == null) {
			this.addActionError("你还没有购物请去购物");
			return "msg";
		}
		order.setTotal(cart.getTotal());  //从购物城中获得总计，从session中获得
		//订单中的订单项
		for(CartItem cartItem : cart.getCartItems()) {
			OrderItem orderItem = new OrderItem();
			orderItem.setCount((int) cartItem.getNumber());
			orderItem.setSubtotal(cartItem.getSum());
			orderItem.setProduct(cartItem.getProduct());
			orderItem.setOrder(order);
			order.getOrderItems().add(orderItem);
		}
		//设置订单所属的用户
		User existUser = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		if(existUser == null) {
			this.addActionError("你还没有登录，清先登录");
			return "login";
		}

		order.setUser(existUser);
		orderService.save(order);
		//2.将订单对象显示到页面上
		//清空弄购物车
		cart.clearCart();
		return "saveSuccess";
	}

	/*
	 * 我的订单的查询
	 */
	public String findByUid() {
		//根据用户的ID查询
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		//调用service
		PageBean<Order> pageBean = orderService.findByPageUid(user.getId(),page);
		ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "findByUidSuccess";
	}

	//根据订单的ID查询订单的方法
	public String findByOid() {
		order = orderService.findByOid(order.getOid());
		return "findByOidSuccess";
	}

	//付款的方法
	public String payOrder() {
		//修改订单
		Order currOrder = orderService.findByOid(order.getOid());
		currOrder.setAddr(order.getAddr());
		currOrder.setName(order.getName());
		currOrder.setPhone(order.getPhone());
		currOrder.setState(2);
		orderService.update(currOrder);
		//为订单付款
		return "payOrder";
	}
}
