package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
@SuppressWarnings({ "rawtypes", "unchecked" })
public class List157_listIterator {
	/*###15.11_集合框架(并发修改异常产生的原因及解决方案)
	* A:案例演示
		* 需求：我有一个集合，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。*/

public static void main(String[] args) {
			List L = new ArrayList();
			L.add("a");
			L.add("b");
			L.add("c");
			L.add("world");
			L.add("d");
//listIterator迭代器是List专有的迭代器,可以在迭代(遍历)的同时,往迭代器里添加元素对象,但是必须是迭代器对象调用 添加方法如	S.add("javaee");	
		ListIterator  S = L.listIterator();//注意一定要用L调用迭代器,因为添加的值都在L中,而不是用List调用,此错浪费1小时
			while(S.hasNext()){
		String a = (String)S.next();//因为要判断S中,是否有和"world"相同的字符串,所有要把迭代的对象都强转成字符串,
				if("world".equals(a)){	
					S.add("javaee");	//迭代器对象调用 添加方法如	S.add("javaee");	
///*###15.11_集合框架(迭代时集合调用添加出现并发修改异常产生的原因及解决方案),解决办法就是用迭代器调用添加方法,必须是listIterator迭代器					
				}
			}
			System.out.println(L);	//迭代判断完成后打印[a, b, c, world, javaee, d]
	}

}
/*###15.14_集合框架(数据结构之数组和链表)
* A:数组
	* 查询快修改也快	//因为数组是开辟连续的存储空间,相当于是一个整体.在一个整体查询修改是快的
	* 增删慢			//因为增加一个,删除一个都会整体向前和后移动.
* B:链表
	* 查询慢,修改也慢	//因为链表相当于每个链接都是一个整体,只记录和它相链接个体,10个元素对象就相当于10个整体,在10个整体查找当然慢.
	* 增删快		//因为每个链接都是个体,增加只需要把增加位置的,前后链接接到自己身上就可以,当然曾删快.

###15.15_集合框架(List的三个子类的特点)
* A:List的三个子类的特点
* 
		ArrayList:
			底层数据结构是数组，查询快，增删慢。
			线程不安全，效率高。
		Vector:
			底层数据结构是数组，查询快，增删慢。
			线程安全，效率低。
		Vector相对ArrayList查询慢(线程安全的)
		Vector相对LinkedList增删慢(数组结构)
		LinkedList:
			底层数据结构是链表，查询慢，增删快。
			线程不安全，效率高。

		Vector和ArrayList的区别
			Vector是线程安全的,效率低
			ArrayList是线程不安全的,效率高
		共同点:都是数组实现的
		ArrayList和LinkedList的区别
			ArrayList底层是数组结果,查询和修改快
			LinkedList底层是链表结构的,增和删比较快,查询和修改比较慢
		共同点:都是线程不安全的
* B:List有三个儿子，我们到底使用谁呢?
		查询多用ArrayList
		增删多用LinkedList
		如果都多ArrayList*/




