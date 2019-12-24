package �ܽ���ϰ;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;


public class D4_readConfig {
//��ȡ�����ļ�.
	public static void main(String[] args) throws Exception {
	 InputStream is = D4_readConfig.class.getClassLoader().getResourceAsStream("DBP");/*1:�ñ���������class
		�������Class���еĻ�ȡ����������.���ü������еĻ�ȡ��Դ������,�ڲ����д����ַ��������ļ���*/
		Properties pt = new Properties();	//2:�����������Լ�
				pt.load(is);				//3:�����Լ����м��ط���,���ļ���Դ�����ص�����
		String dri = pt.getProperty("dri");//4:�ü����л�ȡ���м���Ӧֵ�ķ���,������SQL���ӱ�����ֵ
		String url = pt.getProperty("url");
		String user = pt.getProperty("user");
		String pas = pt.getProperty("pas");
		Class.forName(dri);					//5:��ȡ����,���������Լ��ϴ������ļ���Դ���л�ȡ��ֵ
		Connection con = DriverManager.getConnection(url, user, pas);//6:��ȡ���Ӷ���,�����������ļ��л�ȡ��.
			System.out.println(con);								//7:����н��֤�������ļ���ȡ�ɹ�
			
	//��ȡSQL���ִ�ж���,ִ��sql���
		PreparedStatement pst = con.prepareStatement("SELECT sname FROM student;");
		ResultSet rs = pst.executeQuery();	
		while(rs.next()){
			System.out.println(rs.getObject("sname"));
		}	
		rs.close();
		pst.close();
		con.close();
	}
	
}
