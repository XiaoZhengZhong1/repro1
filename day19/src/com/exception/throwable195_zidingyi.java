package com.exception;

public class throwable195_zidingyi {
	/*###19.11_异常(自定义异常概述和基本使用)
	* A:为什么需要自定义异常  -----为了定义名称,好显示和区分异常内容.
		* 举例：人的年龄
	* B:自定义异常概述
		* 继承自Exception		//继承编译异常,就必须处理.
		* 继承自RuntimeException	//继承运行异常可以编译时不处理,运行后在处理.
	* C:案例演示
		* 自定义异常的基本使用*/

	public static void main(String[] args) {

	}

}
@SuppressWarnings("serial")
class  AgeOutofBoundsException extends Exception{	/*表示自定义了一个年龄超出范围的异常,重写了空参和有参构造
													以后如果遇到年龄超出异常的就可以抛出自定义的年龄异常了
*/

	public AgeOutofBoundsException() {
		super();
		
	}

	public AgeOutofBoundsException(String message) {
		super(message);
		
	}
	
}