package demo2;

import java.sql.CallableStatement;
import java.sql.Connection;
import org.junit.Test;

import oracle.jdbc.OracleTypes;

public class testOracle2 {
	
	//本类演示连接Oracle数据库调用pl中的存储函数
	@Test
	public void testOracleFunction(){
		String sql = "{call fun1(?)}";
		Connection conn = null;
		CallableStatement call = null;
		try {
			conn = JDBCUtils2.getConnection();
			call = conn.prepareCall(sql);
			 call.setInt(1,7521);
			System.out.println(sql);
			 call.registerOutParameter(2,OracleTypes.NUMBER);
			 call.execute();
			 double fsal = call.getDouble(2);
			 System.out.println(fsal);
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			JDBCUtils2.close(conn, call, null);
		}
	}





}
