package com.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes" })
public class collection153_toArray {
	/*###15.04_集合框架(集合的遍历之集合转数组遍历)
	* A:集合的遍历
		* 其实就是依次获取集合中的每一个元素。*/
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	Collection c = new ArrayList();
	/*		c.add("d");
			c.add("f");
			c.add("g");
			c.add("h");
		Object[] arr = c.toArray();//将集合c转换成数组,API中集合类的toArray方法中返回的是Object[]的数组对象arr
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	System.out.println();*/
		c.add(new xt2("磊哥",2));
		c.add(new xt2("立正",2));
		c.add(new xt2("lx",24));
		c.add(new xt2("xzz",31));
		Object[] arr1 = c.toArray();/*相当于是Object[] arr1 = new xt2("xzz",31);相当于是父类引用指向子类对象.
创建的类,没有子类.new出来的对象只能是指向顶级父类Object,因为所有的类的是它直接或者间接的子类*/		
		
	for (int z = 0; z < arr1.length; z++) {
		System.out.print(arr1[z] + ",");//注意如果输出结果是地址值,说明xt2类中没有重写toString方法.Alt+shift+s
		//xt2 [name=磊哥, age=2],xt2 [name=立正, age=2],xt2 [name=lx, age=24],xt2 [name=xzz, age=31],
		xt2 d = (xt2)arr1[z];//因为要强转arr1中的每一个
		System.out.println(d.getName() + "........" + d.getAge());
	}	
//也可以通过getName();获取xt2中的成员变量值.但是必须把arr1强转成xt2类,才能getName(),因为object类中没有name,age,
		
	}

}
