package com.itheima.mybatis.pojo;

import java.io.Serializable;
import java.util.List;
//ʵ��Serializable �ɴ��л��ӿ�,���ݲ���ʵ�ֻ�Ⱥ(���Ƕ�̨����֮�����ݽ���  �ֲ�ʽ  �� ֮��)
public class QueryVo implements  Serializable {

	/*
	 *�������԰�װ��,��װUser��  �����ڱ���˽��User����
	 */
	private static final long serialVersionUID = 1L;

	private User user;

	//˽��һ������,������װ����������ѯ�еĸ��ݶ��id��ѯ����û�	
	//��ԭ���뷢��:������ж�����Ǽ����ֶ� �� xml��foreachѭ����cocection=list 
	//��ԭ���뷢��:��������������Ingteger[] id �� xml��foreachѭ����cocection=array
	private List<Integer> idsList;
	
	//˽��һ������,������װ����������ѯ�еĸ��ݶ��id��ѯ����û�	
	private Integer[] ids;
	
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public List<Integer> getIdsList() {
		return idsList;
	}

	public void setIdsList(List<Integer> idsList) {
		this.idsList = idsList;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
