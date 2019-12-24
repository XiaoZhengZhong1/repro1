package cn.dbcp;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/*����һ�����ӹ�����,��dbcp���е�,ʵ����javax.sql����DataSource�ӿڵ�BasicDataSource��,����һ�����ӳع�����*/
public class jdbcUtils {
	private static BasicDataSource bds = new BasicDataSource();
	static{
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/gjp");
		bds.setUsername("root");
		bds.setPassword("123");
		bds.setInitialSize(25);
		bds.setMaxActive(20);
		bds.setMinIdle(15);
		bds.setMinIdle(2);
	}
	public static DataSource getbds(){
		return bds;
	}
}
