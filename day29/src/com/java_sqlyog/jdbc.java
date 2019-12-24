package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

/*
 ###04JDBC�Ŀ�������
	* A: JDBC�Ŀ�������
		* a: �������
			1.ע������
				��֪JVMʹ�õ�����һ�����ݿ������
			2.�������
				ʹ��JDBC�е���,��ɶ�MySQL���ݿ������
			3.������ִ��ƽ̨
				ͨ�����Ӷ����ȡ��SQL����ִ���߶���
			4.ִ��sql���
				ʹ��ִ���߶���,�����ݿ�ִ��SQL���
				��ȡ�����ݿ��ִ�к�Ľ��
			5.������
			6.�ͷ���Դ  һ��close()
 * */
public class jdbc {
	public static void main(String[] agrs) throws ClassNotFoundException, SQLException {	
	//1:ע������,---�÷��似��,���������ص��ڴ�(�������Լ�new����)
/*ʹ��java.sql��DriverManage(��������)��ľ�̬����registerDriver(Driver driver)ע�������������.
	���������е�Driver��һ���ӿ�,���е�SQL���ݿ⳧�̶��������ṩ������jar����ʵ������ӿ�,Ȼ����eclipse����jar�������������л���
Driver.class�ļ�,˵����ʵ����Driver�ӿ�,�����ظ��Ƿ���ʶ��,���ԾͿ����ڲ�����new Driver();*/
	//	DriverManager.registerDriver(new Driver());
	/*��ѡ��Driver��f3�鿴���ݿ⳧��д��ԭ���뷢��,�ڼ̳�java.sql.Driver
	���ڷ�����д��һ����̬�����.�ھ�̬�������new Driver(),��֮ǰѧ����̬�����һ�������ڳ���������,��������ļ��ض�ִ��һ��
	������������ڵ����෽����ʱ��ԭ��̬�������Ѿ�new��һ��,����Ҫ�����Լ�new*/
	//��������Ӧ���÷���������Class.forName������ȡ���class����,�������˸���.���о�̬�����ִ��,��new��һ������.
//1:ע������,---�÷��似��,���������ص��ڴ�(�������Լ�new����)
		Class.forName("com.mysql.jdbc.Driver");//ע��,�ֽ����ļ�һ��Ҫдȫ��, ����.����  ��jar���к�Driverԭ���ж��ܿ���
	
/*2:�������,������DriverManager���еľ�̬����,getConnection(String url,String user,String password);�������ӷ���,
	���ص���Connection�ӿڵ�ʵ����,�鿴API�˽ӿ����������ݿ�Ự�ӿ�*/

//������Ӿ��ǻ�ûỰ���ڶ���,		
						  //ע������3306������һ��/    /����������Լ�����׼����java��ʹ�õĿ�
	String url = "jdbc:mysql://localhost:3306/mybase3";//�̶���ʽ�ֱ���,���ݿ��ַ,������ַ,�˿ں�,Ҫʹ�õ��Խ����ݿ���
	String username = "root";	//�û���	(mysql���ӽ���ɼ�)
	String password = "123";		//����     (mysql���ӽ���ɼ�)
      Connection con = DriverManager.getConnection(url, username, password);
      	System.out.println(con);	//���к�û�����н��˵�����ӳɹ�.
	//Run as: com.mysql.jdbc.JDBC4Connection@14f1c67

 //3.������ִ��ƽ̨.ͨ���������Ӷ��� con ����createStatement()����,����һ��ִ��SQL���Ľӿ�Statement����(������mysql����ʵ��)
      	       Statement sta = con.createStatement();
      	       System.out.println(sta);
      	       
 /*4.ִ��sql���.ͨ�����ִ�ж��� sta ����statement�ӿڵ�ʵ�����е�executeUpdate(String sql);����.�÷���������ִ�и���SQL���
   ���ص� ��һ��int ��ʾִ�гɹ�������.(ֻ��ִ�з��ؽ����int�ı���insert intto ���Ӷ����� ,deleteɾ��������,update���¶�����)
   */   	       
      	 int row = sta.executeUpdate("INSERT INTO sort(sname,sprice,sdesc) VALUES ('�ֻ�',999,'����ԭ���')");
      	 	System.out.println(row);	/*������� 1 ��ʾһ��SQL���ִ�гɹ�,��mysql���ݿ���ˢ��,���ܿ���mybase3����
      	 	rost���ݱ���,����һ���� �ֻ� ��Ʒ��¼,��ʾ��eclipse��javaִ�еĽ���ɹ���ʾ��SQL��*/
	
	//5.������ ----�� ɾ �� ,����Ҫ������.
      	 	
   //6.�ͷ���Դ  һ��close() 	 	
      	 	sta.close();
      	 	con.close();
	}
}
