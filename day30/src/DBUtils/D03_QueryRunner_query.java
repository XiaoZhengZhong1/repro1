package DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class D03_QueryRunner_query {
/*QueryRunner类的,数据查询操作.
 * 用类中query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params)方法
 * ResultSetHandler是一个处理结果集的接口,参数中需要的是接口的实现类.就是具体的8个类.
1:ArrayHandler	将结果集中的第一条记录封装到一个Object[]数组中，数组中的每一个元素就是这条记录中的每一个字段的值
2: ArrayListHandler	将结果集中的每一条记录都封装到一个Object[]数组中，将这些数组在封装到List集合中。
3: BeanHandler	将结果集中第一条记录封装到一个指定的javaBean中。
4:BeanListHandler	将结果集中每一条记录封装到指定的javaBean中，将这些javaBean在封装到List集合中
5:ColumnListHandler	将结果集中指定的列的字段值，封装到一个List集合中
6:ScalarHandler	它是用于单数据。例如select count(*) from 表操作。
7:MapHandler	将结果集第一行封装到Map集合中,Key 列名, Value 该列数据
`
 * Object...params可变参数.是给SQL语句 ? 占位符赋值用的.
 * 注意:query方法的返回值都是 <T> 泛型,具体的返回值跟随结果集处理方式变化而变化.
 * */
	public static void main(String[] args) throws SQLException {
		//arrayhandler();//方式1
		// arrayListHandler();//方式2
		//	beanHandler();//方式3
		//	beanListHandler();//方式4,开发常用方式
		//	columnListHandler();//方式5
		//	scalarHandler();//方式6
		//	mapHandler();
		mapListHandler();
	}
	private static Connection con = Config_Utils.getConnection();//私有数据库连接对象,表示只能在本类使用.

//1:ArrayHandler将结果集中的第一条记录封装到一个Object[]数组中，数组中的每一个元素就是这条记录中的每一个字段的值
	public static void arrayhandler() throws SQLException{
		QueryRunner qr = new QueryRunner();//创建查询类
		String sql = "SELECT * FROM sort";	
		 Object[] result = qr.query(con, sql,  new ArrayHandler());//调用查询类中,查询方法.返回参数中的结构处理类型
		 for (Object obj : result) {
			System.out.print(obj + ", ");//1, 手电筒, 5.0, 地摊货, (第一条记录封装到一个Object[]数组中)
		
		 }


	}

	
//2:ArrayListHandler	将结果集中的每一条记录都封装到一个Object[]数组中，将这些数组在封装到List集合中。
	public static void arrayListHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";
		List<Object[]> list = qr.query(con, sql, new ArrayListHandler());/*注意:是先把每一条记录装到数组(就是每
		条记录的所有列的记录),再装到list集合.所以泛型的类型就是数组,因为记录被封装成数组类型.*/
		for (Object[] objects : list) {//for循环,外循环遍历出数组
			for (Object obj : objects) {//内循环遍历出记录
				System.out.print(obj + "  ");
			}
			System.out.println();//换行.
		}
	}
	


//3: BeanHandler	将结果集中第一条记录封装到一个指定的javaBean中。
/*JavaBean就是一个类，在开发中常用封装数据。具有如下特性
				1.	需要实现接口：java.io.Serializable ，通常实现接口这步骤省略了，不会影响程序。
				2.	提供私有字段：private 类型 字段名;
				3.	提供getter/setter方法：
				4.	提供无参构造*/
	public static void beanHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";
		Sort s = qr.query(con, sql, new BeanHandler<Sort>(Sort.class));/*注意:这里使用的bean类,其实就是我们要创建
		一个类名和sql语句中的表名要一样(一定要,首字母大小写来区分本类中查询语句中表名)类中私有字段必须要和表中列名一样.在参数中传入类
		的class对象,(系统会根据,参数中class对象,找到相同字段的数据库的第一行记录,因为数据库的jar包也在Java中),bean类中一定要有
		空参构造和get方法.
		*/
		System.out.print(s + "  ");
	}

	
//重点掌握BeanListHandler方式.开发常用.
//	4:BeanListHandler	将结果集中每一条记录封装到指定的javaBean中，将这些javaBean在封装到List集合中
	public static void beanListHandler() throws SQLException{
	QueryRunner qr = new QueryRunner();
	String sql = "SELECT * FROM sort";
	List<Sort> list = qr.query(con, sql, new BeanListHandler<Sort>(Sort.class));
	for (Sort sort : list) {//因为list集合中,每个bean类中的成员变量,就是一条sql记录,而且类中重写了to String方法,可以直接输出
		System.out.println(sort);
	}
	}



//5:ColumnListHandler将结果集中指定的列的字段值，封装到一个List集合中
	public static void columnListHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";//注意:是在结果处理集的参数中传入指定列,而不是在sql语句
		List<Object> list = qr.query(con, sql, new ColumnListHandler<Object>("sname"));
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

//6:ScalarHandler它是用于单数据。例如select count(*) from 表操作。用于增 删 改 返回的都是一个结果.
	public static void scalarHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT COUNT(*) FROM sort";
		long count = qr.query(con, sql, new ScalarHandler<Long>());//注意泛型中的Long要用大写和返回值long区分
		System.out.println(count);
	}



/*7:MapHandler	将结果集第一行封装到Map集合中,Key 列名, Value 该列数据,因为Map集合中key是唯一的,表中列名也是不会重复的,*/
	public static void mapHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";
		Map<String, Object> map = qr.query(con, sql, new MapHandler());
		for (String  key : map.keySet()) {
			System.out.print(key + " " + map.get(key));
		}
	}

//8:MapListHandler	将结果集第一行封装到Map集合中,Key 列名, Value 该列数据,Map集合存储到List集合
	public static void mapListHandler() throws SQLException{
	QueryRunner qr = new QueryRunner();
	String sql = "SELECT * FROM sort";
	List<Map<String, Object> > list = qr.query(con, sql, new MapListHandler());
	for(Map<String, Object> map : list ){
	System.out.println(map.getClass());	/*此行为了查看源码解释下面最终输出的结果,为什么是储存有序的,打印map的字节码名称,
	包含包名和类名.再在jar包中中查找,发现底层是继承了linkedList*/	
	for (String  key : map.keySet()) {
		System.out.print(key + " " + map.get(key));
	}
	System.out.println();
	}
}




}
