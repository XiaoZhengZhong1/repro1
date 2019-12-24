package com.exception;

public class try192_catch_finally {
/*###19.03_异常(try...catch的方式处理异常1)
* A:异常处理的两种方式
	* a:try…catch…finally	try是用来检测异常的.  catch是捕获异常的.	finally是释放资源的.
		try的三种搭配方式,
		1* try catch
		2* try catch finally
		3* try finally 
	* b:throws
* B:try...catch处理异常的基本格式
	* try…catch…finally
* C:案例演示
	* try...catch的方式处理1个异常*/
	public static void main(String[] args) {
//上节讲了除0异常,现在用1:try catch,检测捕捉处理这异常.
		demo2 c = new demo2();
		try{	int d = c.division(10, 0);//表示检测这行代码,是否有异常,如果没异常,也可以正常运行try{}catch(){}不影响运行 
			System.out.println(d);
		}catch(ArithmeticException e){		//表示把异常捕获到()中,e是自定义的变量,异常不也得有名称啊.
			System.out.println("是有问题");	//表示只有有异常并且检测捕捉到了,才会输出该语句.
		}
//try{} catch(){} 检测捕捉的好处是,检测捕捉后,后面的代码依旧能运行,虽然问题没解决,		
		System.out.println("我能输出吗");
	}
		
}
class demo2{
	public int division(int a ,int b){
		return a / b;
	}
}
/*###19.04_异常(try...catch的方式处理异常2)
* A:案例演示
	* try...catch的方式处理多个异常
	* JDK7以后处理多个异常的方式及注意事项*/
/*如果try要检测多行代码,后面就要跟多个catch,检测的代码和捕获的异常要一一对应,也可以在catch(exception e)表示能接收所有的异常,
 * 建议try一行代码跟一个catch,检测和异常按从小到大排序,    JDK1.7处理异常可以try两个跟一个catch( | )在里面加个"与"就是或者,
 * 
 * */


/*
 * ###19.05_异常(编译期异常和运行期异常的区别)
* A:编译期异常和运行期异常的区别
	* Java中的异常被分为两大类：编译时异常和运行时异常。
	* 所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常就是编译时异常
	
	* 编译时异常
		* Java程序必须显示处理，否则程序就会发生错误，无法通过编译
	* 运行时异常
		* 无需显示处理，也可以和编译时异常一样处理
* B:案例演示
	* 编译期异常和运行期异常的区别
 * 		运行异常是程序员自己犯的错.运行异常在编译就是写代码的时候是不用处理的,运行后才需要处理.
 * 		编译异常就是系统提醒有可能出现的异常,必须try{}catch(exception e){}程序才能运行.
 * */



