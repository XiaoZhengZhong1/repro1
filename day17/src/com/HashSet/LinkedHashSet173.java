package com.HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet173 {
/*###17.05_集合框架(LinkedHashSet的概述和使用)
* A:LinkedHashSet的特点
* B:案例演示
	* LinkedHashSet的特点
		* 底层是由链表实现的,是Set集合类中唯一,可以保证怎么存就怎么取 .
		* 因为是hashSet的子类,所以也不能重复,保证元素唯一,与HashSet原理一样.*/

	public static void main(String[] args) {
		LinkedHashSet<String>  LHS = new LinkedHashSet<>();	//创建LinkedHashSet对象.
						LHS.add("a");
						LHS.add("a");
						
						LHS.add("b");
						LHS.add("b");
						LHS.add("c");
						LHS.add("d");
					System.out.print(LHS + ",");	//[a, b, c, d],
	
	}

}
