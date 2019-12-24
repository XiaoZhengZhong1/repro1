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
	//在静态代码块中获取注册驱动,表示类一加载就执行一次
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	//提供一个获取连接的方法
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		return null;
	}
	
	//提供一个关闭资源的方法
	public static void close(Connection conn,CallableStatement call, ResultSet st){
		if(st != null){
			try {
				st.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally{
	//设置为空的原因：Java回收站 GC不受代码的控制,放在必须执行的代码中手动设置为空方便垃圾回收		
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
