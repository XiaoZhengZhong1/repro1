/*package demo;
//本连接oracle的连接工具为粘贴,可用 .  JDBCUtil2为自己写的也可用
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils {

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:ORCLS";
	private static String user = "scott";
	private static String password = "tiger";
	
	static{
		//注册驱动
//		DriverManager.registerDriver(driver)
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	 * 运行Java：
	 * java -Xms100M -Xmx200M HelloWorld
	 * 
	 * 技术方向：
	 * 1、性能优化
	 * 2、故障诊断：死锁(JDK: ThreadDump)
	 *               Oracle: 自动处理
	 
	public static void release(Connection conn,CallableStatement st,ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs = null; ///-----> 原因：Java GC: Java的GC不受代码的控制
			}
		}
		if(st != null){
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				st = null;
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






*/





