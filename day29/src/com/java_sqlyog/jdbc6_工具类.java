package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc6_工具类 {
//本类目的:实现jdbc工具类,直接返回连接对象Connection con(因为注册驱动和获取连接对象都是固定代码),关流(需要两个方法,一个有结果集参数)
	private jdbc6_工具类(){};
	private static Connection con;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mybase2";
			String user = "root";
			String password = "123";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			
			throw new RuntimeException(e + "数据库连接失败");
		}
	}
	public static Connection getConnection(){
		return con;
	}
	public static void close(Connection con,Statement sta,ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {}
		}
			if(sta != null){
				try {
					rs.close();
				} catch (SQLException e) {}
			}
				if(con != null){
					try {
						rs.close();
					} catch (SQLException e) {}
			}
	}

	public static void close(Connection con,Statement sta){
		if(sta != null){
			try {
				sta.close();
			} catch (SQLException e) {}
		}
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {}
		}
	}
}
