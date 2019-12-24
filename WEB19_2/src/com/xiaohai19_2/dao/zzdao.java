package com.xiaohai19_2.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xiaohai19_2.dbutils.c3p0Utils;




public class zzdao {
	//创建执行sql语句要创建QueryRunner
	QueryRunner runner = new QueryRunner();
	//执行转账转出方法(执行sql更新语句,减menoy操作)
	public void out(String outname,double zzdmoney) throws SQLException{
	//调用c3p0Utils工具类中,本地线程类中封装好的获取连接对象方法
	Connection conn = c3p0Utils.getCurrentConnection();
	String sql = "update zhuanzhang set money=money-? where name=?";
	runner.update(conn,sql, zzdmoney,outname);
	}
	
	
	public void in(String inname, double zzdmoney) throws SQLException{
		//调用c3p0Utils工具类中,本地线程类中封装好的获取连接对象方法
		Connection conn = c3p0Utils.getCurrentConnection();
		String sql = "update zhuanzhang set money=money+? where name=?";
		runner.update(conn, sql, zzdmoney,inname);
	}

}
