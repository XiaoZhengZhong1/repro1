package com.servletssss.login;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;
//����,��ʾ��c3p0���ӳ����ɹ�����.
public class c3p0Utils {
	//1:˽�й������
	private static ComboPooledDataSource datasource = new ComboPooledDataSource();
	//2:�ṩ������ȡ���󷽷�
	public static ComboPooledDataSource getDatasoursce() {
		return datasource;
	}
	//3:�ṩ�������ȡ���ӷ���.�ڷ�����ʹ�õ�����,�����ڱ����ֻ��Ҫ���û�ȡ���ӷ���,���ܻ�ȡ�����ҵ�c3p0�����ļ�,��������
	public static Connection getConnection(){
		try {
			return datasource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
