package junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mapper.UserMapper;
import com.itheima.mybatis.pojo.User;

public class MabatisMapperTest {
	//������ѭ���ĸ�ԭ��Ľӿ�,�ù��������ȡӳ��ʵ������,�ڲ����д���ӿڵ��ֽ���.
	@Test
	public void testMapper() throws Exception {
		//1:���غ��������ļ�(�����ļ��������ݿ���������),�ȶ��������ļ�,�ٻ�ȡ����
		String resource = "sqlMapConfig.xml";
		//��io����ȡ���������ļ�
		InputStream in = Resources.getResourceAsStream(resource);
		//2:��������----���������д�����������ļ��еı��ļ�,���������ʹ���---�൱�ڸ���������,�ù����ӹ�������
		//�������������Ķ����ܲ������ݿ�ִ��sql�������Ϊ��������Ĳ�����in�����к��������ļ������ݿ���������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//3:����sqlSession(����ʹ�ô����湤��������sqlSessionFactory)
		 SqlSession openSession = sqlSessionFactory.openSession();
		 
		//SqlSEssion��������һӳ��ʵ����  �����ӿڣ�
		 UserMapper mapper = openSession.getMapper(UserMapper.class);
		 User user = mapper.findUserById(10);
		 System.out.println(user);
		
	
	}
}
