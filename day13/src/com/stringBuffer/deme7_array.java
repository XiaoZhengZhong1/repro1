package com.stringBuffer;

import java.util.Arrays;

public class deme7_array {

	public static void main(String[] args) {
/*###13.18_常见对象(Arrays类的概述和方法使用)
* A:Arrays类概述
	* 针对数组进行操作的工具类。
	* 提供了排序，查找等功能。
* B:成员方法
	* public static String toString(int[] a)
	* public static void sort(int[] a)
	* public static int binarySearch(int[] a,int  key)
*/
//因为Arrayds类都是静态修饰,所以里面的方法也可以直接用类名调用.
	int[] arr = {11,44,66,77,55,33,22};
	//System.out.println(Arrays.toString(arr));//Arrays.toString(arr);类名.调用数组转 字符串的方法.
	
	Arrays.sort(arr);				//类名.调用数字排序的方法.先排序,再打印.
	//System.out.println(Arrays.toString(arr));	//先排序,再打印.
	
	
	int[] a = {11,22,33,44,55,66,77};//二分查找必须是有序数字.
	System.out.println(Arrays.binarySearch(a, 33));//表示查找a数组中,33的索引.
	//System.out.println(Arrays.binarySearch(a, 55));//表示查找a数组中,55的索引.
	//System.out.println(Arrays.binarySearch(a, 88));//表示查找a数组中,88的索引.
/*如果它包含在数组中，则返回搜索键的索引；否则返回 (-(插入点) - 1)。插入点就是数字长度.上面a数组长度是7.负插入点就是-7-1=-8
意思如果88要出现在a数组中,回出现在第八个插入点.	
*/
	}

}
