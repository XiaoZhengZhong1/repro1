package com.枚举2;
public class Enum {
/*
 * ###27.16_JDK5新特性(枚举类的常见方法)
* A:枚举类的常见方法
	* int ordinal()	//代表枚举是有编号的.
	* int compareTo(E o)	//表示比较索引编号.
	* String name()			//获取实例名称.
	* String toString()		//获取重写之后的toString方法.
	* <T> T valueOf(Class<T> type,String name)  //静态方法,需要类名点调用.表示通过字节码对象获取枚举项对应的值.
	* values() 
	* 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
* B:案例演示
	* 枚举类的常见方法

 * */
	public static void main(String[] args) {
		we2 m = we2.mo2;
		we2 t = we2.tu2;
		we2 w = we2.we2;
	//* int ordinal()	//代表枚举是有编号的.	
		System.out.println(m.ordinal());	//0
		System.out.println(t.ordinal());	//1
		System.out.println(w.ordinal());	//2
	
	//int compareTo(E o)	//表示比较编号.
		System.out.println(m.compareTo(t));//表示0-1   -1
		System.out.println(m.compareTo(w));//表示0-2   -2
	
	//* String name()			//获取实例名称.
		System.out.println(m.getName());//获取实例名称.
		System.out.println(m.toString());//获取重写之后的toString方法.
	
	
	//* <T> T valueOf(Class<T> type,String name)  //表示通过字节码对象获取枚举项对应的值.
			we m2 = we.valueOf(we.class, "mo");//类名点调用静态方法.通过字节码对象和枚举项,获取对应的值
				System.out.println(m2);
	
	//* values 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
				we[] arr = we.values();
					for (we we3 : arr) {
						System.out.println(we3);
					}
	
	}

}
