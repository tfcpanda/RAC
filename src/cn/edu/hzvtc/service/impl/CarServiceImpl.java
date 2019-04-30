package cn.edu.hzvtc.service.impl;

import cn.edu.hzvtc.dao.CarDao;
import cn.edu.hzvtc.service.CarService;

public class CarServiceImpl implements CarService {
	/*
	 * 注入OrderDao
	 */
	private CarDao carDao;

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}
}
