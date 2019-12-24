package com.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_aslist {
/*###16.18_集合框架(Arrays工具类的asList()方法的使用)(掌握)
* A:案例演示
	* Arrays工具类的asList()方法的使用
	* Collection中toArray(T[] a)泛型版的集合转数组*/
	public static void main(String[] args) {
//1:将字符串数组转换成集合.		
		String[] S = {"a","b","c","d"}; 
			List<String> L= Arrays.asList(S); //将数组转换成集合,Arrays工具类的asList()方法
				//	L.add("e");		此行会报错,数组转集合后,不能使用增加和删除方法,但是集合的其它方法都是可以使用的.
			System.out.println(L);	//[a, b, c, d]
	
//2:将基本数据类型转成集合.
	int[] a = {1,2,3,4,5};
		List<int[]> L1 = Arrays.asList(a);/*上行List<String>泛型里没加[]是因为字符串数组里面的每个字符串都是引用数据
		类型,都能代表一个对象,所以String引用数据类型本身就是符合集合的.而int是基本数据类型,集合里不能存储基本数据类型,int[]
		能当作是对象,给自动封装.*/
	System.out.println(L1);	//[[I@1d1e730]------证明基本数据类型转换成集合,会将整个数组当成引用数据类型封装成地址对象
	
	Integer[] a1 = {6,7,8,9,10};
		List<Integer> L2 = Arrays.asList(a1);	//数组转集合,必须是引用数据类型,八种基本数据类型调用自己的包装对象类
	System.out.println(L2);	//[6, 7, 8, 9, 10]
	
	System.out.println();	//换行
//3:将集合转换成数组,带泛型.
	ArrayList<String> A3 = new ArrayList<>();	//创建集合对象.
			A3.add("a");
			A3.add("s");
			A3.add("d");
			A3.add("f");
	String[] S3 = A3.toArray(new String[6]);	/*表示把集合转换从数组对象,toArray()括号里,提示需要数组对象,因为泛型里
	定义的是String,所以就new一个String对象,数组长度自定义,当[]长度<=集合A3长度时,取集合的长度,当数组[]长度>=集合A3长度,取数组*/
	for (int i = 0; i < S3.length; i++) {
		System.out.print(S3[i] + ",");	//a,s,d,f,null,null,
	}
	}

}
