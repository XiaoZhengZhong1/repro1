package �ܽ���ϰ;

import java.sql.Connection;
import java.sql.DriverManager;
//�ѻ�ȡ���ݿ����Ӷ���,д��һ��������.
public class D2_jdbc_utils {
	private static Connection con;
	static{
		try{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/day28";
		String user = "root";
		String password = "123";
		 con = DriverManager.getConnection(url, user, password);//ע������con����Ҫ���¶�������,�����Ѿ�������.
		 //ע�⹤���಻�ܹ���,��Ȼ���ù������ڼ������ʱ��,�ڻ�ȡ�����Ӷ����ʱ��ͬʱҲ�ر��˶���������õ�����null����
		}catch(Exception e){
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	}
	
	public static Connection getConnection(){
		return con;
	}
	
	

}
