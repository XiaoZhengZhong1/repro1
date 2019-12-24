package DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class Demo3 {
//重新练习一次,写dbcp连接池工具类;
	private static BasicDataSource bds = new BasicDataSource();
	static{
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/mybase3");
		bds.setUsername("root");
		bds.setPassword("123");
		
		bds.setInitialSize(15);
		bds.setMaxActive(10);
		bds.setMinIdle(5);
		bds.setMaxIdle(8);
	}
	
	public static BasicDataSource getBda() {
		return bds;
	}

	

}
