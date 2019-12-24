package com.自定义连接池代码实现;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.JDBC_junit_before_after.jdbcUtils;
/*演示自定义方法实现连接池功能
 * 1:定义一个类,实现连接池接口,重写所有方法.只用里面的getConnection()方法
 * 2:创建一个静态共享的linkedList集合.
 * 3:写一个静态代码块,在代码块中for循环.在循环中调用连接工具类,就可以循环获取连接对象con,添加到集合中
 * 4:在getConnection()方法里面做if判断集合长度是否=0,如果=0,就再次for循环,在循环中获取连接con,添加到集合中
 * 在循环结束用集合的remove(0)表示移除一个连接,返回连接.再由return把连接返回给getConnection()方法
 * 5:再写一个返回方法,就是把连接查询添加到集合,表示在测试类用完连接后,在调用返回方法把连接返回
 * */
public class linkedlist连接池 implements DataSource {
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
	