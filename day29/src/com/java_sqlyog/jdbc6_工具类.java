package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc6_������ {
//����Ŀ��:ʵ��jdbc������,ֱ�ӷ������Ӷ���Connection con(��Ϊע�������ͻ�ȡ���Ӷ����ǹ̶�����),����(��Ҫ��������,һ���н��������)
	private jdbc6_������(){};
	private static Connection con;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mybase2";
			String user = "root";
			String password = "123";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			
			throw new RuntimeException(e + "���ݿ�����ʧ��");
		}
	}
	public static Connection getConnection(){
		return con;
	}
	public static void close(Connection con,Statement sta,ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {}
		}
			if(sta != null){
				try {
					rs.close();
				} catch (SQLException e) {}
			}
				if(con != null){
					try {
						rs.close();
					} catch (SQLException e) {}
			}
	}

	public static void close(Connection con,Statement sta){
		if(sta != null){
			try {
				sta.close();
			} catch (SQLException e) {}
		}
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {}
		}
	}
}
