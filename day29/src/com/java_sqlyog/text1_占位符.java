package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class text1_占位符 {

	public static void main(String[] args) throws Exception {
//用占位符 ? 演示更新数据库,指定记录信息.
	Class.forName("com.mysql.jdbc.Driver");//1:注册驱动
	String url = "jdbc:mysql://localhost:3306/mybase3";
	String user = "root";
	String password = "123";
	Connection con = DriverManager.getConnection(url, user, password);//2:获取连接
	String sql = "UPDATE sort SET sname=?,sprice=? WHERE sid=?";//拼写SQL更新语句,用?号占位符代替值
	PreparedStatement pst = con.prepareStatement(sql);//3:获取执行sql语句对象,返回预编译接口
		pst.setObject(1, "电饭煲");//根据占位符的编号设置占位符的值
		pst.setObject(2,325);
		pst.setObject(3, 4);
		pst.executeUpdate();//4:执行sql语句.用预编译接口中的执行方法执行sql更新语句
	
		pst.close();//6:关流
		con.close();
	
	}

}
