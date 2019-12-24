package com.JDBC_junit_before_after;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

//用ResourceBundle类中的方法,实现读取配置文件实现jdbc连接的工具类
public class jdbcUtils {
	//1:私有构造方法,不让其它类创建本类对象,只能本类类名点调用
	private jdbcUtils() {
		super();
		
	}
	
//2:定义连接对象并静态私有,对外提供公共访问方式.定义jdbc连接参数,定义成静态私有.因为获取和关流都要用到参数,静态私有本类都能用
	private static Connection con;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	//3:提供一个获取方法
	public static Connection getCon() {
		try {
			Class.forName(driver);
		con	= DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new RuntimeException(e + "数据库连接失败" );
		}
		return con;
	}

	//4:写一个静态代码块,在代码块中读取配置文件获取连接,因为静态代码块会随着类的加载执行一次,适合注册驱动
	static{
				//注意ResourceBundle.getBundle("34");获取的时候配置文件34.properties不需要后缀名properties
		ResourceBundle bundle = ResourceBundle.getBundle("34");
		driver = bundle.getString("driver");
		url = bundle.getString("url");
		user = bundle.getString("user");
		password = bundle.getString("password");
	}
	
	//5:写两个关闭方法,一个有结果集的,查询时需要关闭用,一个没有结果集的增删改的时候用
	public static void close(Connection con,Statement sta,ResultSet rs) {
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {}
			
		}
		if(sta!=null){
			try {
				con.close();
			} catch (SQLException e) {}
			
		}
		if(rs!=null){
			try {
				con.close();
			} catch (SQLException e) {}
			
		}
	}
	public static void close(Connection con,Statement sta) {
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {}
			
		}
		if(sta!=null){
			try {
				con.close();
			} catch (SQLException e) {}
			
		}
	}
}
