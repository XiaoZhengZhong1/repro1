package cn.dbcp;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/*创建一个连接工具类,用dbcp包中的,实现了javax.sql包中DataSource接口的BasicDataSource类,创建一个连接池工具类*/
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
