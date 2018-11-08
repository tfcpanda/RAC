package cn.edu.hzvtc.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class HiberateTest1 {

	SessionFactory sessionFactory= null;
	Transaction transaction= null;
	Session session = null;
	@Before
	public void init(){
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
		.applySettings(configuration.getProperties())
		.buildServiceRegistry();
		sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}

	@After
	public void distory(){
		transaction.commit();
		session.close();
		sessionFactory.close();
	}


    @Test
    public void test(){
    	
    }
    
  

}
