package com.HashSet;

import java.util.HashSet;

public class HashSet171 {

	public static void main(String[] args) {
/*###17.01_集合框架(HashSet存储字符串并遍历)
* A:Set集合概述及特点
	* 通过API查看即可
* B:案例演示
	* HashSet存储字符串并遍历
	* */
	 	HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");			//当存储不成功的时候,返回false
		System.out.println(hs); 	//[a]	证明重复的值没有添加进去.
		System.out.println(b1);		//true	
		System.out.println(b2);		//false	证明重复时添加失败.
			hs.add("b");
			hs.add("c");
			hs.add("d");
			hs.add("e");
			for(String s : hs) {		//只要能用迭代的都能用增强for循环.
			System.out.print(s + ",");	/*d,e,b,c,a,	证明是无顺序的.能输出字符,说明HashSet继承体系中重写了toString
因为HashSet是Set的子类,Set是collection的子类,HashSet是最底层的类,能继承整个体系中,所有非私有的方法*/	
			}
	}

}
