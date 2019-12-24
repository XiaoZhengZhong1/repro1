package DataSource;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

public class CSUtils {
/*###25������Ĳ���
	* A: ������Ĳ���
		* a: ��������
			/*
			 *  ����д�õĹ�����,
			 *  �ṩ����һ��DataSource�ӿڵ�����Դ
			 *  QueryRunner�๹�췽��,����DataSource�ӿڵ�ʵ����
			 *  ����,���÷���update,query,���贫������Connection���Ӷ���*/
private static QueryRunner qr = new QueryRunner(jdbcUtils.getBds());
	public static void main(String[] args) {
		System.out.println(qr);
	//	getinsert();//�������ӳع�����,���ݿ�������
		getselect();//�������ӳع�����,���ݿ�鷽��
	}
	public static void getinsert(){
		String sql = "INSERT INTO sort VALUES(?,?,?,?)";
		Object[] obj = {11,"���",22,"�������õ�"};
			try {
				int row = qr.update(sql, obj);
			System.out.println(row);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("���ݿ�����ʧ��");
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
		throw new RuntimeException("���ݿ�����ʧ��");
		}
	
	
	}
}
