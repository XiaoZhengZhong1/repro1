package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class text2_preparedStatement {

	public static void main(String[] args) throws Exception {
//用防止攻击的方式,查询数据表
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mybase3";
		String user = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, user, password);
		String sql = "SELECT * FROM sort";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
		System.out.println(rs.getString("sid") + "  " + rs.getString("sname") + "  " + 
		rs.getString("sprice") + "  " + rs.getString("sdesc"));
		}
		rs.close();
		pst.close();
		con.close();
	}

}
