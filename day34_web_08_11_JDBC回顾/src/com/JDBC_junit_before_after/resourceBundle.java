package com.JDBC_junit_before_after;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//本类演示用resourceBundle类中的方法获取配置文件,实现数据库的工具类连接
public class resourceBundle {
	public static void main(String[] args) throws SQLException {
	//调用工具类获取连接
		Connection con	= jdbcUtils.getCon();
			//检验获取连接,是否连接成功,有输出
			System.out.println(con);
		PreparedStatement ps = con.prepareStatement("INSERT INTO zhangwu VALUES (NULL,'外快',10000)");
		PreparedStatement ps2 = con.prepareStatement("CREATE TABLE day2(did INT PRIMARY KEY AUTO_INCREMENT,dname VARCHAR(10))");	
		System.out.println(ps2);
		jdbcUtils.close(con, ps);
	}
}
