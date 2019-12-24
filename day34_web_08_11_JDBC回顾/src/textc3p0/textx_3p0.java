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
/*��c3p0jar��,�����Դ�c3p0_config.xml���ݿ����������ļ�.ֻ��Ҫ������ new ComboPooledDataSource();���Զ��ҵ������ļ�����
 * ������һ��������,һ��û������,һ���в�����,Ĭ��ѡû������*/
		ComboPooledDataSource cds = new ComboPooledDataSource();
		try {
			conn = cds.getConnection();
			//System.out.println(conn);
			String sql = "insert into day1 values(null,?)";
			sta = conn.prepareStatement(sql);
			sta.setString(1, "��2");
			int rows = sta.executeUpdate();
			if (rows > 0) {
				System.out.println("��ӳɹ�");
			} else {
				System.out.println("���ʧ��");
			}
		
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			jdbcUtils.close(conn, sta);
		}
	}

}
