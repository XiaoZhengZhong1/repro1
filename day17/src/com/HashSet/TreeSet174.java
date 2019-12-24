package com.HashSet;

import java.util.TreeSet;

import com.xzz.bean_1.person;

public class TreeSet174 {
	/*###17.09_集合框架(TreeSet存储Integer类型的元素并遍历)
	* A:案例演示
		* TreeSet存储Integer类型的元素并遍历
	TreeSet是用来给集合对象进行排序的,也能保证不重复.
*/
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
			t.add(5);
			t.add(5);
			t.add(2);
			t.add(2);			
			t.add(4);
			t.add(1);
			t.add(3);
	System.out.println(t);	//[1, 2, 3, 4, 5]
	
	/*###17.10_集合框架(TreeSet存储自定义对象)
	* A:案例演示
		* 存储Person对象	*/
	TreeSet<person> t2 = new TreeSet<>();
			t2.add(new person("肖振中",31));
			t2.add(new person("李霞",24));
			t2.add(new person("肖磊",2));
			System.out.println(t2);	/* 输出报错:com.xzz.bean_1.person cannot be cast to java.lang.Comparable
	意思是person类没有实现Comparable比较接口,既然TreeSet集合是给集合排序的,排序就要有比较,比如按数值大小排序之类的,API中有一个
	Comparable自然排序接口,很多类的实现了这个接口,重写了接口中的compareto方法. 比如上面的Integer类.*/
	//[person [name=肖磊, age=2], person [name=李霞, age=24], person [name=肖振中, age=31]]
	}

}
