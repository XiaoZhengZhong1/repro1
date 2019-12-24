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
	
	//1:获取最新商品,发送到商城首页(通过数据库的上架日期字段)
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

	//2:获取最热商品.发送到商城首页(通过数据库是否热门字段0 1)

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
		
		//封装一个PageBean 返回web层
		PageBean<Product> pageBean = new PageBean<Product>();
		
		//1、封装当前页
		pageBean.setCurrentPage(currentPage);
		//2、封装每页显示的条数
		pageBean.setCurrentCount(currentCount);
		//3、封装总条数
		int totalCount = 0;
		try {
			totalCount = dao.getCount(cid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		pageBean.setTotalCount(totalCount);
		//4、封装总页数,总条数除以每页显示条数,乘以1.0,让其变成小数.再向上取整.
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		
		//5、封装当前页显示的数据
		// select * from product where cid=? limit ?,?
		// 当前页与起始索引index的关系,公式为:起始索引=当前页-1 再乘以当前条数
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
	
	

	//提交订单 将订单的数据和订单项的数据存储到数据库中
	public void submitOrder(Order order) {
		
		ProductDao dao = new ProductDao();
		
		try {
			//1、开启事务
			c3p0Utils.startTransaction();
			//2、调用dao存储order表数据的方法
			dao.addOrders(order);
			//3、调用dao存储orderitem表数据的方法
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

	//获得指定用户的订单集合
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
