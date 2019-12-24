package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc2 {

	public static void main(String[] args) throws Exception {
/*
 * ###10执行select语句获取结果集
	* A: 执行select语句获取结果集
 * */
	//1:注册驱动
		Class.forName("com.mysql.jdbc.Driver");
	//2:获取连接对象(返回connetion会话接口)
		String url = "jdbc:mysql://localhost:3306/mybase3";
		String username = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, username, password);
	//3:获取语句执行对象(用会话接口实例对象,调用创建执行SQL语句的方法,返回一个执行SQL语句接口)
					Statement sta = con.createStatement();
	//拼写查询语句selsct,用来执行(最后是在SQL中编写,在复制过来,因为SQL中代码关键字自动转大写)
	String sql = "SELECT * FROM sort";	//因为执行对象的方法参数是(String sql)
	//4:执行SQL语句.(执行SQL查询语句,返回一个结果集接口ResultSet)
				ResultSet rs = sta.executeQuery(sql);
	//遍历结果集对象 rs 用结果集接口ResulSet中的方法(注意这个接口,肯定已经被SQL厂商实现了,我们直接用返回对象调用)next()和getxxx()
		while(rs.next()){
			System.out.println(rs.getInt("sid") + "  " + rs.getString("sname") + "   " + 
								rs.getDouble("sprice") + "   " + rs.getNString("sdesc"));
				}
			rs.close();
			con.close();
			sta.close();
	}

}
