package DataSource;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class Demo2 {
/*###22BasicDataSource���ʹ��
���ӳ�jar����,�����һ��ʵ��������Դ�Ĺ淶�ӿ�javax.sql.DataSource��,ʵ����BasicDataSource*/
	public static void main(String[] args) {
	//1:����java��DateSource�ӿڵ�ʵ�������.
		BasicDataSource ds = new BasicDataSource();
	//2:�ö����е�setxxx����,�������ݿ������������Ϣ.
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/mybase2");
		ds.setUsername("root");
		ds.setPassword("123");
	//3:���ö��󷽷�getConnertion()
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			System.out.println(e);//��ӡ�쳣ԭ���Ǹ�������Ա����,���㴦���쳣.
			throw new RuntimeException("���ݿ�����ʧ��");//����ʾ�Ǹ��ͻ�����
			}
	}
	

}
