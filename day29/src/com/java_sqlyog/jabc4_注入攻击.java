package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jabc4_注入攻击 {
/*
 * ###11SQL注入攻击
	* A: SQL注入攻击
		* a: 注入问题
			* 假设有登录案例SQL语句如下:
			* SELECT * FROM 用户表 WHERE NAME = 用户输入的用户名  AND PASSWORD = 用户输的密码;
			* 此时，当用户输入正确的账号与密码后，查询到了信息则让用户登录。
				但是当用户输入的账号为XXX 密码为：XXX’  OR ‘a’ =’a时，则真正执行的代码变为：
				* SELECT * FROM 用户表 WHERE NAME = ‘XXX’ AND PASSWORD =’ XXX’  OR ’a’=’a’;
			* 此时，上述查询语句时永远可以查询出结果的。那么用户就直接登录成功了，显然我们不希望看到这样的结果，这便是SQL注入问题。
 * */
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");					//注册驱动
	String url = "jdbc:mysql://localhost:3306/mybase3";		//连接声明
	String user = "root";
	String password = "123";
	Connection con = DriverManager.getConnection(url, user, password);	//获取连接
	 Statement sta = con.createStatement();								//获取sql语句执行对象
	
	 
	 //拼写sql查询语句,模拟正常登陆
//	 String sql = "SELECT * FROM users WHERE uname='肖磊' AND upassword='1'";
	//拼写sql语句模拟注入攻击
	 String sql2 = "SELECT * FROM users WHERE uname='asdf' AND upassword='1234' OR 1=1";
//	 ResultSet rs = sta.executeQuery(sql);
	ResultSet rs = sta.executeQuery(sql2); 	//上面拼写是sql2语句,姓名和密码都不对,注入攻击后,依然可以登陆成功
	System.out.println(rs.next());          //表示输出执行查询语句的结果,是true说明登陆成功
	    rs.close();
		sta.close();
		con.close();
	}

}
