package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*Collection<E> a = new ArrayList<E>;��Ϊ<E>��ʾ����,��������ûѧ��û�Ӿͱ���,����ctrl+1"rawtypes"ע���±���ԭ��
�����ArrayList���Ǳ�����,��ctrl+1 "unchecked" ��ʾ�����.���͵����þ����ų���ȫ������*/
@SuppressWarnings({ "rawtypes", "unchecked" })
public class collection152 {
	/*###15.03_���Ͽ��(Collection���ϵĻ������ܲ���)
	* A:������ʾ	
	* 
			����������ʾ
			
			boolean add(E e)		//���.
			boolean remove(Object o)	//ȥ��ָ��Ԫ��.
			void clear()				//��ռ���.
			boolean contains(Object o)	//�ж��Ƿ����ĳԪ��.
			boolean isEmpty()			//�жϼ����Ƿ�Ϊ��.
			int size()					//ȷ�ϼ��ϳ���.
*/
	public static void main(String[] args) {
/*ע�����д���Ҫ�����ΰ�,������CollectionҪ�����ϰ�,Ait+/.��Ϊ�����ǽӿڲ���ʵ����,ֻ������������ArrayList��������,		
	Ҫ��ArrayList��,Ctrl+shift+o*/
		Collection a = new ArrayList();//�൱�ڸ�������ָ������������˼.
			//���´������ж�Collection���ϵ�����ArrayList���Ƿ��ܴ洢���ж���
		/*	boolean b = a.add("abc");
			boolean b1 = a.add("abc");
			boolean b2 = a.add(100);	//�൱���Զ���װ��,��100��װ�Ӷ���
			boolean b3 = a.add(true);	//ͬ��
			System.out.println(b);
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3)*/;/*����������true,add������List������������ж����.����boolean b =�ǿ���ʡ�Ե�.
����add��Set����������ظ������ݾͻ����false	*/		
		
			a.add("q");
			a.add("w");
			a.add("e");
			System.out.println(a);//������[q, w, e],���[]��������object����������д��toSteing����ӵ�.
			System.out.println(a.size());//��ȡa�����е�Ԫ�ظ���,������3
			System.out.println(a.contains("w"));//�ж�a�������Ƿ����"w",�����true
			a.remove("q");//ɾ��ָ��Ԫ��q.
			System.out.println(a);	//[w, e]		
			a.clear();	//���a����.
			System.out.println(a);//[]
			System.out.println(a.isEmpty());//�жϼ���a�Ƿ�Ϊ�� ,���true
	
	}

}
