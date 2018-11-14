package cn.edu.hzvtc.dao;
import java.util.List;


public interface BaseDao <T>{
	//增加更新
	 void saveOrUpdate(T t);
	//删除
	 void delete(Integer id);
	//按ID查询
	public T findEntityById(Integer id);
	//查询全部
	public List<T> getAll();
		
}
