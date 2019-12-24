package com.System1;

import java.math.BigDecimal;

public class BigDecimal_1 {

	public static void main(String[] args) {
/*###14.15_常见对象(BigDecimal类的概述和方法使用)
* A:BigDecimal的概述
	* 由于在运算的时候，float类型和double很容易丢失精度，演示案例。
	* 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal

	* 不可变的、任意精度的有符号十进制数。
* B:构造方法
	* public BigDecimal(String val)
* C:成员方法
	* public BigDecimal add(BigDecimal augend)
	* public BigDecimal subtract(BigDecimal subtrahend)
	* public BigDecimal multiply(BigDecimal multiplicand)
	* public BigDecimal divide(BigDecimal divisor)
* D:案例演示
	* BigDecimal类的构造方法和成员方法使用*/
//BigDecimal类的构造方法和成员方法.在做小数运算时结果更准确.前提是输入的是字符串形式或者调用BigDecimal.valueOf(2.0);方法.
	BigDecimal b = new BigDecimal("2.0");
	BigDecimal b1 = new BigDecimal("1.1");
	System.out.println(b.subtract(b1));//b-b1=0.9
	
	BigDecimal b2 = BigDecimal.valueOf(2.0);
	BigDecimal b3 = BigDecimal.valueOf(1.1);
	System.out.println(b2.subtract(b3));//b2-b3=0.9
	}

}
