package com.servlet.login;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;
//本类,演示把c3p0连接池做成工具类.
public class c3p0Utils {
	//在本类封装一个执行sql语句是需要的连接对象connection con 封装到一个本地线程中,因为线程在访问中是唯一的(除非另外开启)
	//1:先创建thread对象.并静态私有,
	private static ThreadLocal<Connection> tl = new ThreadLocal<>();
	//2提供公共获取connection连接对象的方法
	public static Connection getCurrentConnection() {
		//从线程中获取连接
		Connection conn = tl.get();
		//判断conn连接是否为空
		if(conn==null){
			//如果为空,就重新从c3p0Utils中获取一个,并设置绑定到tl中
			 conn = getConnection();
			tl.set(conn);
		}
	return conn;
	}
	
	//2:提供公共的获取开启事务方法
	public static void startTransaction() throws SQLException{
		//获取本地线程绑定的连接对象
		Connection conn = getCurrentConnection();
		//设置自动开启事务为否,表示不自动开启,而是手动提交
		conn.setAutoCommit(false);
	}
	
	//2:提供公共的获取回滚事务方法
	public static void rollback() throws SQLException{
		//获取本地线程绑定的连接对象,用对象调用回滚方法
		getCurrentConnection().rollback();
	}
	
	//2:提供公共的获取提交事务方法
	public static void commit() throws SQLException{
		//获取本地线程绑定的连接对象
		Connection conn = getCurrentConnection();
		//用获取对象调用提交事务方法
		conn.commit();
		//事务提交后连接对象已经用完,用移除方法,归还连接到连接池
		tl.remove();
		//移除后可关闭线程
		conn.close();
	}


	
	
	
	
	
	
	
	
	
	//1:私有共享对象
	private static ComboPooledDataSource datasource = new ComboPooledDataSource();
	//2:提供公共获取对象方法
	public static ComboPooledDataSource getDatasoursce() {
		return datasource;
	}
	//3:提供类名点获取连接方法.在方法中使用到对象,所有在别的类只需要调用获取连接方法,就能获取对象找到c3p0配置文件,返回连接
	public static Connection getConnection(){
		try {
			return datasource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
