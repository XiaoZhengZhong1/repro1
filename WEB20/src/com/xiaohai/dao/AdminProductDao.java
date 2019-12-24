package com.xiaohai.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.xiaohai.domain.Category;
import com.xiaohai.domain.Product;
import com.xiaohai.utils.c3p0Utils;
import com.xiaohai.vo.condition;

public class AdminProductDao {

	public List<Product> findAllProduct() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product";
		// 一般dao层的异常到抛
		List<Product> productList = runner.query(sql,
				new BeanListHandler<Product>(Product.class));
		return productList;
	}

	// 演示添加所有商品类别.
	public List<Category> findAllCategory() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from category";
		// 一般dao层的异常到抛
		List<Category> categoryList = runner.query(sql,
				new BeanListHandler<Category>(Category.class));
		return categoryList;
	}

	// 添加商品
	public void addProduct(Product product) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "insert into product values(?,?,?,?,?,?,?,?,?,?)";
		int a = runner.update(sql, product.getPid(), product.getPname(),
				product.getMarket_price(), product.getShop_price(),
				product.getPimage(), product.getPdate(), product.getIs_hot(),
				product.getPdesc(), product.getPflag(), product.getCid());
		System.out.println(a);
	}

	// 删除商品
	public void delProduct(String pid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "update product set pname=?,";
		runner.update(sql, pid);

	}

	// 修改商品时显示商品代码
	public Product findProductById(String pid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product where pid=?";
		Product product = runner.query(sql, new BeanHandler<Product>(
				Product.class), pid);
		return product;
	}

	// 更新商品
	public void updateProduct(Product product) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "update product set pname=?,market_price=?,shop_price=?,pimage=?,pdate=?,is_hot=?,pdesc=?,pflag=?,cid=? where pid=?";
		runner.update(sql, product.getPname(), product.getMarket_price(),
				product.getShop_price(), product.getPimage(),
				product.getPdate(), product.getIs_hot(), product.getPdesc(),
				product.getPflag(), product.getCid(), product.getPid());

	}

	// 根据条件查询商品
	public List<Product> findProductListByCondition(condition condition)
			throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		// 创建一个集合来装条件查询的结果,放到查询参数中,因为参数是可便的,条件有可能是一个或者两个,三个,数组不能,只能是集合
		List<String> list = new ArrayList<>();
		// 因为条件查询有三个条件可选 私有sql语句where要拼,但是如果三个条件都没选,为了保证sql语句的语法正确得1=1
		String sql = "select * from product where 1=1";
		// 表示如果查询条件中名称不等于空并且去除名称两头的空窜后不等于空窜,说明条件查询有名称条件,就添加到集合
		if (condition.getPname() != null && !condition.getPname().trim().equals("")) {
			// 表示名字是模糊查询 因为要考虑三个条件都满足 sql语句可能会拼三个条件,所以sql语句中两头都要用空,表示两头都是要拼接
			sql += " and pname like ? ";
			list.add("%" + condition.getPname().trim() + "%");
		}

		if (condition.getIsHot() != null && !condition.getIsHot().trim().equals("")) {
			sql += " and is_Hot=? ";
			list.add(condition.getIsHot().trim());
		}

		if (condition.getCid() != null && !condition.getCid().trim().equals("")) {
			sql += " and cid=? ";
			list.add(condition.getCid().trim());
		}
		// 因为查询参数语法要求是数组,所以要把集合转数组
		List<Product> product = runner.query(sql, new BeanListHandler<Product>(
				Product.class), list.toArray());
		return product;
	}
}
