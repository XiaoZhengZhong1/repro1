package �ܽ���ϰ;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

//��ϰ.дһ����ȡ�����ļ��Ĺ�����.
public class D5_Config_Utils {
	public static void main(String[] args) {
		//System.out.println(con);
	}
	private static Connection con;
	static{/*�ھ�̬�������1:��ȡ�����ļ�,2:����һ�����Լ�����,3:���ļ���Դ�� ���ص����Լ���,4:��ȡ���Լ��еļ���Ӧ��ֵ,����ֵ��������
			����,5:�ô�������Դ�л�ȡ��ֵ,ע������.6:�ô���Դ���л�ȡ��ֵ,��ȡ���Ӷ���*/
		try{
		InputStream is = D5_Config_Utils.class.getClassLoader().getResourceAsStream("DBP");
		Properties pt = new Properties();
		pt.load(is);
		String dri = pt.getProperty("dri");
		String url = pt.getProperty("url");
		String user = pt.getProperty("user");
		String pas = pt.getProperty("pas");
		Class.forName(dri);
		con = DriverManager.getConnection(url, user, pas);
		}catch(Exception e){
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	}
	public static Connection getConnection(){
		return con;
	}
	}
