package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc3 {

	public static void main(String[] args) throws Exception {

	Class.forName("com.mysql.jdbc.Driver");			//1:ע����������
	
	String url = "jdbc:mysql://localhost:3306/mybase3";
	String user = "root";
	String password = "123";
	Connection con = DriverManager.getConnection(url, user, password);	//2:��ȡ����
	
	 Statement sta = con.createStatement();			//3:��ȡִ��������
	
	String sql = "SELECT * FROM zhangwu";			//ƴд��ѯ���
	// ���ݿ����� ���Ĳ�--���ݱ��ѯ    ���岽--�۸���
	ResultSet rs = sta.executeQuery(sql);			//4:ִ��SQL��ѯ���,����һ��������ӿ�
	
	while(rs.next()){								//5:������
		System.out.println(rs.getInt("id") + "  " + rs.getString("zname") + "  " + rs.getDouble("money"));
	}
	
	rs.close();
	sta.close();
	con.close();
	}

}
