package com.xiaohai.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.xiaohai.domain.Product;
import com.xiaohai.utils.c3p0Utils;

public class ProductListDao {

	public List<Product> findProduct() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product";
		return	runner.query(sql, new BeanListHandler<Product>(Product.class));
		 
	}

	//获取全部的商品条数
	public int getTotalCount() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select count(*) from product";
		//因为查询是经过是一个Object因为商品中有不同的属性,所以需要强转成查询本身返回的Long
		Long query = (Long) runner.query(sql, new ScalarHandler());
		//因为返回值是int,所以需要转换
		return query.intValue();
	}

	public List<Product> findProductListForPageBean(int index, int currentCount) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
	         //limit:限定的意思   表示限定从表中 那个? 索引开始 显示 多少条? 记录
		String sql = "select * from product limit ?,?";
		return runner.query(sql, new BeanListHandler<Product>(Product.class), index,currentCount);
		
		
	}

}
