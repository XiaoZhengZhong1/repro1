package com.stringBuffer;

public class demo1_stringBuffer {

	public static void main(String[] args) {
/*
 	A:StringBuffer�Ĺ��췽����
	* public StringBuffer():�޲ι��췽��
	* public StringBuffer(int capacity):ָ���������ַ�������������
	* public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
* B:StringBuffer�ķ�����
	* public int capacity()�����ص�ǰ������	����ֵ(������)
	* public int length():���س��ȣ��ַ������� ʵ��ֵ
* C:������ʾ
	* ���췽���ͳ��ȷ�����ʹ��
*/
		System.out.println(new StringBuffer().length());//StringBuffer():�޲ι��췽��,��ʾ�¼�һ���޲ι���.
														//���length()�����ַ�����,������Ϊ0
		System.out.println(new StringBuffer().capacity());//capacity()������ʼ��������,������16										
	
		System.out.println(new StringBuffer(10).length());	//������0
		System.out.println(new StringBuffer(10).capacity());//������10
	
		System.out.println(new StringBuffer("xzz").length());	//������3 ��ʾ֤��length()ֻ���ַ��ĸ���.
		System.out.println(new StringBuffer("xzz").capacity());//������19 ��ʾ֤��capacity()���ַ���,������ʼֵ����չ
	
	}

}
