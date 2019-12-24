package demo;

import java.sql.CallableStatement;
import java.sql.Connection;

import oracle.jdbc.OracleTypes;

import org.junit.Test;

import demo2.JDBCUtils2;
public class TestOracle {
	/*
	 * create or replace procedure por3(eon in number,
                                        p3name out varchar2,
                                          p3sal out number)
  is
begin
  select ename, sal into p3name, p3sal from emp where emp.empno=eon;
  dbms_output.put_line(p3name || p3name );
end por3;

	 * */
//本类演示连接Oracle数据库执行调用plsql中存储过程
	@Test
	public void testOracle() {
		String sql = "{call por3(?,?,?)}";
		Connection conn = null;
		CallableStatement call = null;
		try {
			conn = JDBCUtils2.getConnection();
			call = conn.prepareCall(sql);
			call.setInt(1,7902);
			System.out.println(sql);
			call.registerOutParameter(2,OracleTypes.VARCHAR);
			call.registerOutParameter(3,OracleTypes.NUMBER);
			call.execute();
			String name = call.getString(2);
			double sal = call.getDouble(3);
			System.out.println(name  + ":" + sal );
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			JDBCUtils2.close(conn, call,null);
		}
	}
	
	
	
	
	
	
}
