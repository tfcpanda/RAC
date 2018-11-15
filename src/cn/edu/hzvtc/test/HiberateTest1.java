package cn.edu.hzvtc.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.edu.hzvtc.entity.User;



public class HiberateTest1 {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	@Before
	public void init(){
		// 创建配置对象  
		Configuration config = new Configuration().configure();
		//config.addClass(Students.class);
		config.configure("/applicationContext.xml");
		// 创建服务注册对象
		ServiceRegistry serviceRegistery = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		// 创建会话工厂对象
		sessionFactory = config.buildSessionFactory(serviceRegistery);
		// 创建会话对象
		session = sessionFactory.openSession();
		// 开启事务
		transaction = session.beginTransaction();
	}

	@After
	public void destory(){
		// 提交事务
		transaction.commit();
		// 关闭会话
		session.close();
		// 关闭会话工厂
		sessionFactory.close();
	}



	@Test
	public void test(){
		User user = new User();
		String hql = "FROM User WHERE id=? AND  password=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, user.getId());
		query.setString(1, user.getPassWord());
		@SuppressWarnings("unchecked")
		List<User> list = query.list();
		System.out.print(list);
	}



}
