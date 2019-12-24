package junit;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mybatis.pojo.User;

public class MybatisFisetTest {
	@Test
	//�ܹ����Ų���
	public void testMybatis() throws Exception {
		//1:���غ��������ļ�(�����ļ��������ݿ���������),�ȶ��������ļ�,�ٻ�ȡ����
		String resource = "sqlMapConfig.xml";
		//��io����ȡ���������ļ�
		InputStream in = Resources.getResourceAsStream(resource);
		
		//2:��������----���������д�����������ļ��еı��ļ�,���������ʹ���---�൱�ڸ���������,�ù����ӹ�������
		//�������������Ķ����ܲ������ݿ�ִ��sql�������Ϊ��������Ĳ�����in�����к��������ļ������ݿ���������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		
		//3:����sqlSession(����ʹ�ô����湤��������sqlSessionFactory)
		 SqlSession openSession = sqlSessionFactory.openSession();
		
		 //4:ִ��sql���
		//�������������Ķ����ܲ������ݿ�ִ��sql�������Ϊ��������Ĳ�����in�����к��������ļ������ݿ���������
		 
		 Object user = openSession.selectOne("test1.findUserById", 10);
		 System.out.println(user);
	
	}
	
	
	
	//��:myBatis�����ʾ,�����û�����ģ����ѯ.��ѯ�����д� �� ��  ��Ϊ�����ж�����ִ���� ������selectList
	@Test
	public  void findUserByusername() throws IOException{
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
		SqlSession openSession = sqlSession.openSession();
		List<User> selectList = openSession.selectList("test1.findUserByusername", "��");
		System.out.println(selectList);
	
	}
	
	//��:myBatis�����ʾUser������û�
	@Test
	public void insertUser() throws IOException{
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
		SqlSession openSession = sqlSession.openSession();
		//��Ϊ������û�,User.xml�����ļ����Ǵ��ε�,����Ҫ�ڴ˴���������
		User user = new User();
		user.setUsername("Ф��");
		user.setSex("��");
		user.setBirthday(new Date());
		user.setAddress("aaaaaaaaaa");
		int insert = openSession.insert("test1.insertUser", user);
		//��Ϊ���������ļ���.����������,����Ҫ��������
		openSession.commit();
		//System.out.println(insert);
		//��ӡ����û����ɵ�����id
		System.out.println(user.getId());
	}
	
	
	//��:myBatis�����ʾUser����²���
		/*@Test
		public void updateUser() throws IOException{
			String resource = "sqlMapConfig.xml";
			InputStream in = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
			SqlSession openSession = sqlSession.openSession();
			//��Ϊ�Ǹ����û�,User.xml�����ļ����Ǵ��ε�,����Ҫ�ڴ˴���������
			User user = new User();
			user.setId(27);
			user.setUsername("Ф��");
			user.setSex("��");
			user.setBirthday(new Date());
			user.setAddress("aaaaaaaaaa");
			//��Ϊ���������ļ���.����������,����Ҫ��������
			int update = openSession.update("test1.updateUserById",user);
			openSession.commit();
			System.out.println(update);
			
		}*/
		
		//��:myBatis�����ʾUser��ɾ������
				@Test
				public void deleteUser() throws IOException{
					String resource = "sqlMapConfig.xml";
					InputStream in = Resources.getResourceAsStream(resource);
					SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
					SqlSession openSession = sqlSession.openSession();
					int delete = openSession.delete("test1.deleteUserById",33);
					openSession.commit();

				}
		
		
		
	
}
