package com.itheima.mapper;

import java.util.List;

import com.itheima.mybatis.pojo.User;
import com.itheima.mybatis.pojo.orders;

public interface OrderMapper {
	//��ʾ������ݿ��б������ֶκ�pojo��װʵ���ֶβ�һ��ʱ,��ô���ֶ�ӳ��
	//��ѯorders���������м�¼
	public List<orders> selectOrder();
	
	//��ʾ����ѯ���ж����Ͷ�Ӧ���û��� ,һ��һ��ѯ,�Զ���Ϊ����,һ��������һ���û�  ����ֵ�Ƕ���,�ڶ������з�װ�û�����
	public List<orders> selectOrdersList();
	
	
	//��ʾһ�Զ�,һ���û������
	public List<User> selectOrderListByUser();
	
}
