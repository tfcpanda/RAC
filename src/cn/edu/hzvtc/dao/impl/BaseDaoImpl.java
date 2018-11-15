package cn.edu.hzvtc.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import cn.edu.hzvtc.dao.BaseDao;
public class BaseDaoImpl <T> implements BaseDao<T> {
	/*
	 * 创建SessionFactory工厂
	 */
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	private Class<T> clazz;

	public BaseDaoImpl(){
		ParameterizedType type  = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
	}
	
	//增加更新
	public void saveOrUpdate(T t){
		getSession().saveOrUpdate(t);
	}

	//
	public void delete(Integer id){
		String hql = " DELETE FROM " + this.clazz.getName() + " t WHERE t.id=?";
		getSession().createQuery(hql).setInteger(0,id).executeUpdate();
	}

	//
	public T findEntityById(Integer id){
		return (T) getSession().get(this.clazz, id);
	}

	public List<T> getAll(){
		String hql = " FROM " + this.clazz.getName();
		return getSession().createQuery(hql).list();
	}
}
