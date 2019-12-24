package com.jdbcUtilsConfig;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class A {
//此类为了找readUtilsCofig类中的读出配置文件失败,而创建.结果是读出没问题.是读取配置文件抽取方法出错.不能抽取.只能另外写读取配置文件方法.
	public static void main(String[] args) throws Exception {
		Connection con;
		String driver;
		String url;
		String user;
		String password;
		InputStream is = readUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(is);
		driver = pro.getProperty("driverClass");
		url=pro.getProperty("url");
		user=pro.getProperty("user");
		password=pro.getProperty("password");
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		System.out.println(con);
	}
		

}
