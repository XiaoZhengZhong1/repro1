package com.itheima.mapper;

import java.util.List;

import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;

public interface UserMapper {
	//���ӿ���ʾ�����Ż���,��̬����,�������ĸ�ԭ��,ֻ��Ҫһ���ӿں�һ�����������������ݵ���ɾ�Ĳ� 
	//��ѭ�ĸ�ԭ��
	//�ӿ� ������  == User.xml �� id �� (���Ǿ������ɾ�Ĳ��ǩ��id)
	//����ֵ����  ��  Mapper.xml�ļ��з���ֵ����Ҫһ��(������ɾ�Ĳ��ǩ���趨��resultType)
	//������������� ��Mapper.xml����ε�����Ҫһ��(������ɾ�Ĳ��ǩ���趨��parameterType)
	//�����ռ� �󶨴˽ӿ�(ָ����<mapper namespace=com.itheima.mapper.UserMapper.java>)
	
	/*User findUserById Integer id  namespace=  �������ĸ�ԭ��Ϳ����ڲ�����,�ù��������ȡӳ��ʵ��,
	 * ���з��������д��뱾�ӿڵ��ֽ������,ͨ�����䴴�����ӿڵ�ʵ��,ʵ���о����˱��ӿڵ��ĸ�ֵ��*/
	
	public User findUserById(Integer id);
	
	//��ʾ�������Ϊ��װ������
	public List<User> findUserByQueryVo(QueryVo vo);

	//��ʾ���ز���Ϊ������������   ��ѯ�û���¼����
	public Integer UserCont();
	
	
	//��ʾ�����û����Ա�Ӻ�if��ǩ�ж��Ƿ�Ϊ��,��where��ǩ������ǩ�ɿ���ȥ����һ��ǰand
	public List<User> selectUserBySexAndUsername(User user);
	
	//��ʾ,���ݶ��id��ѯ����û�   ����Ϊ����
	public List<User> selectUserByIds(List<Integer> ids);

	//��ʾ,���ݶ��id��ѯ����û�   ����Ϊ����
	public List<User> selectUserByIds2(Integer[] ids);

}
