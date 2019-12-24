package com.xiaohai.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.xiaohai.dao.AdminDao;
import com.xiaohai.domain.Category;
import com.xiaohai.domain.Order;
import com.xiaohai.domain.Product;

public class AdminService {
	// 商城系统添加商品分类查询
	public List<Category> findAllCategory() {
		AdminDao dao = new AdminDao();
		List<Category> findAllCategory = null;
		try {
			findAllCategory = dao.findAllCategory();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return findAllCategory;
	}

	// 商城系统收集商品
	public void saveProduct(Product product) {
		AdminDao dao = new AdminDao();
		try {
			dao.saveProduct(product);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// 目的:查询所有订单
	public List<Order> findAllOrders() {
		AdminDao dao = new AdminDao();
		List<Order> findAllOrders = null;
		try {
			findAllOrders = dao.findAllOrders();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return findAllOrders;
		
	}

	//目的:查询所有订单
	public List<Map<String, Object>> findOrderInfoByOid(String oid) {
		AdminDao dao = new AdminDao();
		List<Map<String, Object>> findOrderInfoByOid = null;
		try {
			 findOrderInfoByOid = dao.findOrderInfoByOid(oid);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return findOrderInfoByOid;
	}

}
