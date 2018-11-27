package cn.edu.hzvtc.test;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


import cn.edu.hzvtc.dao.impl.BaseDaoImpl;




@SuppressWarnings("rawtypes")
public class HiberateTest1 extends BaseDaoImpl{

	
	@Before
	public void init(){
		System.out.println("加载配置文件……");
		ApplicationContext context = new FileSystemXmlApplicationContext(new String[]{"src/applicationContext.xml"});
		System.out.println("加载配置文件成功");
		
	}


	@Test
	public void test(){
		String hql = "From Employee e LEFT OUTER JOIN FETCH e.department";
		List list = getSession().createQuery(hql).list();
		System.out.print(list);
	}
}
