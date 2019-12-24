package com.枚举;
/*
 *###27.13_JDK5新特性(自己实现枚举类)
* A:枚举概述
	* 是指将变量的值一一列出来,变量的值只限于列举出来的值的范围内。举例：一周只有7天，一年只有12个月等。
* B:回想单例设计模式：单例类是一个类只有一个实例
	* 那么多例类就是一个类有多个实例，但不是无限个数的实例，而是有限个数的实例。这才能是枚举类。
* C:案例演示
	* 自己实现枚举类
 */
public class week {	//创建枚举类有3种方式.1:在本类用空参构造创建对象.
	private week(){}//和单列类一样,枚举相当于是多列类.有限的多列类.所以也是一样所以构造方法,不让其它类创建本类对象.只能类名调用获取

	public static final week mon = new week();
	public static final week tue = new week();
	public static final week wed = new week();

}
