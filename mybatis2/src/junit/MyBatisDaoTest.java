package junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.dao.userDaoImp;
import com.itheima.mybatis.pojo.User;

public class MyBatisDaoTest {
	// ����嵱servlet�����dao��,��ʾԭʼ����
	// ���幤��
	public SqlSessionFactory sqlSessionFactory;

	@Before
	public void before() throws Exception {
		// 1:���غ��������ļ�(�����ļ��������ݿ���������),�ȶ��������ļ�,�ٻ�ȡ����
		String resource = "sqlMapConfig.xml";
		// ��io����ȡ���������ļ�
		InputStream in = Resources.getResourceAsStream(resource);

		// 2:��������----���������д�����������ļ��еı��ļ�,���������ʹ���---�൱�ڸ���������,�ù����ӹ�������
		// �������������Ķ����ܲ������ݿ�ִ��sql�������Ϊ��������Ĳ�����in�����к��������ļ������ݿ���������
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
				
	}

	@Test
	public void testDao() throws Exception {
		userDaoImp dao = new userDaoImp(sqlSessionFactory);
		User user = dao.selectUserById(10);
		System.out.println(user);
	
	}
}
