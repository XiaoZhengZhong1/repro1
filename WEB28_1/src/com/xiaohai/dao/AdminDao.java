package com.xiaohai.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.xiaohai.domain.Category;
import com.xiaohai.domain.Order;
import com.xiaohai.domain.Product;
import com.xiaohai.utils.c3p0Utils;

public class AdminDao {

	public List<Category> findAllCategory() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from category";
		return	runner.query(sql, new BeanListHandler<Category>(Category.class));
	
	}

	//商城系统收集商品
	public void saveProduct(Product product) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "insert into product values(?,?,?,?,?,?,?,?,?,?)";
		runner.update(sql, product.getPid(),product.getPname(),product.getMarket_price(),
				product.getShop_price(),product.getPimage(),product.getPdate(),
				product.getIs_hot(),product.getPdesc(),product.getPflag(),product.getCategory().getCid());
	
	
	}

	public List<Order> findAllOrders() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from orders";
		return runner.query(sql, new BeanListHandler<Order>(Order.class));
		
	}

	
	//目的:查询所有订单
	public List<Map<String, Object>> findOrderInfoByOid(String oid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql ="select product.pimage,product.pname,product.shop_price,orderitem.count,orderitem.subtotal "
					+ " from orderitem , product " + " where orderitem.pid=product.pid and orderitem.oid=?";
		return 	runner.query(sql, new MapListHandler(),oid);
		
		
	}

	

}
