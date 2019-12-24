package com.test;

import java.math.BigInteger;

public class test06 {
	/*###23.06_递归练习(1000的阶乘所有零和尾部零的个数)
	* 需求:求出1000的阶乘所有零和尾部零的个数,不用递归做
	*1:因为1000的阶乘就是1*2*3*4*5*6.....1000,结果是一个几百位数的数字,只能用BigInteger才能装得下.要从1开始,就把1封装成
	*BigInteger对象.再写一个for循环.把循环变量也定义成BigInteger.在循环中做阶乘运算. 
	* 2:把阶乘结果转换成字符串.定义一个int变量.用做计数器.,遍历字符串,判断是否包含'0'字符,包含就计数器++,就能获取所有的0的个数
	* 3:获取尾部0的个数.把阶乘结果字符串封装到StringBuilder参数中.创建StringBuilder对象.
	* 4:调用反转方法,把字符串进行反转.这样尾部的0就到前面去了.
	* 5:遍历字符串.做if判断.如果!=0就break跳出
	* 
	* */
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("1");	
		for (int i = 1; i <= 1000; i++) {	//注意此处是小于等于1000.因为1000本身也是要相乘的
			BigInteger bi2 = new BigInteger(i + "");	
				bi = bi.multiply(bi2);					
		}
		String str = bi.toString();	
		StringBuilder sb = new StringBuilder(str);	//把阶乘字符串封装成字符串缓冲区对象.
				str = sb.reverse().toString();	//表示表示缓冲区对象反转并转换成字符串.
				int in2 = 0;					//定义计数器,
				for (int i = 0; i < str.length(); i++) {
				if('0' != str.charAt(i)){		//表示字符串中索引对应的字符如果不包含0字符,就跳出结束循环,
					break;
				}else{
					in2++;
				}
			}		
				System.out.println(in2);
	
	}
//demo();获取1000阶乘所有的0,
	public static void demo() {
		BigInteger bi = new BigInteger("1");	//因为BigInteger参数里面只能装字符串.
		for (int i = 1; i < 1000; i++) {
			BigInteger bi2 = new BigInteger(i + "");	//只能装字符串,就要用空窜相连.
				bi = bi.multiply(bi2);					//所有相乘的方法,
		}
			String str = bi.toString();					//把结果转换成字符串.
			int in = 0;
			for (int i = 0; i < str.length(); i++) {
				if('0' == str.charAt(i)){					//表示如果变量中有等于0字符的,就加1
					in++;
				}
			
			}
			System.out.println(in);
	}

}
