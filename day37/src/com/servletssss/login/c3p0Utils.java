package com.servletssss.login;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;
//本类,演示把c3p0连接池做成工具类.
public class c3p0Utils {
	//1:私有共享对象
	private static ComboPooledDataSource datasource = new ComboPooledDataSource();
	//2:提供公共获取对象方法
	public static ComboPooledDataSource getDatasoursce() {
		return datasource;
	}
	//3:提供类名点获取连接方法.在方法中使用到对象,所有在别的类只需要调用获取连接方法,就能获取对象找到c3p0配置文件,返回连接
	public static Connection getConnection(){
		try {
			return datasource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
