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

	//��ȡȫ������Ʒ����
	public int getTotalCount() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select count(*) from product";
		//��Ϊ��ѯ�Ǿ�����һ��Object��Ϊ��Ʒ���в�ͬ������,������Ҫǿת�ɲ�ѯ�����ص�Long
		Long query = (Long) runner.query(sql, new ScalarHandler());
		//��Ϊ����ֵ��int,������Ҫת��
		return query.intValue();
	}

	public List<Product> findProductListForPageBean(int index, int currentCount) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
	         //limit:�޶�����˼   ��ʾ�޶��ӱ��� �Ǹ�? ������ʼ ��ʾ ������? ��¼
		String sql = "select * from product limit ?,?";
		return runner.query(sql, new BeanListHandler<Product>(Product.class), index,currentCount);
		
		
	}

}
