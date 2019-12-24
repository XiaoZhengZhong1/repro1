package com.jdbcUtilsConfig;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class A {
//����Ϊ����readUtilsCofig���еĶ��������ļ�ʧ��,������.����Ƕ���û����.�Ƕ�ȡ�����ļ���ȡ��������.���ܳ�ȡ.ֻ������д��ȡ�����ļ�����.
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
