package com.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes" })
public class collection153_toArray {
	/*###15.04_���Ͽ��(���ϵı���֮����ת�������)
	* A:���ϵı���
		* ��ʵ�������λ�ȡ�����е�ÿһ��Ԫ�ء�*/
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	Collection c = new ArrayList();
	/*		c.add("d");
			c.add("f");
			c.add("g");
			c.add("h");
		Object[] arr = c.toArray();//������cת��������,API�м������toArray�����з��ص���Object[]���������arr
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	System.out.println();*/
		c.add(new xt2("�ڸ�",2));
		c.add(new xt2("����",2));
		c.add(new xt2("lx",24));
		c.add(new xt2("xzz",31));
		Object[] arr1 = c.toArray();/*�൱����Object[] arr1 = new xt2("xzz",31);�൱���Ǹ�������ָ���������.
��������,û������.new�����Ķ���ֻ����ָ�򶥼�����Object,��Ϊ���е��������ֱ�ӻ��߼�ӵ�����*/		
		
	for (int z = 0; z < arr1.length; z++) {
		System.out.print(arr1[z] + ",");//ע������������ǵ�ֵַ,˵��xt2����û����дtoString����.Alt+shift+s
		//xt2 [name=�ڸ�, age=2],xt2 [name=����, age=2],xt2 [name=lx, age=24],xt2 [name=xzz, age=31],
		xt2 d = (xt2)arr1[z];//��ΪҪǿתarr1�е�ÿһ��
		System.out.println(d.getName() + "........" + d.getAge());
	}	
//Ҳ����ͨ��getName();��ȡxt2�еĳ�Ա����ֵ.���Ǳ����arr1ǿת��xt2��,����getName(),��Ϊobject����û��name,age,
		
	}

}
