package demo2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils2 {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:ORCLS";
	private static String user = "scott";
	private static String password = "tiger";
	//�ھ�̬������л�ȡע������,��ʾ��һ���ؾ�ִ��һ��
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	//�ṩһ����ȡ���ӵķ���
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		return null;
	}
	
	//�ṩһ���ر���Դ�ķ���
	public static void close(Connection conn,CallableStatement call, ResultSet st){
		if(st != null){
			try {
				st.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally{
	//����Ϊ�յ�ԭ��Java����վ GC���ܴ���Ŀ���,���ڱ���ִ�еĴ������ֶ�����Ϊ�շ�����������		
				st = null; 
			}
		}
		
		
		if(call != null){
			try {
				call.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally{
	
				call = null; 
			}
		}
		
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally{
				conn = null; 
			}
		}
	}
	
}
