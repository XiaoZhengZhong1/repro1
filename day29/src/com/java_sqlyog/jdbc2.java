package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc2 {

	public static void main(String[] args) throws Exception {
/*
 * ###10ִ��select����ȡ�����
	* A: ִ��select����ȡ�����
 * */
	//1:ע������
		Class.forName("com.mysql.jdbc.Driver");
	//2:��ȡ���Ӷ���(����connetion�Ự�ӿ�)
		String url = "jdbc:mysql://localhost:3306/mybase3";
		String username = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, username, password);
	//3:��ȡ���ִ�ж���(�ûỰ�ӿ�ʵ������,���ô���ִ��SQL���ķ���,����һ��ִ��SQL���ӿ�)
					Statement sta = con.createStatement();
	//ƴд��ѯ���selsct,����ִ��(�������SQL�б�д,�ڸ��ƹ���,��ΪSQL�д���ؼ����Զ�ת��д)
	String sql = "SELECT * FROM sort";	//��Ϊִ�ж���ķ���������(String sql)
	//4:ִ��SQL���.(ִ��SQL��ѯ���,����һ��������ӿ�ResultSet)
				ResultSet rs = sta.executeQuery(sql);
	//������������� rs �ý�����ӿ�ResulSet�еķ���(ע������ӿ�,�϶��Ѿ���SQL����ʵ����,����ֱ���÷��ض������)next()��getxxx()
		while(rs.next()){
			System.out.println(rs.getInt("sid") + "  " + rs.getString("sname") + "   " + 
								rs.getDouble("sprice") + "   " + rs.getNString("sdesc"));
				}
			rs.close();
			con.close();
			sta.close();
	}

}
