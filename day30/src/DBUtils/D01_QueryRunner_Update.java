package DBUtils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

public class D01_QueryRunner_Update {
/*###03QueryRunner类的update方法介绍
a: 方法介绍
使用QueryRunner类的update(Connection conn, String sql, Object... params)用来完成表数据的增加、删除、更新操作
	*  Object...param 可变参数,Object类型,SQL语句会出现?占位符
	*  数据库连接对象,自定义的工具类传递*/
	
	
	
	private static Connection con = Config_Utils.getConnection();/*把从配置文件工具类中获取的数据库连接对象con封装
	成私有的共享的成员变量,表示只能在本类使用*/
	public static void main(String[] args) throws SQLException {
		//insert();
		//update();
		delete();
	}
//DBUtiles工具包中的第一核心类QueryRunner

//演示增加insert into
//用新导入的SQL工具包dbutils中的QueryRunner类中的Update(Connection conn, String sql, Object... params)方法,实现增加
	public static void insert() throws SQLException{
		//1:创建QueryRunner类对象
		QueryRunner qr = new QueryRunner();
		//2:拼写sql增加语句insert into
		String sql = "INSERT INTO sort(sname,sprice,sdesc)VALUES(?,?,?)";
		//3:定义Object数组,储存 ? 参数的值
		Object[] params = {"水杯",9.9,"促销"};
		//4:调用QueryRunner类中的update方法
		int row = qr.update(con, sql, params);
		System.out.println(row);
		//5:调用DbUtils类中的closeQuery安静关流方法;
		DbUtils.closeQuietly(con); //DBUtils包中的第二个核心类DbUtils
		}


	
//演示删除方法delete
	public static void delete() throws SQLException{
		//1:创建QueryRunner类对象
	QueryRunner qr = new QueryRunner();
	//2:拼写sql增加语句insert into
	String sql = "DELETE FROM sort where sid=?";
	//4:调用QueryRunner类中的update方法
	 int row = qr.update(con, sql, 1);
	System.out.println(row);
	DbUtils.closeQuietly(con);
	}
	
	
	
//演示更新 update
	public static void update() throws SQLException{
		//1:创建QueryRunner类对象
		QueryRunner qr = new QueryRunner();
		//2:拼写sql更新语句 update
		String sql = "UPDATE sort SET sname=?,sprice=? WHERE sid=?";
		//3:定义Object数组,储存 ? 参数的值
		Object[] params = {"小马虾",25,1};
		//4:调用QueryRunner类中的update方法
		int row = qr.update(con, sql, params);
		System.out.println(row);
		//5:调用DbUtils类中的closeQuery安静关流方法;
		DbUtils.closeQuietly(con);;
	}

}
