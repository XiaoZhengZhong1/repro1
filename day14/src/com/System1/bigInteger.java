package com.System1;

import java.math.BigInteger;

public class bigInteger {

	public static void main(String[] args) {
/*###14.14_常见对象(BigInteger类的概述和方法使用)
* A:BigInteger的概述
	* 可以让超过Integer范围内的数据进行运算
* B:构造方法
	* public BigInteger(String val)
* C:成员方法
	* public BigInteger add(BigInteger val)		加+
	* public BigInteger subtract(BigInteger val) 减-
	* public BigInteger multiply(BigInteger val)	乘*
	* public BigInteger divide(BigInteger val) 除/
	* public BigInteger[] divideAndRemainder(BigInteger val)取除数和余数.
*/
	//BigInteger的概述可以存任意类型的整数,任意大整数.传入字符串结果更准确.
	BigInteger a = new BigInteger("100");
	BigInteger a1 = new BigInteger("100");
	System.out.println(a.add(a1));//200
	
	
	}

}
