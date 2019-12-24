package com.xiaohai.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import com.xiaohai.utils.c3p0Utils;

public class ProductDao {

	public List<Object> findProductByWord(String word) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product where pname LIKE ? limit ?,?";
		List<Object> query = runner.query(sql, new ColumnListHandler("pname"), "%"+word+"%",0,6);
		return query;
	
	}

}
