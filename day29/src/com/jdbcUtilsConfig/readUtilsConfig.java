package com.jdbcUtilsConfig;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class readUtilsConfig {
//����һ����ȡ�����ļ��Ĺ�����.����Ҫ��ȡ���ݿ����Ӷ����ʱ��,���ù����༴��
	//1:˽�����б���
	public static void main(String[] args) {
		System.out.println(con);
	}
	private static Connection con;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	//2:дһ����̬�����,�ڴ������ִ�ж�ȡ�����ļ��ͻ�ȡ���Ӷ���(��ȡ�����ļ�������Ե������һ��˽�о�̬����)
	static{
		try{
		getConfig();//��ȡ�����ļ�������д��һ��˽�з���(ע�ⲻ���ھ�̬������д�˶�ȡ����,�ٳ�ȡ����.�˴�����д����,����һ��Сʱ)
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			throw new RuntimeException("���ݿ�����ʧ��");
		}	
	}
//3:��ȡ�����ļ���˽�з���;
	private static void getConfig() throws IOException{
		InputStream in = readUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(in);
		driver = pro.getProperty("driverClass");
		url=pro.getProperty("url");
		user=pro.getProperty("user");
		password=pro.getProperty("password");
	}
//4:�������ṩ�����ľ�̬��ȡ���Ӷ���ʽ.
	public static Connection getConnection(){
		return con;
	}


	

}
