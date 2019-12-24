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
/*QueryRunner���,���ݲ�ѯ����.
 * ������query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params)����
 * ResultSetHandler��һ�����������Ľӿ�,��������Ҫ���ǽӿڵ�ʵ����.���Ǿ����8����.
1:ArrayHandler	��������еĵ�һ����¼��װ��һ��Object[]�����У������е�ÿһ��Ԫ�ؾ���������¼�е�ÿһ���ֶε�ֵ
2: ArrayListHandler	��������е�ÿһ����¼����װ��һ��Object[]�����У�����Щ�����ڷ�װ��List�����С�
3: BeanHandler	��������е�һ����¼��װ��һ��ָ����javaBean�С�
4:BeanListHandler	���������ÿһ����¼��װ��ָ����javaBean�У�����ЩjavaBean�ڷ�װ��List������
5:ColumnListHandler	���������ָ�����е��ֶ�ֵ����װ��һ��List������
6:ScalarHandler	�������ڵ����ݡ�����select count(*) from �������
7:MapHandler	���������һ�з�װ��Map������,Key ����, Value ��������
`
 * Object...params�ɱ����.�Ǹ�SQL��� ? ռλ����ֵ�õ�.
 * ע��:query�����ķ���ֵ���� <T> ����,����ķ���ֵ������������ʽ�仯���仯.
 * */
	public static void main(String[] args) throws SQLException {
		//arrayhandler();//��ʽ1
		// arrayListHandler();//��ʽ2
		//	beanHandler();//��ʽ3
		//	beanListHandler();//��ʽ4,�������÷�ʽ
		//	columnListHandler();//��ʽ5
		//	scalarHandler();//��ʽ6
		//	mapHandler();
		mapListHandler();
	}
	private static Connection con = Config_Utils.getConnection();//˽�����ݿ����Ӷ���,��ʾֻ���ڱ���ʹ��.

//1:ArrayHandler��������еĵ�һ����¼��װ��һ��Object[]�����У������е�ÿһ��Ԫ�ؾ���������¼�е�ÿһ���ֶε�ֵ
	public static void arrayhandler() throws SQLException{
		QueryRunner qr = new QueryRunner();//������ѯ��
		String sql = "SELECT * FROM sort";	
		 Object[] result = qr.query(con, sql,  new ArrayHandler());//���ò�ѯ����,��ѯ����.���ز����еĽṹ��������
		 for (Object obj : result) {
			System.out.print(obj + ", ");//1, �ֵ�Ͳ, 5.0, ��̯��, (��һ����¼��װ��һ��Object[]������)
		
		 }


	}

	
//2:ArrayListHandler	��������е�ÿһ����¼����װ��һ��Object[]�����У�����Щ�����ڷ�װ��List�����С�
	public static void arrayListHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";
		List<Object[]> list = qr.query(con, sql, new ArrayListHandler());/*ע��:���Ȱ�ÿһ����¼װ������(����ÿ
		����¼�������еļ�¼),��װ��list����.���Է��͵����;�������,��Ϊ��¼����װ����������.*/
		for (Object[] objects : list) {//forѭ��,��ѭ������������
			for (Object obj : objects) {//��ѭ����������¼
				System.out.print(obj + "  ");
			}
			System.out.println();//����.
		}
	}
	


//3: BeanHandler	��������е�һ����¼��װ��һ��ָ����javaBean�С�
/*JavaBean����һ���࣬�ڿ����г��÷�װ���ݡ�������������
				1.	��Ҫʵ�ֽӿڣ�java.io.Serializable ��ͨ��ʵ�ֽӿ��ⲽ��ʡ���ˣ�����Ӱ�����
				2.	�ṩ˽���ֶΣ�private ���� �ֶ���;
				3.	�ṩgetter/setter������
				4.	�ṩ�޲ι���*/
	public static void beanHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";
		Sort s = qr.query(con, sql, new BeanHandler<Sort>(Sort.class));/*ע��:����ʹ�õ�bean��,��ʵ��������Ҫ����
		һ��������sql����еı���Ҫһ��(һ��Ҫ,����ĸ��Сд�����ֱ����в�ѯ����б���)����˽���ֶα���Ҫ�ͱ�������һ��.�ڲ����д�����
		��class����,(ϵͳ�����,������class����,�ҵ���ͬ�ֶε����ݿ�ĵ�һ�м�¼,��Ϊ���ݿ��jar��Ҳ��Java��),bean����һ��Ҫ��
		�ղι����get����.
		*/
		System.out.print(s + "  ");
	}

	
//�ص�����BeanListHandler��ʽ.��������.
//	4:BeanListHandler	���������ÿһ����¼��װ��ָ����javaBean�У�����ЩjavaBean�ڷ�װ��List������
	public static void beanListHandler() throws SQLException{
	QueryRunner qr = new QueryRunner();
	String sql = "SELECT * FROM sort";
	List<Sort> list = qr.query(con, sql, new BeanListHandler<Sort>(Sort.class));
	for (Sort sort : list) {//��Ϊlist������,ÿ��bean���еĳ�Ա����,����һ��sql��¼,����������д��to String����,����ֱ�����
		System.out.println(sort);
	}
	}



//5:ColumnListHandler���������ָ�����е��ֶ�ֵ����װ��һ��List������
	public static void columnListHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";//ע��:���ڽ�������Ĳ����д���ָ����,��������sql���
		List<Object> list = qr.query(con, sql, new ColumnListHandler<Object>("sname"));
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

//6:ScalarHandler�������ڵ����ݡ�����select count(*) from ������������� ɾ �� ���صĶ���һ�����.
	public static void scalarHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT COUNT(*) FROM sort";
		long count = qr.query(con, sql, new ScalarHandler<Long>());//ע�ⷺ���е�LongҪ�ô�д�ͷ���ֵlong����
		System.out.println(count);
	}



/*7:MapHandler	���������һ�з�װ��Map������,Key ����, Value ��������,��ΪMap������key��Ψһ��,��������Ҳ�ǲ����ظ���,*/
	public static void mapHandler() throws SQLException{
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT * FROM sort";
		Map<String, Object> map = qr.query(con, sql, new MapHandler());
		for (String  key : map.keySet()) {
			System.out.print(key + " " + map.get(key));
		}
	}

//8:MapListHandler	���������һ�з�װ��Map������,Key ����, Value ��������,Map���ϴ洢��List����
	public static void mapListHandler() throws SQLException{
	QueryRunner qr = new QueryRunner();
	String sql = "SELECT * FROM sort";
	List<Map<String, Object> > list = qr.query(con, sql, new MapListHandler());
	for(Map<String, Object> map : list ){
	System.out.println(map.getClass());	/*����Ϊ�˲鿴Դ�����������������Ľ��,Ϊʲô�Ǵ��������,��ӡmap���ֽ�������,
	��������������.����jar�����в���,���ֵײ��Ǽ̳���linkedList*/	
	for (String  key : map.keySet()) {
		System.out.print(key + " " + map.get(key));
	}
	System.out.println();
	}
}




}
