package com.regex;

import java.util.Arrays;

public class next141 {

	public static void main(String[] args) {
/*##14.06_常见对象(把给定字符串中的数字排序)
* A:案例演示
	* 需求：我有如下一个字符串:”91 27 46 38 50”，请写代码实现最终输出结果是：”27 38 46 50 91”
	*/
/*题目分析:首先把原始值定义成字符串,再切割成字符串数组,再定义一个同样长度的int[]数组,再把字符串数组遍历,把遍历的每个字符串转换成int并	
 保存到int[]数组中.再排序Arrays.sort()再new一个StringBuilder对象,把int[]遍历,把遍历的结果用append添加到对象中,有空格的加空格.					*/
//1:定义原始字符串String a.
//2:把原始字符串切割split赋值给字符串数组String[] a1 = a.split(" ");	
//3:定义一个同样长度的int[] a2 = new int[a1.length] .	
//4:for遍历字符串数组.
//5:把遍历的每个字符串转换成int数组里的字符.a2[i] = Integer.parseInt(a1[i])
//6:再把a2进行排序,Arrays.sort(a2);
//6:new一个StringBuilder对象.StringBuilder a3 = new StringBuilder();	
//7:用for遍历a2,再把a2[i]添加给a3,  a3.append(a2[i]);	
	
	String a = "91 27 46 38 50";
	String[] a1 = a.split(" ");
	   int[] a2 = new int[a1.length];
	   		for (int i = 0; i < a1.length; i++) {
				a2[i] = Integer.parseInt(a1[i]);
			}
	   		Arrays.sort(a2);
	StringBuilder a3 = new StringBuilder();
		for (int i = 0; i < a2.length; i++) {
			if(a2[i] == a2.length-1){
				a3.append(a2[i]);
			}else{
				a3.append(a2[i] + " ");
				}
		
		}
		System.out.println(a3);
	
	
	
	
	
	}

}
