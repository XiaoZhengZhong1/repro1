package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc3 {

	public static void main(String[] args) throws Exception {

	Class.forName("com.mysql.jdbc.Driver");			//1:注册驱动程序
	
	String url = "jdbc:mysql://localhost:3306/mybase3";
	String user = "root";
	String password = "123";
	Connection con = DriverManager.getConnection(url, user, password);	//2:获取连接
	
	 Statement sta = con.createStatement();			//3:获取执行语句对象
	
	String sql = "SELECT * FROM zhangwu";			//拼写查询语句
	// 数据库连接 第四部--数据表查询    第五步--价格处理
	ResultSet rs = sta.executeQuery(sql);			//4:执行SQL查询语句,返回一个结果集接口
	
	while(rs.next()){								//5:处理结果
		System.out.println(rs.getInt("id") + "  " + rs.getString("zname") + "  " + rs.getDouble("money"));
	}
	
	rs.close();
	sta.close();
	con.close();
	}

}
