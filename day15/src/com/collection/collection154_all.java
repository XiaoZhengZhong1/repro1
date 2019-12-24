package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection154_all {
/*##15.05_���Ͽ��(Collection���ϵĴ�All���ܲ���)
* A:������ʾ
* 
		��All�Ĺ�����ʾ
		
		boolean addAll(Collection c)-----���һ�����ϵ���˼.
		boolean removeAll(Collection c)----ɾ�����ü����а��������ü��������Ԫ����ͬ��Ԫ��.
		boolean retainAll(Collection c)----�������෴,�Ǳ������ü����а��������ü����������ͬԪ��ֵ,�����ظ���.
		boolean containsAll(Collection c)-----�жϵ��ü������Ƿ���������ü���,�ǰ��������ü��ϵ�����Ԫ��.
*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
//1:addAll(Collection c)-----���һ�����ϵ���˼		
		Collection c1 = new ArrayList();
				c1.add("a");
				c1.add("b");
				c1.add("c");
		Collection c2 = new ArrayList();
				c2.add("d");
				c2.add("e");
				c2.add("f");
	c1.addAll(c2);	//��ʾ���һ������c2,��c2�е�ÿһ��Ԫ����ӽ���.c1.add(c2);��ʾ��c2����������ӽ���,��������[d e f]
		System.out.println(c1);//[a, b, c, d, e, f]
	
//2:boolean removeAll(Collection c)------��ʾɾ��һ������.��˼��a.removeALL(b),ɾ��a���������к�b������ͬ��Ԫ��.	
		Collection c3 = new ArrayList();
		c3.add("a");
		c3.add("b");
		c3.add("c");
		Collection c4 = new ArrayList();
		c4.add("d");
		c4.add("a");
		boolean a1 = c3.removeAll(c4);	//�ж�c3���Ƿ���c4����ͬ��Ԫ��ֵ,��ɾ��.��ɾ������.
		System.out.println(a1);	//��������:true.��Ϊc3����c4�е�a,ɾ���ڿ��н�����,ֻҪ�н����������true.
		System.out.println(c3);	//[b, c]

//3:boolean retainAll(Collection c)----�������෴,�Ǳ������ü����а��������ü����������ͬԪ��ֵ,�����ظ���
	Collection c5 = new ArrayList();
		c5.add("a");
		c5.add("b");
		c5.add("c");
	Collection c6 = new ArrayList();
		c6.add("a");
		c6.add("e");
		c6.add("f");
/*ע�Ᵽ������,�����յ����߱���c5.retainAll(c6)����c5�Ľ���᲻��ı�,�ı����true,�������false.����ж�û�н���,�᷵��һ��[]
��c5,c5���Ҳ����һ���մ�,���м�ʹû�н���,c5�Ľ�����Ǹı���,�������true*/
	boolean a2 = c5.retainAll(c6);//�ж�c5���Ƿ����c6����ͬ��Ԫ��ֵ,��������ͬ,ɾ����ͬ.�б�������
	System.out.println(a2);//true
	System.out.println(c5);//[a]
	
//4:boolean containsAll(Collection c)-----�жϵ��ü������Ƿ���������ü���,�ǰ��������ü��ϵ�����Ԫ��	
	Collection c7 = new ArrayList();
	c7.add("a");
	c7.add("b");
	c7.add("c");
	Collection c8 = new ArrayList();
	c8.add("a");
	c8.add("b");
	c8.add("c");
	boolean a3 = c7.containsAll(c8);	//�ж�c7���Ƿ����c8��ȫ��Ԫ��
	System.out.println(a3);	//true
	}

}
