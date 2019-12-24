/*package demo;
//������oracle�����ӹ���Ϊճ��,���� .  JDBCUtil2Ϊ�Լ�д��Ҳ����
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
		//ע������
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

	
	 * ����Java��
	 * java -Xms100M -Xmx200M HelloWorld
	 * 
	 * ��������
	 * 1�������Ż�
	 * 2��������ϣ�����(JDK: ThreadDump)
	 *               Oracle: �Զ�����
	 
	public static void release(Connection conn,CallableStatement st,ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs = null; ///-----> ԭ��Java GC: Java��GC���ܴ���Ŀ���
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





