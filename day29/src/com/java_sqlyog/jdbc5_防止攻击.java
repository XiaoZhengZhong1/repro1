package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jdbc5_防止攻击 {
//用键盘录入登陆姓名和密码,录入的值匹配上数据库的查询语句,查询数据库的记录.
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");					//1:注册驱动
		String url = "jdbc:mysql://localhost:3306/mybase3";		//连接参数变量显示
		String user = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, user, password);	//2:获取连接
		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
				String us = sc.nextLine();		//录入姓名
				String pa = sc.nextLine();		//录入密码
		String sql = "SELECT * FROM users WHERE uname=? and upassword=?";//用?号占位符,占号值的位置.等待录入
	//防止攻击,调用连接会话接口Connection中的prepareStateManat(sql)预编译方法,返回一个预编译接口
		PreparedStatement pst = con.prepareStatement(sql);//3:获取sql语句执行对象.表示用预编译方法编译拼写的sql查询语句
			pst.setObject(1, us);//用预编译接口这的设置指定参数方法,指的是拼写的sql语句中的?号.因为编译的就是sql语句
			pst.setObject(2, pa);//默认是问号编号是1,2,3...表示给定的指是键盘录入的值
		ResultSet rs = pst.executeQuery();//4:表示用预编译接口中的执行查询方法执行查询语句,没有参数.因为上面已经编译过了
		System.out.println(rs.next());	//5:处理结果
			rs.close();//6:关流
			pst.close();
			sc.close();
	
	
	
	}

}
