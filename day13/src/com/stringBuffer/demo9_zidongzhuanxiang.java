package com.stringBuffer;

public class demo9_zidongzhuanxiang {

	public static void main(String[] args) {
/*
###13.22_��������(JDK5���������Զ�װ��Ͳ���)
* A:JDK5��������
	* �Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
	* �Զ����䣺�Ѱ�װ������ת��Ϊ��������
* B:������ʾ
	* JDK5���������Զ�װ��Ͳ���
	
	* Integer ii = 100;
	* ii += 200;
* C:ע������
	* ��ʹ��ʱ��Integer  x = null;����ͻ����NullPointerException��
	* �������ж��Ƿ�Ϊnull��Ȼ����ʹ�á�
*/
//jdk 1.5�汾��������.�Զ���,װ,��.���Կ��ܻ���.
//����ʾ������ǰ����ô�ֶ�װ���,������ô�ѻ�����������ת���ɶ����.	
	int x = 100;
	Integer x1 = new Integer(x);//�ֶ�װ��,��������������ת���ɶ���.
	int x2 = x1.intValue();		//�ֶ�����,������ת���ɻ�����������.
	System.out.println(x2);
	
	Integer y = 200;	//�Զ�װ��y�ͳ��˰�װ����
	int x3 = y ;		//�Զ�����y�ֳ��˻�����������        ������ײ㻹�ǽ�����������ֶ�����,ֻ�ǲ���Ҫ�����Լ�������
	System.out.println(x3);
	}

}
