package com.HashMap;

import java.util.ArrayList;
import java.util.Collections;




/*###18.11_集合框架(Collections工具类的概述和常见方法讲解)
* A:Collections类概述
	* 针对集合操作 的工具类
* B:Collections成员方法
* 
	1	public static <T> void sort(List<T> list)	//给list元素进行排序.
	2	public static <T> int binarySearch(List<?> list,T key)	//给list元素进行二分查找,找到元素对应的索引.
	3	public static <T> T max(Collection<?> coll)		//获取list中是最大值,根据字典排序.
	4	public static void reverse(List<?> list) 	//反转list中的元素.
	5	public static void shuffle(List<?> list)*/	//给list中的元素进行随机洗牌.
//首先它是一个类,类里面所有的方法都是静态的,只能用类名点进行调用,方法主要是针对List集合接口的
	public class collections186 {
	public static void main(String[] args){
		ArrayList<String> aL = new ArrayList<>();
			aL.add("b");
			aL.add("b");
			aL.add("d");
			aL.add("a");
			aL.add("c");
//1:排序功能.
			Collections.sort(aL);	//得先排序再输出.
			System.out.println(aL);	//[a, b, b, c, d]

//2:二分查找法.
			System.out.println(Collections.binarySearch(aL, "d"));	//4索引. 因为b重复了占了1和2索引.
	
//3:获取最大值.
			System.out.println(Collections.max(aL));	//d ,	String重新了比较方法,按字典排序.
	
//4:反转集合元素.	
			Collections.reverse(aL);	//得先反转再输出
			System.out.println(aL);		//[d, c, b, b, a]
	
//5:	
			Collections.shuffle(aL);	//得先随机洗牌,才能打印.
			System.out.println(aL);		//[d, b, c, a, b]

	}
}