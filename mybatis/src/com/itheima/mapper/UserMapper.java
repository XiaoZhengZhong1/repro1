package com.itheima.mapper;

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
	


}
