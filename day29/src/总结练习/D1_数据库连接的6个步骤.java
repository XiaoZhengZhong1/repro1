package �ܽ���ϰ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class D1_���ݿ����ӵ�6������ {

	public static void main(String[] args) throws Exception {
//�ܽ���ϰ���ݿ�����
		Class.forName("com.mysql.jdbc.Driver");		//1:ע������.
		String url = "jdbc:mysql://localhost:3306/mybase2";//��ʾ��ֵ
		String user = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, user,password);	//2:��ȡ����,�������ӽӿ�
		System.out.println(con);	//��֤�Ƿ����ӳɹ�
		String sql = "SELECT * FROM u ";	//ƴдsql���.��ѯu��˽�м�¼
		PreparedStatement pst = con.prepareStatement(sql);//3:��ȡSQL���ִ�ж���.(��ֹ������Ԥ����ӿ�),����Ԥ����ӿ�	
		System.out.println(pst);
		ResultSet rs = pst.executeQuery();//4:ִ��SQL���,���ؽ�����ӿ�(��Ԥ����ӿ�preparedStatement�е�ִ�з���)
		while(rs.next()){	//5:������,�������
		System.out.println(rs.getObject("uid") + " " + rs.getObject("uname") + " " + rs.getObject("uaddress"));
		}
		
//����ʾһ�����ݿ����Update
		String sql2 = "UPDATE u SET uname=? WHERE uid=?;";//��?��ռλ��,��ֹ����.��Ԥ��������SetObject()������ֵ
		PreparedStatement pst2 = con.prepareStatement(sql2);
			pst2.setObject(1, "xzz");//��ռλ����ֵ,С������1���ʺñ��,xzz��ֵ
			pst2.setObject(2, 1);
			int rs2 = pst2.executeUpdate();//ע��,��ɾ��,�ķ��ؽ����int��ʾִ�гɹ�������sql���
			System.out.println(rs2);		
		
		rs.close();//6:����
		pst.close();
		con.close();
	}

}
