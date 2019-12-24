package com.xiaohai.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.xiaohai.dao.ProductDao;
import com.xiaohai.domain.Category;
import com.xiaohai.domain.Order;
import com.xiaohai.domain.PageBean;
import com.xiaohai.domain.Product;
import com.xiaohai.utils.c3p0Utils;

public class ProductService {
	
	//1:��ȡ������Ʒ,���͵��̳���ҳ(ͨ�����ݿ���ϼ������ֶ�)
	ProductDao dao = new ProductDao();
	public List<Product> findHotProductList() {
		List<Product> findHotProductList = null;
		try {
			 findHotProductList = dao.findHotProductList();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return findHotProductList;
	}

	//2:��ȡ������Ʒ.���͵��̳���ҳ(ͨ�����ݿ��Ƿ������ֶ�0 1)

	public List<Product> findNewProductList() {
		List<Product> findNewProductList = null;
		try {
			 findNewProductList = dao.findNewProductList();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return findNewProductList;
	}

	public List<Category> findAllCategory() {
		List<Category> findAllCategory = null;
		try {
			 findAllCategory = dao.findAllCategory();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return findAllCategory;
	}

	public PageBean findProductListByCid(String cid, int currentPage,
			int currentCount) {
ProductDao dao = new ProductDao();
		
		//��װһ��PageBean ����web��
		PageBean<Product> pageBean = new PageBean<Product>();
		
		//1����װ��ǰҳ
		pageBean.setCurrentPage(currentPage);
		//2����װÿҳ��ʾ������
		pageBean.setCurrentCount(currentCount);
		//3����װ������
		int totalCount = 0;
		try {
			totalCount = dao.getCount(cid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		pageBean.setTotalCount(totalCount);
		//4����װ��ҳ��,����������ÿҳ��ʾ����,����1.0,������С��.������ȡ��.
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		
		//5����װ��ǰҳ��ʾ������
		// select * from product where cid=? limit ?,?
		// ��ǰҳ����ʼ����index�Ĺ�ϵ,��ʽΪ:��ʼ����=��ǰҳ-1 �ٳ��Ե�ǰ����
		int index = (currentPage-1)*currentCount;
		List<Product> list = null;
			try {
				list = dao.findProductByPage(cid,index,currentCount);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		pageBean.setList(list);
		return pageBean;
	}

	public Product findProductByPid(String pid) {
		ProductDao dao = new ProductDao();
		Product findProductByPid = null;
		try {
			findProductByPid = dao.findProductByPid(pid);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return findProductByPid;
	}
	
	

	//�ύ���� �����������ݺͶ���������ݴ洢�����ݿ���
	public void submitOrder(Order order) {
		
		ProductDao dao = new ProductDao();
		
		try {
			//1����������
			c3p0Utils.startTransaction();
			//2������dao�洢order�����ݵķ���
			dao.addOrders(order);
			//3������dao�洢orderitem�����ݵķ���
			dao.addOrderItem(order);
			
		} catch (SQLException e) {
			try {
				c3p0Utils.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				c3p0Utils.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void updateOrderAdrr(Order order) {
		ProductDao dao = new ProductDao();
		try {
			dao.updateOrderAdrr(order);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateOrderState(String r6_Order) {
		ProductDao dao = new ProductDao();
		try {
			dao.updateOrderState(r6_Order);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//���ָ���û��Ķ�������
	public List<Order> findAllOrders(String uid) {
		ProductDao dao = new ProductDao();
		List<Order> orderList = null;
		try {
			orderList = dao.findAllOrders(uid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orderList;
	}

	public List<Map<String, Object>> findAllOrderItemByOid(String oid) {
		ProductDao dao = new ProductDao();
		List<Map<String, Object>> mapList = null;
		try {
			mapList = dao.findAllOrderItemByOid(oid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mapList;
	}

	

}
