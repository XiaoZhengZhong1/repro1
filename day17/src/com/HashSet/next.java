package com.HashSet;

import java.util.HashSet;
import java.util.Random;

public class next {
	/*###17.06_集合框架(产生10个1-20之间的随机数要求随机数不能重复)
	* A:案例演示
		* 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。*/
	public static void main(String[] args) {
/*1:要求随机数,就要创建Random类对象.
 *2:要求不能重复,那就用HashSet创建对象存储随机数.
 * 3:要求获取10个,就限制sizs()的长度,表示<10.Random类中的next(n)方法.能表示0到n的随机数
 * 4:要求输出,就用遍历打印.
 * 
 * */
		
		Random r = new Random();
		HashSet<Integer> H = new HashSet<>();
		while(H.size() < 10){			//表示如果集合长度没满10个,就能继续下面的添加.
			H.add(r.nextInt(20) + 1);	//表示添加随机类中的获取随机数方法,获取0到20的随机数,+1表示能获取包含20的随机数.
			}
		for (Integer integer : H) {		//遍历在控制台输出
			System.out.print(integer + ",");	//16,19,3,4,20,5,7,10,14,15,
		}
	}

}
