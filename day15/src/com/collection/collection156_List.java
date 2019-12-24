package com.collection;

import java.util.ArrayList;
import java.util.List;

public class collection156_List {
	/*###15.09_集合框架(List集合的特有功能概述和测试)
	* A:List集合的特有功能概述
		* void add(int index,E element)	//在指定索引添加,添加元素.
		* E remove(int index)	//通过指定索引删除元素
		* E get(int index)	//获取指定索引位置的元素.
		* E set(int index,E element)	//修改指定索引的元素
		* */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List L = new ArrayList();
//1:* void add(int index,E element)//在指定索引添加,添加元素.但是索引index必须<=size并且index>=0
			L.add("a");
			L.add("b");
			L.add("c");
			L.add("d");
			System.out.println(L);	//[a, b, c, d]
			L.add(2, "WWW");	//在指定索引2,添加字符串"www"-----但是索引index必须<=size并且index>=0
			System.out.println(L);	//[a, b, WWW, c, d]
	
//2:* E remove(int index)//通过指定索引删除元素	
 Object obj = L.remove(2);	//删除指定索引2,对应的元素.remove()方法,返回的是Object,注意如添加的是整数,删除也是指定索引
			System.out.println(obj);	//WWW
			System.out.println(L);	//[a, b, c, d]
	
//3:* E get(int index)	//获取指定索引位置的元素.	
			Object Obj1 = L.get(2);	//获取指定索引2,对应的元素
			System.out.println(Obj1);	//c
			System.out.println(L);	//[a, b, c, d]
			for (int i = 0; i < L.size(); i++) {	//也可以用List独有的get()方法,遍历.
				System.out.println(L.get(i));
			}
	
//*4: E set(int index,E element)	//修改指定索引的元素
			Object Obj2 = L.set(0, "qqqq");	//修改指定0索引对应的元素,改成"qqqq"
			System.out.println(Obj2);	//a
			System.out.println(L);	//[qqqq, b, c, d]
	}

}
