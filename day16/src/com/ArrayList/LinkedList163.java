package com.ArrayList;

import java.util.LinkedList;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class LinkedList163 {
/*###16.03_���Ͽ��(LinkedList�����й���)(����)
* A:LinkedList�����
* B:LinkedList�����й���
	public void addFirst(E e);	//Firstͷ������˼,addFirst()�ڼ���ͷ���������˼.��addLast()�ڼ���β����ӵ���˼
	 public E getFirst();	//��ȡ�����еĵ�һ��Ԫ��,��getLast()��ȡ�����е����һ��Ԫ��.
	 public E removeFirst();	//��public E removeLast()
	 public E get(int index);	//��ȡ������ָ��������Ԫ��.
	 */
	public static void main(String[] args) {
		LinkedList L = new LinkedList();
				L.addFirst("a");	//��ͷ�����
				L.addFirst("b");	
				L.addFirst("c");
				L.addLast("q");		//��β�����
				L.addLast("w");
				System.out.println(L);	//[c, b, a, q, w]
				System.out.println(L.getFirst());	//c		��ȡ��һ��Ԫ��.
				System.out.println(L.getLast());	//w		��ȡ���һ��Ԫ��.
				
				System.out.println(L.removeFirst());	//ɾ����һ��Ԫ��
				System.out.println(L);	//[b, a, q, w]
				System.out.println(L.removeLast());	//ɾ�����һ��Ԫ��.
				System.out.println(L);	//[b, a, q]
	
				System.out.println(L.get(1));	//a		��ȡָ��������Ӧ��Ԫ��
				
	
/*##16.04_���Ͽ��(ջ�Ͷ������ݽṹ)(����)
* ջ
	* �Ƚ���� 
* ����
	* �Ƚ��ȳ�*/
/*###16.05_���Ͽ��(��LinkedListģ��ջ���ݽṹ�ļ��ϲ�����)(����)
* A:������ʾ
	* ��������LinkedListģ��ջ���ݽṹ�ļ��ϣ�������
	* ����һ���ཫLinked�еķ�����װ	��Ϊ��ĿҪ��ģ��ջ,���Ǿ��¼�һ����,ջ����.ջ���ݽṹ���Ƚ����,Ҳ����˵�Ƚ����ڵ���,�ں���.��
1:���Ǿ���linkedList�е�addLast()����,��β����ʼ���.�������Ƚ����,�Ƚ��Ķ���β��,�ȳ��ľ���ͷ��,2:����linked�е�removefirst
�ӵ�һ����ʼɾ��.3:������������1���൱�ǽ�ջ,2�൱�ǳ�ջ,������һ����ӡ����,��ӡ���ó�ջ�ķ���,������isEmpty���жϼ����Ƿ�Ϊ��.
*/
	
		Stack a1 = new Stack();	//��ΪStact�����Ѿ���װ����LinkedList����,�����м���.����ֱ����Stsck��������Ϳ���.
			a1.add("z");		//����Stactջ�ṹ�еĽ�ջadd()����.
			a1.add("x");
			a1.add("c");
			a1.add("v");
			while(!a1.isEmpty()){	//����ջ�ṹ�е��ǿյķ���.�Ӹ���,��ʾ���Ϸǿ���,�Ǿͼ���.
				System.out.print(a1.out() + ",");	//�����е���ջ�ṹ�г�ջout()����.
				//z,x,c,v,  �Ƚ����.v���Ƚ���ջ����,���һ�����.
			}
	
	}

}




