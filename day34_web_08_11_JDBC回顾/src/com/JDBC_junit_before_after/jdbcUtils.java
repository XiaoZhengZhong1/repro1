package com.JDBC_junit_before_after;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

//��ResourceBundle���еķ���,ʵ�ֶ�ȡ�����ļ�ʵ��jdbc���ӵĹ�����
public class jdbcUtils {
	//1:˽�й��췽��,���������ഴ���������,ֻ�ܱ������������
	private jdbcUtils() {
		super();
		
	}
	
//2:�������Ӷ��󲢾�̬˽��,�����ṩ�������ʷ�ʽ.����jdbc���Ӳ���,����ɾ�̬˽��.��Ϊ��ȡ�͹�����Ҫ�õ�����,��̬˽�б��඼����
	private static Connection con;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	//3:�ṩһ����ȡ����
	public static Connection getCon() {
		try {
			Class.forName(driver);
		con	= DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new RuntimeException(e + "���ݿ�����ʧ��" );
		}
		return con;
	}

	//4:дһ����̬�����,�ڴ�����ж�ȡ�����ļ���ȡ����,��Ϊ��̬������������ļ���ִ��һ��,�ʺ�ע������
	static{
				//ע��ResourceBundle.getBundle("34");��ȡ��ʱ�������ļ�34.properties����Ҫ��׺��properties
		ResourceBundle bundle = ResourceBundle.getBundle("34");
		driver = bundle.getString("driver");
		url = bundle.getString("url");
		user = bundle.getString("user");
		password = bundle.getString("password");
	}
	
	//5:д�����رշ���,һ���н������,��ѯʱ��Ҫ�ر���,һ��û�н��������ɾ�ĵ�ʱ����
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
