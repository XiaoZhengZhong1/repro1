package com.collection;

import java.util.ArrayList;
import java.util.List;

public class collection156_List {
	/*###15.09_���Ͽ��(List���ϵ����й��ܸ����Ͳ���)
	* A:List���ϵ����й��ܸ���
		* void add(int index,E element)	//��ָ���������,���Ԫ��.
		* E remove(int index)	//ͨ��ָ������ɾ��Ԫ��
		* E get(int index)	//��ȡָ������λ�õ�Ԫ��.
		* E set(int index,E element)	//�޸�ָ��������Ԫ��
		* */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List L = new ArrayList();
//1:* void add(int index,E element)//��ָ���������,���Ԫ��.��������index����<=size����index>=0
			L.add("a");
			L.add("b");
			L.add("c");
			L.add("d");
			System.out.println(L);	//[a, b, c, d]
			L.add(2, "WWW");	//��ָ������2,����ַ���"www"-----��������index����<=size����index>=0
			System.out.println(L);	//[a, b, WWW, c, d]
	
//2:* E remove(int index)//ͨ��ָ������ɾ��Ԫ��	
 Object obj = L.remove(2);	//ɾ��ָ������2,��Ӧ��Ԫ��.remove()����,���ص���Object,ע������ӵ�������,ɾ��Ҳ��ָ������
			System.out.println(obj);	//WWW
			System.out.println(L);	//[a, b, c, d]
	
//3:* E get(int index)	//��ȡָ������λ�õ�Ԫ��.	
			Object Obj1 = L.get(2);	//��ȡָ������2,��Ӧ��Ԫ��
			System.out.println(Obj1);	//c
			System.out.println(L);	//[a, b, c, d]
			for (int i = 0; i < L.size(); i++) {	//Ҳ������List���е�get()����,����.
				System.out.println(L.get(i));
			}
	
//*4: E set(int index,E element)	//�޸�ָ��������Ԫ��
			Object Obj2 = L.set(0, "qqqq");	//�޸�ָ��0������Ӧ��Ԫ��,�ĳ�"qqqq"
			System.out.println(Obj2);	//a
			System.out.println(L);	//[qqqq, b, c, d]
	}

}
