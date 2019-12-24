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
		// һ��dao����쳣����
		List<Product> productList = runner.query(sql,
				new BeanListHandler<Product>(Product.class));
		return productList;
	}

	// ��ʾ���������Ʒ���.
	public List<Category> findAllCategory() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from category";
		// һ��dao����쳣����
		List<Category> categoryList = runner.query(sql,
				new BeanListHandler<Category>(Category.class));
		return categoryList;
	}

	// �����Ʒ
	public void addProduct(Product product) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "insert into product values(?,?,?,?,?,?,?,?,?,?)";
		int a = runner.update(sql, product.getPid(), product.getPname(),
				product.getMarket_price(), product.getShop_price(),
				product.getPimage(), product.getPdate(), product.getIs_hot(),
				product.getPdesc(), product.getPflag(), product.getCid());
		System.out.println(a);
	}

	// ɾ����Ʒ
	public void delProduct(String pid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "update product set pname=?,";
		runner.update(sql, pid);

	}

	// �޸���Ʒʱ��ʾ��Ʒ����
	public Product findProductById(String pid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product where pid=?";
		Product product = runner.query(sql, new BeanHandler<Product>(
				Product.class), pid);
		return product;
	}

	// ������Ʒ
	public void updateProduct(Product product) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "update product set pname=?,market_price=?,shop_price=?,pimage=?,pdate=?,is_hot=?,pdesc=?,pflag=?,cid=? where pid=?";
		runner.update(sql, product.getPname(), product.getMarket_price(),
				product.getShop_price(), product.getPimage(),
				product.getPdate(), product.getIs_hot(), product.getPdesc(),
				product.getPflag(), product.getCid(), product.getPid());

	}

	// ����������ѯ��Ʒ
	public List<Product> findProductListByCondition(condition condition)
			throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		// ����һ��������װ������ѯ�Ľ��,�ŵ���ѯ������,��Ϊ�����ǿɱ��,�����п�����һ����������,����,���鲻��,ֻ���Ǽ���
		List<String> list = new ArrayList<>();
		// ��Ϊ������ѯ������������ѡ ˽��sql���whereҪƴ,�����������������ûѡ,Ϊ�˱�֤sql�����﷨��ȷ��1=1
		String sql = "select * from product where 1=1";
		// ��ʾ�����ѯ���������Ʋ����ڿղ���ȥ��������ͷ�Ŀմܺ󲻵��ڿմ�,˵��������ѯ����������,����ӵ�����
		if (condition.getPname() != null && !condition.getPname().trim().equals("")) {
			// ��ʾ������ģ����ѯ ��ΪҪ������������������ sql�����ܻ�ƴ��������,����sql�������ͷ��Ҫ�ÿ�,��ʾ��ͷ����Ҫƴ��
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
		// ��Ϊ��ѯ�����﷨Ҫ��������,����Ҫ�Ѽ���ת����
		List<Product> product = runner.query(sql, new BeanListHandler<Product>(
				Product.class), list.toArray());
		return product;
	}
}
