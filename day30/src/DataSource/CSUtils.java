package DataSource;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

public class CSUtils {
/*###25工具类的测试
	* A: 工具类的测试
		* a: 案例代码
			/*
			 *  测试写好的工具类,
			 *  提供的是一个DataSource接口的数据源
			 *  QueryRunner类构造方法,接收DataSource接口的实现类
			 *  后面,调用方法update,query,无需传递他们Connection连接对象*/
private static QueryRunner qr = new QueryRunner(jdbcUtils.getBds());
	public static void main(String[] args) {
		System.out.println(qr);
	//	getinsert();//测试连接池工具类,数据库增方法
		getselect();//测试连接池工具类,数据库查方法
	}
	public static void getinsert(){
		String sql = "INSERT INTO sort VALUES(?,?,?,?)";
		Object[] obj = {11,"鼠标",22,"电脑上用的"};
			try {
				int row = qr.update(sql, obj);
			System.out.println(row);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("数据库连接失败");
			}
	}


	public static void getselect(){
		String sql = "SELECT * FROM sort";
		try {
			List<Object[]> list = qr.query( sql, new ArrayListHandler());
			for (Object[] objects : list) {
				for (Object object : objects) {
					System.out.print(object + "\t");
				}
			System.out.println();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		throw new RuntimeException("数据库连接失败");
		}
	
	
	}
}
