package com.JDBC_junit_before_after;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//������ʾ��resourceBundle���еķ�����ȡ�����ļ�,ʵ�����ݿ�Ĺ���������
public class resourceBundle {
	public static void main(String[] args) throws SQLException {
	//���ù������ȡ����
		Connection con	= jdbcUtils.getCon();
			//�����ȡ����,�Ƿ����ӳɹ�,�����
			System.out.println(con);
		PreparedStatement ps = con.prepareStatement("INSERT INTO zhangwu VALUES (NULL,'���',10000)");
		PreparedStatement ps2 = con.prepareStatement("CREATE TABLE day2(did INT PRIMARY KEY AUTO_INCREMENT,dname VARCHAR(10))");	
		System.out.println(ps2);
		jdbcUtils.close(con, ps);
	}
}
