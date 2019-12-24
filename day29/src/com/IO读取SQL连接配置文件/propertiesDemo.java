package com.IO��ȡSQL���������ļ�;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*ע���ȡ������������Ϣ�������ļ�һ�㶼����src�д���file
 * properties��һ���־õ����Լ�.�൱����һ������
 * 1:����database.properties�����ļ�,��IO(�����ñ������ֽ���class����propertiesDemo.class����Class����getClassLoader()
 * ��ȡ����������,�ٵ��ü�������getResourceAsStream("database.properties")��ȡ�ļ�·������Դ�ķ���,��ȡ�����������ļ�����Ϣ)
 * ����ȡ�����ļ��еļ�ֵ��,���浽����.
 * 2:�Ӽ���(ָ����new properties()),
 * 3:�Լ�ֵ�Է�ʽ��ȡ���ݿ�������Ϣpro.load(Is);
 * 4:�����Լ�����pro.getProperty()����,��ȡ���Լ�����ָ����(ָ�����ļ��ڵļ�)��Ӧ��ֵ,��ֵ����������������Ϣ
 * 5:�ڱ������ע������(�û�ȡ���������ļ��еİ���.�������ֽ������)
 * 6:������ݿ�����
 *
 */
public class propertiesDemo {
	public static void main(String[] args) throws IOException, Exception {
	InputStream Is = propertiesDemo.class.getClassLoader().getResourceAsStream("database.properties");//1
		Properties pro = new Properties();//2
					pro.load(Is);//3
					String DriverClass = pro.getProperty("driverClass");//4
					String url = pro.getProperty("url");
					String user = pro.getProperty("user");
					String password = pro.getProperty("password");
					Class.forName(DriverClass);//5
	Connection con = DriverManager.getConnection(url, user, password);//6
	System.out.println(con);
	}
	
}
