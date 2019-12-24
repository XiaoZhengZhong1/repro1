package DataSource;

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

import DBUtils.Sort;

public class demo4 {//ע����������һ��ֻ�ܲ���һ������.
//�������ӳع�����.�������ڴ���һ��˽��DBUtils���е�QueryRunner����,�ڲ����д������ӳع�����.
	private static QueryRunner qr = new QueryRunner(jdbcUtils.getBds());
	public static void main(String[] args) throws SQLException {
		//getinsert();
		// getdelete();
		//	getalter();
		// getselect1();
		// getselect2();
		//getselect3();  
		//getselect4();
		//getselect5();
		 //getselect6();
		//getselect7();
		getselect8();
	}
	
 //sql�е� �� insert into  ���,	
	public static void getinsert(){
		String sql = "INSERT INTO sort (sname,sprice,sdesc)VALUES(?,?,?)";
		Object[] obj = {"�㽶",3.5,"����ˮ��"};
		int row;
		try {
			row = qr.update(sql, obj);
			System.out.println(row);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}


//ɾ delete
	public static void getdelete(){
		String sql = "DELETE  FROM sort WHERE sid=?";
		Object[] obj = {12};
		try {
			int row = qr.update(sql, obj);
			System.out.println(row);
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException("���ݿ�����ʧ��");
		}
		
	}
	
	
//�� alter
	public static void getalter(){
		String sql = "ALTER TABLE sort add a varchar(?)";
		Object[] obj = {10};
		try {
			int row = qr.update(sql, obj);
			System.out.println(row);
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	}

//�� select		��ʾ8�д����ѯ����ķ�ʽ.
	public static void getselect1(){//��ʽ1:ArrayHandler
		String sql = "SELECT * FROM sort";
		try {
		Object[] obj = qr.query(sql,new ArrayHandler());
			for (Object object : obj) {
				System.out.print(object + "\t");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	}
	public static void getselect2(){//��ʽ2:ArrayListHandler
		String sql = "SELECT * FROM sort";
		try {
			List<Object[]> list = qr.query(sql, new ArrayListHandler());
			for (Object[] objects : list) {
				for (Object object : objects) {
					System.out.print(object + "\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	
	
	}

	public static void getselect3(){//��ʽ3:BeanHandler
		String sql = "SELECT * FROM sort";
		try {
			Sort s = qr.query(sql, new BeanHandler<Sort>(Sort.class));
			System.out.println(s);
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	}
	
	public static void getselect4(){//��ʽ4:��������
		String sql = "SELECT * FROM sort";
		try {
		List<Sort> list = qr.query(sql, new BeanListHandler<>(Sort.class));
			for (Sort sort : list) {
				System.out.println(sort);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new RuntimeException("���ݿ�����ʧ��");
		}
	}

	
	public static void getselect5(){//��ʽ5:ColumnListHandler ���������ָ����,���浽������.
	String sql = "SELECT * FROM sort";
	try {
		List<Object> list = qr.query(sql, new ColumnListHandler<>("sname"));
			for (Object object : list) {
				System.out.print(object+"\t");
				System.out.println();
			}
			
	} catch (SQLException e) {
		
		e.printStackTrace();
		throw new RuntimeException("���ݿ�����ʧ��");	
	}
	}


	public static void getselect6() throws SQLException{//6:ScalarHandler.��ѯֻ��һ�������
		String sql = "SELECT COUNT(*) FROM sort";//ע��,����sql���һ��Ҫ��ֻ��һ�������.������ѯ���м�¼����
		long count = qr.query(sql, new ScalarHandler<Long>());
			System.out.println(count);
		}

	public static void getselect7() throws SQLException{//7:ScalarHandler
		String sql = "SELECT * FROM sort";
		Map<String, Object> map =  qr.query(sql, new MapHandler());
		for (String  key: map.keySet()) {
			System.out.println(key + "  " + map.get(key) );
		}
	
	}
	public static void getselect8() throws SQLException{//8:MapListHandler
		String sql = "SELECT * FROM sort";
		 List<Map<String,Object>> list = qr.query(sql, new MapListHandler());
		 for (Map<String, Object> map : list) {
			for (String key : map.keySet()) {
				System.out.print(key +  "=" +  map.get(key) + "\t");
			}
		System.out.println();
		 }
	
	}
}
