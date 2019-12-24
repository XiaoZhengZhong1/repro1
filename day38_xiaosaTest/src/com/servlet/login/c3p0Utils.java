package com.servlet.login;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;
//����,��ʾ��c3p0���ӳ����ɹ�����.
public class c3p0Utils {
	//�ڱ����װһ��ִ��sql�������Ҫ�����Ӷ���connection con ��װ��һ�������߳���,��Ϊ�߳��ڷ�������Ψһ��(�������⿪��)
	//1:�ȴ���thread����.����̬˽��,
	private static ThreadLocal<Connection> tl = new ThreadLocal<>();
	//2�ṩ������ȡconnection���Ӷ���ķ���
	public static Connection getCurrentConnection() {
		//���߳��л�ȡ����
		Connection conn = tl.get();
		//�ж�conn�����Ƿ�Ϊ��
		if(conn==null){
			//���Ϊ��,�����´�c3p0Utils�л�ȡһ��,�����ð󶨵�tl��
			 conn = getConnection();
			tl.set(conn);
		}
	return conn;
	}
	
	//2:�ṩ�����Ļ�ȡ�������񷽷�
	public static void startTransaction() throws SQLException{
		//��ȡ�����̰߳󶨵����Ӷ���
		Connection conn = getCurrentConnection();
		//�����Զ���������Ϊ��,��ʾ���Զ�����,�����ֶ��ύ
		conn.setAutoCommit(false);
	}
	
	//2:�ṩ�����Ļ�ȡ�ع����񷽷�
	public static void rollback() throws SQLException{
		//��ȡ�����̰߳󶨵����Ӷ���,�ö�����ûع�����
		getCurrentConnection().rollback();
	}
	
	//2:�ṩ�����Ļ�ȡ�ύ���񷽷�
	public static void commit() throws SQLException{
		//��ȡ�����̰߳󶨵����Ӷ���
		Connection conn = getCurrentConnection();
		//�û�ȡ��������ύ���񷽷�
		conn.commit();
		//�����ύ�����Ӷ����Ѿ�����,���Ƴ�����,�黹���ӵ����ӳ�
		tl.remove();
		//�Ƴ���ɹر��߳�
		conn.close();
	}


	
	
	
	
	
	
	
	
	
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
