package com.itheima.mybatis.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

//��ʾԭʼdao����,�ֶ������ӿ�,ʵ�ֽӿ�,����pojoʵ���,�������а󶨽ӿ�,����������ָ����(�ӿںͽӿ�ͬ���ı�.xml���ڰ�)

//�̳�SqlSessionDaoSupport��,���ܴ����м̳й���,ʹ�ù�������
public class UserMapperImp extends SqlSessionDaoSupport implements UserMapper {
	//���˹�������ֱ��ʹ�ö�����ýӿ��е���ɾ�Ĳ鷽��ֻ��sql������
	@Override
	public Integer insertUser() {
	//	this.getSqlSession().insert(arg0, arg1)  �������Ǳ�.xml��sql���idֵ �� ����ռλ����ֵ
		return null;
	}
}
