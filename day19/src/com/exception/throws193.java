package com.exception;

public class throws193 {
	/*###19.07_异常(throws的方式处理异常)
	* A:throws的方式处理异常
		* 定义功能方法时，需要把出现的问题暴露出来让调用者去处理。
		* 那么就通过throws在方法上标识。
	* B:案例演示
		* 举例分别演示编译时异常和运行时异常的抛出*/
	 public static void main(String[] agrs){	//注意如果主方法中没有 String[] agrs 就是没有Run运行窗口,无法运行.
		
		 	int age = 12;		
	if(age >= 200 | age <= 0){
		throw new RuntimeException("非法年龄");	//表示如果年龄不符合上面要求,就抛出运行异常,
	
	} else{
		System.out.println(age);
	}
		
	 }
}
/*###19.08_异常(throw的概述以及和throws的区别)
* A:throw的概述
	* 在功能方法内部出现某种情况，程序不能继续运行，需要进行跳转时，就用throw把异常对象抛出。
* B:案例演示	
	* 分别演示编译时异常对象和运行时异常对象的抛出
* C:throws和throw的区别
	* a:throws
		* 用在方法声明后面，跟的是异常类名
		* 可以跟多个异常类名，用逗号隔开
		* 表示抛出异常，由该方法的调用者来处理
	* b:throw
		* 用在方法体内，跟的是异常对象名
		* 只能抛出一个异常对象名
		* 表示抛出异常，由方法体内的语句处理*/
