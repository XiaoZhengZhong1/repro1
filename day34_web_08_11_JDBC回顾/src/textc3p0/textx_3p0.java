package textc3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;


import org.junit.Test;

import com.JDBC_junit_before_after.jdbcUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class textx_3p0 {
	@Test
	public void text() {
		Connection conn=null;
		PreparedStatement sta=null;
/*用c3p0jar包,里面自带c3p0_config.xml数据库连接配置文件.只需要在类中 new ComboPooledDataSource();会自动找到配置文件连接
 * 有两个一样的连接,一个没参数的,一个有参数的,默认选没参数的*/
		ComboPooledDataSource cds = new ComboPooledDataSource();
		try {
			conn = cds.getConnection();
			//System.out.println(conn);
			String sql = "insert into day1 values(null,?)";
			sta = conn.prepareStatement(sql);
			sta.setString(1, "我2");
			int rows = sta.executeUpdate();
			if (rows > 0) {
				System.out.println("添加成功");
			} else {
				System.out.println("添加失败");
			}
		
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			jdbcUtils.close(conn, sta);
		}
	}

}
