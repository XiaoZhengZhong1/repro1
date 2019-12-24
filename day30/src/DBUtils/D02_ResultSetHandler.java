package DBUtils;

public class D02_ResultSetHandler {
/*###07JavaBean类
	* A: JavaBean类
		* a: 概念
			* JavaBean就是一个类，在开发中常用封装数据。具有如下特性
				1.	需要实现接口：java.io.Serializable ，通常实现接口这步骤省略了，不会影响程序。
				2.	提供私有字段：private 类型 字段名;
				3.	提供getter/setter方法：
				4.	提供无参构造
			
###08DBUtils工具类结果集处理的方式
	* A: DBUtils工具类结果集处理的方式
		* a: QueryRunner实现查询操作
			*	query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params) ，用来完成表数据的查询操作
		* b: ResultSetHandler结果集处理类
			* ArrayHandler	将结果集中的第一条记录封装到一个Object[]数组中，数组中的每一个元素就是这条记录中的每一个字段的值
			* ArrayListHandler	将结果集中的每一条记录都封装到一个Object[]数组中，将这些数组在封装到List集合中。
			* BeanHandler	将结果集中第一条记录封装到一个指定的javaBean中。
			* BeanListHandler	将结果集中每一条记录封装到指定的javaBean中，将这些javaBean在封装到List集合中
			* ColumnListHandler	将结果集中指定的列的字段值，封装到一个List集合中
			* ScalarHandler	它是用于单数据。例如select count(*) from 表操作。
			* MapHandler	将结果集第一行封装到Map集合中,Key 列名, Value 该列数据
			* MapListHandler	将结果集第一行封装到Map集合中,Key 列名, Value 该列数据,Map集合存储到List集合
			* 注意:query方法的返回值都是 <T> 泛型,具体的返回值跟随结果集处理方式变化而变化.
			* 注意:query方法的返回值都是 <T> 泛型,具体的返回值跟随结果集处理方式变化而变化.
			* */
	public static void main(String[] args) {

	}

}
