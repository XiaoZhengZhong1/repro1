package com.xiaohai.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.xiaohai.dao.AdminDao;
import com.xiaohai.domain.Category;
import com.xiaohai.domain.Order;
import com.xiaohai.domain.Product;

public class AdminService {
	// �̳�ϵͳ�����Ʒ�����ѯ
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

	// �̳�ϵͳ�ռ���Ʒ
	public void saveProduct(Product product) {
		AdminDao dao = new AdminDao();
		try {
			dao.saveProduct(product);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// Ŀ��:��ѯ���ж���
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

	//Ŀ��:��ѯ���ж���
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
