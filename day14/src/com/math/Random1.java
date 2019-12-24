package com.math;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
/*###14.12_常见对象(Random类的概述和方法使用)
* A:Random类的概述
	* 此类用于产生随机数如果用相同的种子创建两个 Random 实例，
	* 则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。
* B:构造方法
	* public Random()
	* public Random(long seed)
* C:成员方法
	* public int nextInt()
	* public int nextInt(int n)(重点掌握);
*/
//nextInt(int n)返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
		Random a = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(a.nextInt(100));//意思是输出0到100包括0的随机数.上面for循环10次,就会输出10个不同随机数,
		}
	}

}
