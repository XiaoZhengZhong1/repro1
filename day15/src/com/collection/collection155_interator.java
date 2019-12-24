package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection155_interator {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
/*###15.06_集合框架(集合的遍历之迭代器遍历)
* A:迭代器概述
	* 集合是用来存储元素,存储的元素需要查看,那么就需要迭代(遍历) 
* B:案例演示
	* 迭代器的使用*/
				
			Collection  c = new ArrayList();
			/*		c.add("a");
					c.add("b");
					c.add("c");
					c.add("d");
					
			Iterator it = c.iterator();		//获取迭代器的引用
				while(it.hasNext()) {		hasNext()是iterator迭代类中的方法前一个是判断迭代器中是否有
元素,有就返回true,放在while循环中表示有就执行语句体,next()也是iterator迭代类中的方法,是返回迭代器中的下一个元素,从0索引开始					
					System.out.println(it.next());
					}*/
				c.add(new xt2("磊哥",2));
				c.add(new xt2("立正",2));
				c.add(new xt2("志强",2));
				Iterator it1 = c.iterator();	
				while(it1.hasNext()){//用while循环而不用for循环是因为,while的初始化语句调用在外面,循环结束依然可以用
					xt2 x = (xt2)it1.next();//向下转型
				System.out.println(x.getName() + "------" + x.getAge());
				}
					
/*##15.08_集合框架(迭代器的原理及源码解析)(了解)
* A:迭代器原理
	* 迭代器原理:迭代器是对集合进行遍历,而每一个集合内部的存储结构都是不同的,所以每一个集合存和取都是不一样,
	* 那么就需要在每一个类中定义hasNext()和next()方法,这样做是可以的,但是会让整个集合体系过于臃肿,迭代器是将这样的方法向上抽取出接口,
	* 然后在每个类的内部,定义自己迭代方式,这样做的好处有二,第一规定了整个集合体系的遍历方式都是hasNext()和next()方法,第二,
	* 代码有底层内部实现,使用者不用管怎么实现的,会用即可 
* B:迭代器源码解析
	* 1,在eclipse中ctrl + shift + t找到ArrayList类
	* 2,ctrl+o查找iterator()方法
	* 3,查看返回值类型是new Itr(),说明Itr这个类实现Iterator接口
	* 4,查找Itr这个内部类,发现重写了Iterator中的所有抽象方法 
*/
	
	
	
	
	
	
	}

}
