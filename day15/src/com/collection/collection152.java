package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*Collection<E> a = new ArrayList<E>;因为<E>表示泛型,我们现在没学就没加就报错,就用ctrl+1"rawtypes"注解下保持原型
后面的ArrayList还是报错了,用ctrl+1 "unchecked" 表示不检查.泛型的作用就是排除安全隐患的*/
@SuppressWarnings({ "rawtypes", "unchecked" })
public class collection152 {
	/*###15.03_集合框架(Collection集合的基本功能测试)
	* A:案例演示	
	* 
			基本功能演示
			
			boolean add(E e)		//添加.
			boolean remove(Object o)	//去除指定元素.
			void clear()				//清空集合.
			boolean contains(Object o)	//判断是否包含某元素.
			boolean isEmpty()			//判断集合是否为空.
			int size()					//确认集合长度.
*/
	public static void main(String[] args) {
/*注意下行代码要导两次包,集合用Collection要导集合包,Ait+/.因为集合是接口不能实例化,只能用它的子类ArrayList创建对象,		
	要导ArrayList包,Ctrl+shift+o*/
		Collection a = new ArrayList();//相当于父类引用指向子类对象的意思.
			//以下代码是判断Collection集合的子类ArrayList中是否能存储所有对象
		/*	boolean b = a.add("abc");
			boolean b1 = a.add("abc");
			boolean b2 = a.add(100);	//相当于自动封装了,把100封装从对象
			boolean b3 = a.add(true);	//同上
			System.out.println(b);
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3)*/;/*输出结果都是true,add方法在List类是能添加所有对象的.所以boolean b =是可以省略的.
但是add在Set方法中添加重复的内容就会输出false	*/		
		
			a.add("q");
			a.add("w");
			a.add("e");
			System.out.println(a);//输出结果[q, w, e],这个[]中括号是object顶级父类重写了toSteing中添加的.
			System.out.println(a.size());//获取a集合中的元素个数,输出结果3
			System.out.println(a.contains("w"));//判断a集合中是否包含"w",结果是true
			a.remove("q");//删除指定元素q.
			System.out.println(a);	//[w, e]		
			a.clear();	//清空a集合.
			System.out.println(a);//[]
			System.out.println(a.isEmpty());//判断集合a是否为空 ,结果true
	
	}

}
