package DataSource;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/*###23BasicDataSource��ĳ�������
	* A: BasicDataSource��ĳ�������
		* a: ��������
			����	����			����
			������	
					driverClassName	���ݿ���������
					url				���ݿ�ĵ�ַ
					username		�û���
					password		����
			�������չ��	
					maxActive		�����������
					minIdle			��С��������
					maxIdle 		����������
					initialSize		��ʼ������

			
###24ʵ�����ݿ����ӳع�����
	* A: ʵ�����ݿ����ӳع�����
		* a: ��������
			/*
			 *  ʹ��DBCPʵ�����ݿ�����ӳ�
			 *  ���ӳ�����,�Զ�����,
			 *  �������������
			 *  �������ݿ����ӳ���������,�Զ���*/
public class jdbcUtils {
//һ����������,�����þ�̬��,������װ����,�ͻ�ȡ����,���и����������ϢҲ���Է��ھ�̬�������.
	private static BasicDataSource bds = new BasicDataSource();
		static{
			bds.setDriverClassName("com.mysql.jdbc.Driver");
			bds.setUrl("jdbc:mysql://localhost:3306/mybase3");
			bds.setUsername("root");
			bds.setPassword("123");
			
			bds.setInitialSize(10);
			bds.setMaxActive(8);
			bds.setMaxIdle(5);
			bds.setMinIdle(1);
		}
	public static DataSource getBds() {
		return bds;
	}

	
	
}
