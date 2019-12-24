package com.ArrayList;

import java.util.LinkedList;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class LinkedList163 {
/*###16.03_集合框架(LinkedList的特有功能)(掌握)
* A:LinkedList类概述
* B:LinkedList类特有功能
	public void addFirst(E e);	//First头部的意思,addFirst()在集合头部添加是意思.及addLast()在集合尾部添加的意思
	 public E getFirst();	//获取集合中的第一给元素,及getLast()获取集合中的最后一个元素.
	 public E removeFirst();	//及public E removeLast()
	 public E get(int index);	//获取集合中指定索引的元素.
	 */
	public static void main(String[] args) {
		LinkedList L = new LinkedList();
				L.addFirst("a");	//在头部添加
				L.addFirst("b");	
				L.addFirst("c");
				L.addLast("q");		//在尾部添加
				L.addLast("w");
				System.out.println(L);	//[c, b, a, q, w]
				System.out.println(L.getFirst());	//c		获取第一给元素.
				System.out.println(L.getLast());	//w		获取最后一个元素.
				
				System.out.println(L.removeFirst());	//删除第一个元素
				System.out.println(L);	//[b, a, q, w]
				System.out.println(L.removeLast());	//删除最后一个元素.
				System.out.println(L);	//[b, a, q]
	
				System.out.println(L.get(1));	//a		获取指定索引对应的元素
				
	
/*##16.04_集合框架(栈和队列数据结构)(掌握)
* 栈
	* 先进后出 
* 队列
	* 先进先出*/
/*###16.05_集合框架(用LinkedList模拟栈数据结构的集合并测试)(掌握)
* A:案例演示
	* 需求：请用LinkedList模拟栈数据结构的集合，并测试
	* 创建一个类将Linked中的方法封装	因为题目要求模拟栈,我们就新键一个类,栈类名.栈数据结构是先进后出,也就是说先进的在底下,在后面.那
1:我们就用linkedList中的addLast()方法,从尾部开始添加.由于是先进后出,先进的都在尾部,先出的就是头部,2:就用linked中的removefirst
从第一个开始删除.3:上面两个方法1是相当是进栈,2相当是出栈,还得有一个打印方法,打印调用出栈的方法,得先用isEmpty先判断集合是否为空.
*/
	
		Stack a1 = new Stack();	//因为Stact类中已经封装了有LinkedList对象,里面有集合.所有直接用Stsck创建对象就可以.
			a1.add("z");		//调用Stact栈结构中的进栈add()方法.
			a1.add("x");
			a1.add("c");
			a1.add("v");
			while(!a1.isEmpty()){	//调用栈结构中的是空的方法.加个非,表示集合非空吗,是就继续.
				System.out.print(a1.out() + ",");	//调用中调用栈结构中出栈out()方法.
				//z,x,c,v,  先进后出.v最先进在栈底下,最后一个输出.
			}
	
	}

}




