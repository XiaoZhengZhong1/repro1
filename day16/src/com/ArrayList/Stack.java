package com.ArrayList;

import java.util.LinkedList;
@SuppressWarnings("unchecked")

public class Stack {
	@SuppressWarnings("rawtypes")
	private LinkedList L = new LinkedList();	//��ʾ��װ���췽��,ֻ���ڱ���������.
//��Ϊ����Ľ�ջ�ͳ�ջ�������ǵ���Linked�еķ�������Ҫ�ȵ����ʹ�������.��������װ,���Ƿ�������ͨ����������ʹ��.

//1:ģ���ջ����addLast();
	public void add(Object obj){	//����û��ȷ���Ľ�ջ����,Ϊ�˷�������κβ��������ֱ���ö������൱������.
		L.addLast(obj);				//��ʾ��������κζ����������,Ҳ�����������,��Ϊ���е��඼��Object��ֱ�Ӻͼ�ӵ�����.
	}

//2:ģ���ջ����removeFirst();
	public Object out(){		//��ʾ����ֵ������Object,��Ϊ���漯������ӵ�Ҳ��Object,
		return L.removeFirst();	//��ʾ��ջ�ķ������Ǵ�ͷ��ʼɾ��
	}
//3:ģ��ջ�ṹ�Ƿ�Ϊ��
	public boolean isEmpty(){	//�ж��Ƿ�Ϊ��
		return L.isEmpty();		//��ʾ���ص��Ǽ����Ƿ�Ϊ��,��Ϊ�����жϵĻ��Ǽ���.
	}
}
/*ע���������еķ�������ģ���,����Ľ�ջ���,�ͳ�ջɾ��,����������Ҫ��������������н��ж����.���Ƕ���L����װ,ֻ���ڱ���ʹ��,��������
 * ����һ��������Stact�ඨ�����,�������з���.
 * 
 * */






