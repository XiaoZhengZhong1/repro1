package com.exception;

public class exception191 {
	/*###19.01_异常(异常的概述和分类)
	* A:异常的概述
		* 异常就是Java程序在运行过程中出现的错误。
	* B:异常的分类
		* 通过API查看Throwable
		* Error
			* 服务器宕机,数据库崩溃等
		* Exception
	C:异常的继承体系
		* Throwable
			* Error	
			* Exception
				* RuntimeException*/

	public static void main(String[] args) {
//示范异常,学习查找异的方法.看异常要从异常的最底下代码往上看.
		demo c = new demo();
		int d = c.division(10,0);	//因为系统规定除数不能为0,所以运行异常.
		System.out.println(d);
/*输出结果如下,
 * Exception in thread "main" java.lang.ArithmeticException: / by zero	//表示这个是除0异常的类在API中
at com.exception.demo.division(exception1.java:38)	//表示运行了第38行(相除)才导致异常,
at com.exception.exception1.main(exception1.java:21)	//表示异常问题的源头在第21行代码(赋值)
*/
	
	}
	
}
class demo {
public  int division(int a,int b){
		
		return a / b;
	}
		
}
/*###19.02_异常(JVM默认是如何处理异常的)
* A:JVM默认是如何处理异常的
	* main函数收到这个问题时,有两种处理方式:
	* a:自己将该问题处理,然后继续运行
	* b:自己没有针对的处理方式,只有交给调用main的jvm来处理
	* jvm有一个默认的异常处理机制,就将该异常进行处理.
	* 并将该异常的名称,异常的信息.异常出现的位置打印在了控制台上,同时将程序停止运行
* B:案例演示
	* JVM默认如何处理异常*/