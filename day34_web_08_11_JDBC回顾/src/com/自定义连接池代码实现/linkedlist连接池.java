package com.�Զ������ӳش���ʵ��;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.JDBC_junit_before_after.jdbcUtils;
/*��ʾ�Զ��巽��ʵ�����ӳع���
 * 1:����һ����,ʵ�����ӳؽӿ�,��д���з���.ֻ�������getConnection()����
 * 2:����һ����̬�����linkedList����.
 * 3:дһ����̬�����,�ڴ������forѭ��.��ѭ���е������ӹ�����,�Ϳ���ѭ����ȡ���Ӷ���con,��ӵ�������
 * 4:��getConnection()����������if�жϼ��ϳ����Ƿ�=0,���=0,���ٴ�forѭ��,��ѭ���л�ȡ����con,��ӵ�������
 * ��ѭ�������ü��ϵ�remove(0)��ʾ�Ƴ�һ������,��������.����return�����ӷ��ظ�getConnection()����
 * 5:��дһ�����ط���,���ǰ����Ӳ�ѯ��ӵ�����,��ʾ�ڲ������������Ӻ�,�ڵ��÷��ط��������ӷ���
 * */
public class linkedlist���ӳ� implements DataSource {
	private static LinkedList<Connection> pool = new LinkedList<>();
	static{
		for (int i = 0; i < 5; i++) {
			Connection	conn = jdbcUtils.getCon();
			pool.add(conn);
	}
 }
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn;
		if(pool.size()==0){
			for (int i = 0; i < 5; i++) {
					conn =jdbcUtils.getCon();
				pool.add(conn);
		}
			
	}
		conn = pool.remove(0);
		return conn;
	}
		public void backCon(Connection conn){
		pool.add(conn);
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		
		return false;
	}
	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		
		return null;
	}
}
	