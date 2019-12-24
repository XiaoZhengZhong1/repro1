package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList161 {
	/*###16.01_集合框架(去除ArrayList中重复字符串元素方式)(掌握)
	* A:案例演示
		* 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
		* 思路：创建新集合方式*/
/*1:创建题目需要的老集合.
 * 2:写一个获取元素的方法.里面新键一个空集合,迭代(遍历)老集合,并判断新集合中是否包含老集合元素,不包含就添加.最后返回这个新数组.
 * 3:在主方法中显示,新创建数组=获取元素方法中的获取元素.即返回值.
 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList A = new ArrayList();//题目需要老集合
				A.add("a");
				A.add("a");
				A.add("b");
				A.add("b");
				A.add("c");
				A.add("c");
				A.add("d");
				A.add("d");
			ArrayList A1 = get(A);	//表示新集合就是方法中返回结果,也算是调用方法.
			System.out.println(A1);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList get(ArrayList A){
		ArrayList A1 = new ArrayList();	//除去重复需要的新集合.
		Iterator I = A.iterator();		//获取迭代器,老集合里有元素所有是用老集合调用	
		while(I.hasNext()){				//表示如果有元素就继续下面操作
			 Object O = I.next();		//迭代下一个元素,从0索引开始.并把每个元素赋值给O
			 if(!A1.contains(O)){		//判断新集合中是否包含迭代器中老集合的元素,不包含就继续执行.
				 A1.add(O);				//把这个不包含的元素添加到新集合中.
			 }
		}
		return A1;
		}
}
