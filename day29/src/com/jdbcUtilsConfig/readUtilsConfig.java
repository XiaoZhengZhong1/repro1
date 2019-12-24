package com.jdbcUtilsConfig;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class readUtilsConfig {
//创建一个读取配置文件的工具类.在需要获取数据库连接对象的时候,调用工具类即可
	//1:私有所有变量
	public static void main(String[] args) {
		System.out.println(con);
	}
	private static Connection con;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	//2:写一个静态代码块,在代码块中执行读取配置文件和获取连接对象(读取配置文件代码可以单独提出一个私有静态方法)
	static{
		try{
		getConfig();//读取配置文件被单独写成一个私有方法(注意不能在静态代码中写了读取方法,再抽取方法.此次这样写出错,找了一个小时)
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			throw new RuntimeException("数据库连接失败");
		}	
	}
//3:读取配置文件的私有方法;
	private static void getConfig() throws IOException{
		InputStream in = readUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(in);
		driver = pro.getProperty("driverClass");
		url=pro.getProperty("url");
		user=pro.getProperty("user");
		password=pro.getProperty("password");
	}
//4:仅对外提供公共的静态获取连接对象方式.
	public static Connection getConnection(){
		return con;
	}


	

}
